package typings.awsSdkClientCodecommitNode

import typings.awsSdkClientCodecommitNode.outputTypesUnionMod.OutputTypesUnion
import typings.awsSdkClientCodecommitNode.typesFileMod.UnmarshalledFile
import typings.awsSdkClientCodecommitNode.typesFolderMod.UnmarshalledFolder
import typings.awsSdkClientCodecommitNode.typesSubModuleMod.UnmarshalledSubModule
import typings.awsSdkClientCodecommitNode.typesSymbolicLinkMod.UnmarshalledSymbolicLink
import typings.awsSdkTypes.responseMod.ResponseMetadata
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesGetFolderOutputMod {
  
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
    implicit class GetFolderOutputMutableBuilder[Self <: GetFolderOutput] (val x: Self) extends AnyVal {
      
      @scala.inline
      def set$metadata(value: ResponseMetadata): Self = StObject.set(x, "$metadata", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCommitId(value: String): Self = StObject.set(x, "commitId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFiles(value: js.Array[UnmarshalledFile]): Self = StObject.set(x, "files", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFilesUndefined: Self = StObject.set(x, "files", js.undefined)
      
      @scala.inline
      def setFilesVarargs(value: UnmarshalledFile*): Self = StObject.set(x, "files", js.Array(value :_*))
      
      @scala.inline
      def setFolderPath(value: String): Self = StObject.set(x, "folderPath", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSubFolders(value: js.Array[UnmarshalledFolder]): Self = StObject.set(x, "subFolders", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSubFoldersUndefined: Self = StObject.set(x, "subFolders", js.undefined)
      
      @scala.inline
      def setSubFoldersVarargs(value: UnmarshalledFolder*): Self = StObject.set(x, "subFolders", js.Array(value :_*))
      
      @scala.inline
      def setSubModules(value: js.Array[UnmarshalledSubModule]): Self = StObject.set(x, "subModules", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSubModulesUndefined: Self = StObject.set(x, "subModules", js.undefined)
      
      @scala.inline
      def setSubModulesVarargs(value: UnmarshalledSubModule*): Self = StObject.set(x, "subModules", js.Array(value :_*))
      
      @scala.inline
      def setSymbolicLinks(value: js.Array[UnmarshalledSymbolicLink]): Self = StObject.set(x, "symbolicLinks", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSymbolicLinksUndefined: Self = StObject.set(x, "symbolicLinks", js.undefined)
      
      @scala.inline
      def setSymbolicLinksVarargs(value: UnmarshalledSymbolicLink*): Self = StObject.set(x, "symbolicLinks", js.Array(value :_*))
      
      @scala.inline
      def setTreeId(value: String): Self = StObject.set(x, "treeId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTreeIdUndefined: Self = StObject.set(x, "treeId", js.undefined)
    }
  }
}
