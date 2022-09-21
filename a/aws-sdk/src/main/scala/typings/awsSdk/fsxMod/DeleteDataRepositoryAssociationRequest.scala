package typings.awsSdk.fsxMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteDataRepositoryAssociationRequest extends StObject {
  
  /**
    * The ID of the data repository association that you want to delete.
    */
  var AssociationId: DataRepositoryAssociationId
  
  var ClientRequestToken: js.UndefOr[typings.awsSdk.fsxMod.ClientRequestToken] = js.undefined
  
  /**
    * Set to true to delete the data in the file system that corresponds to the data repository association.
    */
  var DeleteDataInFileSystem: typings.awsSdk.fsxMod.DeleteDataInFileSystem
}
object DeleteDataRepositoryAssociationRequest {
  
  inline def apply(AssociationId: DataRepositoryAssociationId, DeleteDataInFileSystem: DeleteDataInFileSystem): DeleteDataRepositoryAssociationRequest = {
    val __obj = js.Dynamic.literal(AssociationId = AssociationId.asInstanceOf[js.Any], DeleteDataInFileSystem = DeleteDataInFileSystem.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteDataRepositoryAssociationRequest]
  }
  
  extension [Self <: DeleteDataRepositoryAssociationRequest](x: Self) {
    
    inline def setAssociationId(value: DataRepositoryAssociationId): Self = StObject.set(x, "AssociationId", value.asInstanceOf[js.Any])
    
    inline def setClientRequestToken(value: ClientRequestToken): Self = StObject.set(x, "ClientRequestToken", value.asInstanceOf[js.Any])
    
    inline def setClientRequestTokenUndefined: Self = StObject.set(x, "ClientRequestToken", js.undefined)
    
    inline def setDeleteDataInFileSystem(value: DeleteDataInFileSystem): Self = StObject.set(x, "DeleteDataInFileSystem", value.asInstanceOf[js.Any])
  }
}
