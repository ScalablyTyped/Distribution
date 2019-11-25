package typings.atAwsDashSdkClientDashCodecommitDashNode.typesGetFolderOutputMod

import typings.atAwsDashSdkClientDashCodecommitDashNode.typesOutputTypesUnionMod.OutputTypesUnion
import typings.atAwsDashSdkClientDashCodecommitDashNode.typesUnderscoreFileMod._UnmarshalledFile
import typings.atAwsDashSdkClientDashCodecommitDashNode.typesUnderscoreFolderMod._UnmarshalledFolder
import typings.atAwsDashSdkClientDashCodecommitDashNode.typesUnderscoreSubModuleMod._UnmarshalledSubModule
import typings.atAwsDashSdkClientDashCodecommitDashNode.typesUnderscoreSymbolicLinkMod._UnmarshalledSymbolicLink
import typings.atAwsDashSdkTypes.buildResponseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetFolderOutput extends OutputTypesUnion {
  /**
    * Metadata about the response received, including the HTTP status code, HTTP headers, and any request identifiers recognized by the SDK.
    */
  @JSName("$metadata")
  var $metadata: ResponseMetadata
  /**
    * <p>The full commit ID used as a reference for which version of the folder content is returned.</p>
    */
  var commitId: String
  /**
    * <p>The list of files that exist in the specified folder, if any.</p>
    */
  var files: js.UndefOr[js.Array[_UnmarshalledFile]] = js.undefined
  /**
    * <p>The fully-qualified path of the folder whose contents are returned.</p>
    */
  var folderPath: String
  /**
    * <p>The list of folders that exist beneath the specified folder, if any.</p>
    */
  var subFolders: js.UndefOr[js.Array[_UnmarshalledFolder]] = js.undefined
  /**
    * <p>The list of submodules that exist in the specified folder, if any.</p>
    */
  var subModules: js.UndefOr[js.Array[_UnmarshalledSubModule]] = js.undefined
  /**
    * <p>The list of symbolic links to other files and folders that exist in the specified folder, if any.</p>
    */
  var symbolicLinks: js.UndefOr[js.Array[_UnmarshalledSymbolicLink]] = js.undefined
  /**
    * <p>The full SHA-1 pointer of the tree information for the commit that contains the folder.</p>
    */
  var treeId: js.UndefOr[String] = js.undefined
}

object GetFolderOutput {
  @scala.inline
  def apply(
    $metadata: ResponseMetadata,
    commitId: String,
    folderPath: String,
    files: js.Array[_UnmarshalledFile] = null,
    subFolders: js.Array[_UnmarshalledFolder] = null,
    subModules: js.Array[_UnmarshalledSubModule] = null,
    symbolicLinks: js.Array[_UnmarshalledSymbolicLink] = null,
    treeId: String = null
  ): GetFolderOutput = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], commitId = commitId.asInstanceOf[js.Any], folderPath = folderPath.asInstanceOf[js.Any])
    if (files != null) __obj.updateDynamic("files")(files.asInstanceOf[js.Any])
    if (subFolders != null) __obj.updateDynamic("subFolders")(subFolders.asInstanceOf[js.Any])
    if (subModules != null) __obj.updateDynamic("subModules")(subModules.asInstanceOf[js.Any])
    if (symbolicLinks != null) __obj.updateDynamic("symbolicLinks")(symbolicLinks.asInstanceOf[js.Any])
    if (treeId != null) __obj.updateDynamic("treeId")(treeId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetFolderOutput]
  }
}

