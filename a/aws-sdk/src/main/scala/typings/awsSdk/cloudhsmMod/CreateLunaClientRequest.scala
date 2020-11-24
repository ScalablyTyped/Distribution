package typings.awsSdk.cloudhsmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateLunaClientRequest extends js.Object {
  
  /**
    * The contents of a Base64-Encoded X.509 v3 certificate to be installed on the HSMs used by this client.
    */
  var Certificate: typings.awsSdk.cloudhsmMod.Certificate = js.native
  
  /**
    * The label for the client.
    */
  var Label: js.UndefOr[ClientLabel] = js.native
}
object CreateLunaClientRequest {
  
  @scala.inline
  def apply(Certificate: Certificate): CreateLunaClientRequest = {
    val __obj = js.Dynamic.literal(Certificate = Certificate.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateLunaClientRequest]
  }
  
  @scala.inline
  implicit class CreateLunaClientRequestOps[Self <: CreateLunaClientRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setCertificate(value: Certificate): Self = this.set("Certificate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabel(value: ClientLabel): Self = this.set("Label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLabel: Self = this.set("Label", js.undefined)
  }
}
