package typings.awsSdk.devicefarmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateRemoteAccessSessionConfiguration extends js.Object {
  /**
    * The billing method for the remote access session.
    */
  var billingMethod: js.UndefOr[BillingMethod] = js.native
  /**
    * An array of ARNs included in the VPC endpoint configuration.
    */
  var vpceConfigurationArns: js.UndefOr[AmazonResourceNames] = js.native
}

object CreateRemoteAccessSessionConfiguration {
  @scala.inline
  def apply(): CreateRemoteAccessSessionConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateRemoteAccessSessionConfiguration]
  }
  @scala.inline
  implicit class CreateRemoteAccessSessionConfigurationOps[Self <: CreateRemoteAccessSessionConfiguration] (val x: Self) extends AnyVal {
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
    def setBillingMethod(value: BillingMethod): Self = this.set("billingMethod", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBillingMethod: Self = this.set("billingMethod", js.undefined)
    @scala.inline
    def setVpceConfigurationArnsVarargs(value: AmazonResourceName*): Self = this.set("vpceConfigurationArns", js.Array(value :_*))
    @scala.inline
    def setVpceConfigurationArns(value: AmazonResourceNames): Self = this.set("vpceConfigurationArns", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVpceConfigurationArns: Self = this.set("vpceConfigurationArns", js.undefined)
  }
  
}

