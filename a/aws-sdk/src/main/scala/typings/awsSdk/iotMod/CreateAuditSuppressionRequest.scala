package typings.awsSdk.iotMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateAuditSuppressionRequest extends StObject {
  
  var checkName: AuditCheckName
  
  /**
    *  The epoch timestamp in seconds at which this suppression expires. 
    */
  var clientRequestToken: ClientRequestToken
  
  /**
    *  The description of the audit suppression. 
    */
  var description: js.UndefOr[AuditDescription] = js.undefined
  
  /**
    *  The epoch timestamp in seconds at which this suppression expires. 
    */
  var expirationDate: js.UndefOr[Timestamp] = js.undefined
  
  var resourceIdentifier: ResourceIdentifier
  
  /**
    *  Indicates whether a suppression should exist indefinitely or not. 
    */
  var suppressIndefinitely: js.UndefOr[SuppressIndefinitely] = js.undefined
}
object CreateAuditSuppressionRequest {
  
  inline def apply(
    checkName: AuditCheckName,
    clientRequestToken: ClientRequestToken,
    resourceIdentifier: ResourceIdentifier
  ): CreateAuditSuppressionRequest = {
    val __obj = js.Dynamic.literal(checkName = checkName.asInstanceOf[js.Any], clientRequestToken = clientRequestToken.asInstanceOf[js.Any], resourceIdentifier = resourceIdentifier.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateAuditSuppressionRequest]
  }
  
  extension [Self <: CreateAuditSuppressionRequest](x: Self) {
    
    inline def setCheckName(value: AuditCheckName): Self = StObject.set(x, "checkName", value.asInstanceOf[js.Any])
    
    inline def setClientRequestToken(value: ClientRequestToken): Self = StObject.set(x, "clientRequestToken", value.asInstanceOf[js.Any])
    
    inline def setDescription(value: AuditDescription): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setExpirationDate(value: Timestamp): Self = StObject.set(x, "expirationDate", value.asInstanceOf[js.Any])
    
    inline def setExpirationDateUndefined: Self = StObject.set(x, "expirationDate", js.undefined)
    
    inline def setResourceIdentifier(value: ResourceIdentifier): Self = StObject.set(x, "resourceIdentifier", value.asInstanceOf[js.Any])
    
    inline def setSuppressIndefinitely(value: SuppressIndefinitely): Self = StObject.set(x, "suppressIndefinitely", value.asInstanceOf[js.Any])
    
    inline def setSuppressIndefinitelyUndefined: Self = StObject.set(x, "suppressIndefinitely", js.undefined)
  }
}
