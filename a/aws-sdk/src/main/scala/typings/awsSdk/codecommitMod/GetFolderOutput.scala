package typings.awsSdk.codecommitMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetFolderOutput extends StObject {
  
  /**
    * The full commit ID used as a reference for the returned version of the folder content.
    */
  var commitId: ObjectId
  
  /**
    * The list of files in the specified folder, if any.
    */
  var files: js.UndefOr[FileList] = js.undefined
  
  /**
    * The fully qualified path of the folder whose contents are returned.
    */
  var folderPath: Path
  
  /**
    * The list of folders that exist under the specified folder, if any.
    */
  var subFolders: js.UndefOr[FolderList] = js.undefined
  
  /**
    * The list of submodules in the specified folder, if any.
    */
  var subModules: js.UndefOr[SubModuleList] = js.undefined
  
  /**
    * The list of symbolic links to other files and folders in the specified folder, if any.
    */
  var symbolicLinks: js.UndefOr[SymbolicLinkList] = js.undefined
  
  /**
    * The full SHA-1 pointer of the tree information for the commit that contains the folder.
    */
  var treeId: js.UndefOr[ObjectId] = js.undefined
}
object GetFolderOutput {
  
  inline def apply(commitId: ObjectId, folderPath: Path): GetFolderOutput = {
    val __obj = js.Dynamic.literal(commitId = commitId.asInstanceOf[js.Any], folderPath = folderPath.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetFolderOutput]
  }
  
  extension [Self <: GetFolderOutput](x: Self) {
    
    inline def setCommitId(value: ObjectId): Self = StObject.set(x, "commitId", value.asInstanceOf[js.Any])
    
    inline def setFiles(value: FileList): Self = StObject.set(x, "files", value.asInstanceOf[js.Any])
    
    inline def setFilesUndefined: Self = StObject.set(x, "files", js.undefined)
    
    inline def setFilesVarargs(value: File*): Self = StObject.set(x, "files", js.Array(value :_*))
    
    inline def setFolderPath(value: Path): Self = StObject.set(x, "folderPath", value.asInstanceOf[js.Any])
    
    inline def setSubFolders(value: FolderList): Self = StObject.set(x, "subFolders", value.asInstanceOf[js.Any])
    
    inline def setSubFoldersUndefined: Self = StObject.set(x, "subFolders", js.undefined)
    
    inline def setSubFoldersVarargs(value: Folder*): Self = StObject.set(x, "subFolders", js.Array(value :_*))
    
    inline def setSubModules(value: SubModuleList): Self = StObject.set(x, "subModules", value.asInstanceOf[js.Any])
    
    inline def setSubModulesUndefined: Self = StObject.set(x, "subModules", js.undefined)
    
    inline def setSubModulesVarargs(value: SubModule*): Self = StObject.set(x, "subModules", js.Array(value :_*))
    
    inline def setSymbolicLinks(value: SymbolicLinkList): Self = StObject.set(x, "symbolicLinks", value.asInstanceOf[js.Any])
    
    inline def setSymbolicLinksUndefined: Self = StObject.set(x, "symbolicLinks", js.undefined)
    
    inline def setSymbolicLinksVarargs(value: SymbolicLink*): Self = StObject.set(x, "symbolicLinks", js.Array(value :_*))
    
    inline def setTreeId(value: ObjectId): Self = StObject.set(x, "treeId", value.asInstanceOf[js.Any])
    
    inline def setTreeIdUndefined: Self = StObject.set(x, "treeId", js.undefined)
  }
}
