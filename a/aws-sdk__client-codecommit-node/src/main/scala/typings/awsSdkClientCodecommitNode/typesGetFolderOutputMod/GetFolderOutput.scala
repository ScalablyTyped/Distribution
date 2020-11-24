package typings.awsSdkClientCodecommitNode.typesGetFolderOutputMod

import typings.awsSdkClientCodecommitNode.outputTypesUnionMod.OutputTypesUnion
import typings.awsSdkClientCodecommitNode.typesFileMod.UnmarshalledFile
import typings.awsSdkClientCodecommitNode.typesFolderMod.UnmarshalledFolder
import typings.awsSdkClientCodecommitNode.typesSubModuleMod.UnmarshalledSubModule
import typings.awsSdkClientCodecommitNode.typesSymbolicLinkMod.UnmarshalledSymbolicLink
import typings.awsSdkTypes.responseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetFolderOutput extends OutputTypesUnion {
  
  /**
    * Metadata about the response received, including the HTTP status code, HTTP headers, and any request identifiers recognized by the SDK.
    */
  @JSName("$metadata")
  var $metadata: ResponseMetadata = js.native
  
  /**
    * <p>The full commit ID used as a reference for which version of the folder content is returned.</p>
    */
  var commitId: String = js.native
  
  /**
    * <p>The list of files that exist in the specified folder, if any.</p>
    */
  var files: js.UndefOr[js.Array[UnmarshalledFile]] = js.native
  
  /**
    * <p>The fully-qualified path of the folder whose contents are returned.</p>
    */
  var folderPath: String = js.native
  
  /**
    * <p>The list of folders that exist beneath the specified folder, if any.</p>
    */
  var subFolders: js.UndefOr[js.Array[UnmarshalledFolder]] = js.native
  
  /**
    * <p>The list of submodules that exist in the specified folder, if any.</p>
    */
  var subModules: js.UndefOr[js.Array[UnmarshalledSubModule]] = js.native
  
  /**
    * <p>The list of symbolic links to other files and folders that exist in the specified folder, if any.</p>
    */
  var symbolicLinks: js.UndefOr[js.Array[UnmarshalledSymbolicLink]] = js.native
  
  /**
    * <p>The full SHA-1 pointer of the tree information for the commit that contains the folder.</p>
    */
  var treeId: js.UndefOr[String] = js.native
}
object GetFolderOutput {
  
  @scala.inline
  def apply($metadata: ResponseMetadata, commitId: String, folderPath: String): GetFolderOutput = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], commitId = commitId.asInstanceOf[js.Any], folderPath = folderPath.asInstanceOf[js.Any])
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
    def set$metadata(value: ResponseMetadata): Self = this.set("$metadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCommitId(value: String): Self = this.set("commitId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFolderPath(value: String): Self = this.set("folderPath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilesVarargs(value: UnmarshalledFile*): Self = this.set("files", js.Array(value :_*))
    
    @scala.inline
    def setFiles(value: js.Array[UnmarshalledFile]): Self = this.set("files", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFiles: Self = this.set("files", js.undefined)
    
    @scala.inline
    def setSubFoldersVarargs(value: UnmarshalledFolder*): Self = this.set("subFolders", js.Array(value :_*))
    
    @scala.inline
    def setSubFolders(value: js.Array[UnmarshalledFolder]): Self = this.set("subFolders", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSubFolders: Self = this.set("subFolders", js.undefined)
    
    @scala.inline
    def setSubModulesVarargs(value: UnmarshalledSubModule*): Self = this.set("subModules", js.Array(value :_*))
    
    @scala.inline
    def setSubModules(value: js.Array[UnmarshalledSubModule]): Self = this.set("subModules", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSubModules: Self = this.set("subModules", js.undefined)
    
    @scala.inline
    def setSymbolicLinksVarargs(value: UnmarshalledSymbolicLink*): Self = this.set("symbolicLinks", js.Array(value :_*))
    
    @scala.inline
    def setSymbolicLinks(value: js.Array[UnmarshalledSymbolicLink]): Self = this.set("symbolicLinks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSymbolicLinks: Self = this.set("symbolicLinks", js.undefined)
    
    @scala.inline
    def setTreeId(value: String): Self = this.set("treeId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTreeId: Self = this.set("treeId", js.undefined)
  }
}
