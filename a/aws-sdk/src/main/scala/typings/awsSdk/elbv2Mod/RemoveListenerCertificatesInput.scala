package typings.awsSdk.elbv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RemoveListenerCertificatesInput extends StObject {
  
  /**
    * The certificate to remove. You can specify one certificate per call. Set CertificateArn to the certificate ARN but do not set IsDefault.
    */
  var Certificates: CertificateList = js.native
  
  /**
    * The Amazon Resource Name (ARN) of the listener.
    */
  var ListenerArn: typings.awsSdk.elbv2Mod.ListenerArn = js.native
}
object RemoveListenerCertificatesInput {
  
  @scala.inline
  def apply(Certificates: CertificateList, ListenerArn: ListenerArn): RemoveListenerCertificatesInput = {
    val __obj = js.Dynamic.literal(Certificates = Certificates.asInstanceOf[js.Any], ListenerArn = ListenerArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[RemoveListenerCertificatesInput]
  }
  
  @scala.inline
  implicit class RemoveListenerCertificatesInputMutableBuilder[Self <: RemoveListenerCertificatesInput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCertificates(value: CertificateList): Self = StObject.set(x, "Certificates", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCertificatesVarargs(value: Certificate*): Self = StObject.set(x, "Certificates", js.Array(value :_*))
    
    @scala.inline
    def setListenerArn(value: ListenerArn): Self = StObject.set(x, "ListenerArn", value.asInstanceOf[js.Any])
  }
}
