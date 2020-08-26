package typings.awsSdk.wafv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IPSetReferenceStatement extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the IPSet that this statement references.
    */
  var ARN: ResourceArn = js.native
  /**
    * The configuration for inspecting IP addresses in an HTTP header that you specify, instead of using the IP address that's reported by the web request origin. Commonly, this is the X-Forwarded-For (XFF) header, but you can specify any header name.   If the specified header isn't present in the request, AWS WAF doesn't apply the rule to the web request at all. 
    */
  var IPSetForwardedIPConfig: js.UndefOr[typings.awsSdk.wafv2Mod.IPSetForwardedIPConfig] = js.native
}

object IPSetReferenceStatement {
  @scala.inline
  def apply(ARN: ResourceArn): IPSetReferenceStatement = {
    val __obj = js.Dynamic.literal(ARN = ARN.asInstanceOf[js.Any])
    __obj.asInstanceOf[IPSetReferenceStatement]
  }
  @scala.inline
  implicit class IPSetReferenceStatementOps[Self <: IPSetReferenceStatement] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setARN(value: ResourceArn): Self = this.set("ARN", value.asInstanceOf[js.Any])
    @scala.inline
    def setIPSetForwardedIPConfig(value: IPSetForwardedIPConfig): Self = this.set("IPSetForwardedIPConfig", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIPSetForwardedIPConfig: Self = this.set("IPSetForwardedIPConfig", js.undefined)
  }
  
}

