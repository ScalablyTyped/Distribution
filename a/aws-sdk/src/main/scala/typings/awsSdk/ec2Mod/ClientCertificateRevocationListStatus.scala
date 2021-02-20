package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ClientCertificateRevocationListStatus extends StObject {
  
  /**
    * The state of the client certificate revocation list.
    */
  var Code: js.UndefOr[ClientCertificateRevocationListStatusCode] = js.native
  
  /**
    * A message about the status of the client certificate revocation list, if applicable.
    */
  var Message: js.UndefOr[String] = js.native
}
object ClientCertificateRevocationListStatus {
  
  @scala.inline
  def apply(): ClientCertificateRevocationListStatus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ClientCertificateRevocationListStatus]
  }
  
  @scala.inline
  implicit class ClientCertificateRevocationListStatusMutableBuilder[Self <: ClientCertificateRevocationListStatus] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCode(value: ClientCertificateRevocationListStatusCode): Self = StObject.set(x, "Code", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCodeUndefined: Self = StObject.set(x, "Code", js.undefined)
    
    @scala.inline
    def setMessage(value: String): Self = StObject.set(x, "Message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessageUndefined: Self = StObject.set(x, "Message", js.undefined)
  }
}
