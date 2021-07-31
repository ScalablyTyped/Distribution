package typings.awsSdk.cloudhsmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateLunaClientRequest extends StObject {
  
  /**
    * The contents of a Base64-Encoded X.509 v3 certificate to be installed on the HSMs used by this client.
    */
  var Certificate: typings.awsSdk.cloudhsmMod.Certificate
  
  /**
    * The label for the client.
    */
  var Label: js.UndefOr[ClientLabel] = js.undefined
}
object CreateLunaClientRequest {
  
  @scala.inline
  def apply(Certificate: Certificate): CreateLunaClientRequest = {
    val __obj = js.Dynamic.literal(Certificate = Certificate.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateLunaClientRequest]
  }
  
  @scala.inline
  implicit class CreateLunaClientRequestMutableBuilder[Self <: CreateLunaClientRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCertificate(value: Certificate): Self = StObject.set(x, "Certificate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabel(value: ClientLabel): Self = StObject.set(x, "Label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelUndefined: Self = StObject.set(x, "Label", js.undefined)
  }
}
