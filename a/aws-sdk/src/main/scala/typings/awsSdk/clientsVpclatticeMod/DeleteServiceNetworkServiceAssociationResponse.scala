package typings.awsSdk.clientsVpclatticeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteServiceNetworkServiceAssociationResponse extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the association.
    */
  var arn: js.UndefOr[ServiceNetworkServiceAssociationArn] = js.undefined
  
  /**
    * The ID of the association.
    */
  var id: js.UndefOr[ServiceNetworkServiceAssociationIdentifier] = js.undefined
  
  /**
    * The operation's status. You can retry the operation if the status is DELETE_FAILED. However, if you retry it when the status is DELETE_IN_PROGRESS, there is no change in the status.
    */
  var status: js.UndefOr[ServiceNetworkServiceAssociationStatus] = js.undefined
}
object DeleteServiceNetworkServiceAssociationResponse {
  
  inline def apply(): DeleteServiceNetworkServiceAssociationResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteServiceNetworkServiceAssociationResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeleteServiceNetworkServiceAssociationResponse] (val x: Self) extends AnyVal {
    
    inline def setArn(value: ServiceNetworkServiceAssociationArn): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
    
    inline def setArnUndefined: Self = StObject.set(x, "arn", js.undefined)
    
    inline def setId(value: ServiceNetworkServiceAssociationIdentifier): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setStatus(value: ServiceNetworkServiceAssociationStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
  }
}
