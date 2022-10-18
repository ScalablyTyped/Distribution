package typings.awsSdk.clientsTransferMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateAccessResponse extends StObject {
  
  /**
    * The external identifier of the group whose users have access to your Amazon S3 or Amazon EFS resources over the enabled protocols using Transfer Family.
    */
  var ExternalId: typings.awsSdk.clientsTransferMod.ExternalId
  
  /**
    * The identifier of the server that the user is attached to.
    */
  var ServerId: typings.awsSdk.clientsTransferMod.ServerId
}
object CreateAccessResponse {
  
  inline def apply(ExternalId: ExternalId, ServerId: ServerId): CreateAccessResponse = {
    val __obj = js.Dynamic.literal(ExternalId = ExternalId.asInstanceOf[js.Any], ServerId = ServerId.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateAccessResponse]
  }
  
  extension [Self <: CreateAccessResponse](x: Self) {
    
    inline def setExternalId(value: ExternalId): Self = StObject.set(x, "ExternalId", value.asInstanceOf[js.Any])
    
    inline def setServerId(value: ServerId): Self = StObject.set(x, "ServerId", value.asInstanceOf[js.Any])
  }
}
