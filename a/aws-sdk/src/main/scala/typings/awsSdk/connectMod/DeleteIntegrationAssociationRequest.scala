package typings.awsSdk.connectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteIntegrationAssociationRequest extends StObject {
  
  /**
    * The identifier of the Amazon Connect instance. You can find the instanceId in the ARN of the instance.
    */
  var InstanceId: typings.awsSdk.connectMod.InstanceId
  
  /**
    * The identifier for the integration association.
    */
  var IntegrationAssociationId: typings.awsSdk.connectMod.IntegrationAssociationId
}
object DeleteIntegrationAssociationRequest {
  
  inline def apply(InstanceId: InstanceId, IntegrationAssociationId: IntegrationAssociationId): DeleteIntegrationAssociationRequest = {
    val __obj = js.Dynamic.literal(InstanceId = InstanceId.asInstanceOf[js.Any], IntegrationAssociationId = IntegrationAssociationId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteIntegrationAssociationRequest]
  }
  
  extension [Self <: DeleteIntegrationAssociationRequest](x: Self) {
    
    inline def setInstanceId(value: InstanceId): Self = StObject.set(x, "InstanceId", value.asInstanceOf[js.Any])
    
    inline def setIntegrationAssociationId(value: IntegrationAssociationId): Self = StObject.set(x, "IntegrationAssociationId", value.asInstanceOf[js.Any])
  }
}
