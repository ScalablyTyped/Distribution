package typings.awsSdk.transferMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateAccessResponse extends StObject {
  
  /**
    * The external ID of the group whose users have access to your Amazon S3 or Amazon EFS resources over the enabled protocols using Amazon Web ServicesTransfer Family.
    */
  var ExternalId: typings.awsSdk.transferMod.ExternalId
  
  /**
    * The ID of the server that the user is attached to.
    */
  var ServerId: typings.awsSdk.transferMod.ServerId
}
object UpdateAccessResponse {
  
  inline def apply(ExternalId: ExternalId, ServerId: ServerId): UpdateAccessResponse = {
    val __obj = js.Dynamic.literal(ExternalId = ExternalId.asInstanceOf[js.Any], ServerId = ServerId.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateAccessResponse]
  }
  
  extension [Self <: UpdateAccessResponse](x: Self) {
    
    inline def setExternalId(value: ExternalId): Self = StObject.set(x, "ExternalId", value.asInstanceOf[js.Any])
    
    inline def setServerId(value: ServerId): Self = StObject.set(x, "ServerId", value.asInstanceOf[js.Any])
  }
}
