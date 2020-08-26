package typings.awsSdk.cloudhsmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ModifyLunaClientRequest extends js.Object {
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
  implicit class ModifyLunaClientRequestOps[Self <: ModifyLunaClientRequest] (val x: Self) extends AnyVal {
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
    def setClientArn(value: ClientArn): Self = this.set("ClientArn", value.asInstanceOf[js.Any])
  }
  
}

