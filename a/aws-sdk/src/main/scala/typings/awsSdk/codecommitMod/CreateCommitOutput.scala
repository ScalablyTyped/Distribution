package typings.awsSdk.codecommitMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateCommitOutput extends StObject {
  
  /**
    * The full commit ID of the commit that contains your committed file changes.
    */
  var commitId: js.UndefOr[ObjectId] = js.undefined
  
  /**
    * The files added as part of the committed file changes.
    */
  var filesAdded: js.UndefOr[FilesMetadata] = js.undefined
  
  /**
    * The files deleted as part of the committed file changes.
    */
  var filesDeleted: js.UndefOr[FilesMetadata] = js.undefined
  
  /**
    * The files updated as part of the commited file changes.
    */
  var filesUpdated: js.UndefOr[FilesMetadata] = js.undefined
  
  /**
    * The full SHA-1 pointer of the tree information for the commit that contains the commited file changes.
    */
  var treeId: js.UndefOr[ObjectId] = js.undefined
}
object CreateCommitOutput {
  
  inline def apply(): CreateCommitOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateCommitOutput]
  }
  
  extension [Self <: CreateCommitOutput](x: Self) {
    
    inline def setCommitId(value: ObjectId): Self = StObject.set(x, "commitId", value.asInstanceOf[js.Any])
    
    inline def setCommitIdUndefined: Self = StObject.set(x, "commitId", js.undefined)
    
    inline def setFilesAdded(value: FilesMetadata): Self = StObject.set(x, "filesAdded", value.asInstanceOf[js.Any])
    
    inline def setFilesAddedUndefined: Self = StObject.set(x, "filesAdded", js.undefined)
    
    inline def setFilesAddedVarargs(value: FileMetadata*): Self = StObject.set(x, "filesAdded", js.Array(value :_*))
    
    inline def setFilesDeleted(value: FilesMetadata): Self = StObject.set(x, "filesDeleted", value.asInstanceOf[js.Any])
    
    inline def setFilesDeletedUndefined: Self = StObject.set(x, "filesDeleted", js.undefined)
    
    inline def setFilesDeletedVarargs(value: FileMetadata*): Self = StObject.set(x, "filesDeleted", js.Array(value :_*))
    
    inline def setFilesUpdated(value: FilesMetadata): Self = StObject.set(x, "filesUpdated", value.asInstanceOf[js.Any])
    
    inline def setFilesUpdatedUndefined: Self = StObject.set(x, "filesUpdated", js.undefined)
    
    inline def setFilesUpdatedVarargs(value: FileMetadata*): Self = StObject.set(x, "filesUpdated", js.Array(value :_*))
    
    inline def setTreeId(value: ObjectId): Self = StObject.set(x, "treeId", value.asInstanceOf[js.Any])
    
    inline def setTreeIdUndefined: Self = StObject.set(x, "treeId", js.undefined)
  }
}
