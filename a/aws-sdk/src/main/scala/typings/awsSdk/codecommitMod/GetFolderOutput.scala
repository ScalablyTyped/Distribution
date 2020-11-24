package typings.awsSdk.codecommitMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
  def apply(commitId: ObjectId, folderPath: Path): GetFolderOutput = {
    val __obj = js.Dynamic.literal(commitId = commitId.asInstanceOf[js.Any], folderPath = folderPath.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetFolderOutput]
  }
  
  @scala.inline
  implicit class GetFolderOutputOps[Self <: GetFolderOutput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setCommitId(value: ObjectId): Self = this.set("commitId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFolderPath(value: Path): Self = this.set("folderPath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilesVarargs(value: File*): Self = this.set("files", js.Array(value :_*))
    
    @scala.inline
    def setFiles(value: FileList): Self = this.set("files", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFiles: Self = this.set("files", js.undefined)
    
    @scala.inline
    def setSubFoldersVarargs(value: Folder*): Self = this.set("subFolders", js.Array(value :_*))
    
    @scala.inline
    def setSubFolders(value: FolderList): Self = this.set("subFolders", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSubFolders: Self = this.set("subFolders", js.undefined)
    
    @scala.inline
    def setSubModulesVarargs(value: SubModule*): Self = this.set("subModules", js.Array(value :_*))
    
    @scala.inline
    def setSubModules(value: SubModuleList): Self = this.set("subModules", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSubModules: Self = this.set("subModules", js.undefined)
    
    @scala.inline
    def setSymbolicLinksVarargs(value: SymbolicLink*): Self = this.set("symbolicLinks", js.Array(value :_*))
    
    @scala.inline
    def setSymbolicLinks(value: SymbolicLinkList): Self = this.set("symbolicLinks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSymbolicLinks: Self = this.set("symbolicLinks", js.undefined)
    
    @scala.inline
    def setTreeId(value: ObjectId): Self = this.set("treeId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTreeId: Self = this.set("treeId", js.undefined)
  }
}
