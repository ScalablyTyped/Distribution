package typings.awsSdk.codecommitMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetFolderOutput extends js.Object {
  /**
    * The full commit ID used as a reference for the returned version of the folder content.
    */
  var commitId: ObjectId = js.native
  /**
    * The list of files in the specified folder, if any.
    */
  var files: js.UndefOr[FileList] = js.native
  /**
    * The fully qualified path of the folder whose contents are returned.
    */
  var folderPath: Path = js.native
  /**
    * The list of folders that exist under the specified folder, if any.
    */
  var subFolders: js.UndefOr[FolderList] = js.native
  /**
    * The list of submodules in the specified folder, if any.
    */
  var subModules: js.UndefOr[SubModuleList] = js.native
  /**
    * The list of symbolic links to other files and folders in the specified folder, if any.
    */
  var symbolicLinks: js.UndefOr[SymbolicLinkList] = js.native
  /**
    * The full SHA-1 pointer of the tree information for the commit that contains the folder.
    */
  var treeId: js.UndefOr[ObjectId] = js.native
}

object GetFolderOutput {
  @scala.inline
  def apply(
    commitId: ObjectId,
    folderPath: Path,
    files: FileList = null,
    subFolders: FolderList = null,
    subModules: SubModuleList = null,
    symbolicLinks: SymbolicLinkList = null,
    treeId: ObjectId = null
  ): GetFolderOutput = {
    val __obj = js.Dynamic.literal(commitId = commitId.asInstanceOf[js.Any], folderPath = folderPath.asInstanceOf[js.Any])
    if (files != null) __obj.updateDynamic("files")(files.asInstanceOf[js.Any])
    if (subFolders != null) __obj.updateDynamic("subFolders")(subFolders.asInstanceOf[js.Any])
    if (subModules != null) __obj.updateDynamic("subModules")(subModules.asInstanceOf[js.Any])
    if (symbolicLinks != null) __obj.updateDynamic("symbolicLinks")(symbolicLinks.asInstanceOf[js.Any])
    if (treeId != null) __obj.updateDynamic("treeId")(treeId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetFolderOutput]
  }
}

