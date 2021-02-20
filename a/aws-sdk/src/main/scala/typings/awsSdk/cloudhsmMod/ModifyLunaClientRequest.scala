package typings.awsSdk.cloudhsmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ModifyLunaClientRequest extends StObject {
  
  /**
    * The new certificate for the client.
    */
  var Certificate: typings.awsSdk.cloudhsmMod.Certificate = js.native
  
  /**
    * The ARN of the client.
    */
  var ClientArn: typings.awsSdk.cloudhsmMod.ClientArn = js.native
}
object ModifyLunaClientRequest {
  
  @scala.inline
  def apply(Certificate: Certificate, ClientArn: ClientArn): ModifyLunaClientRequest = {
    val __obj = js.Dynamic.literal(Certificate = Certificate.asInstanceOf[js.Any], ClientArn = ClientArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModifyLunaClientRequest]
  }
  
  @scala.inline
  implicit class ModifyLunaClientRequestMutableBuilder[Self <: ModifyLunaClientRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCertificate(value: Certificate): Self = StObject.set(x, "Certificate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClientArn(value: ClientArn): Self = StObject.set(x, "ClientArn", value.asInstanceOf[js.Any])
  }
}
