package typings.awsSdk.wafv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ForwardedIPConfig extends js.Object {
  /**
    * The match status to assign to the web request if the request doesn't have a valid IP address in the specified position.  If the specified header isn't present in the request, AWS WAF doesn't apply the rule to the web request at all.  You can specify the following fallback behaviors:   MATCH - Treat the web request as matching the rule statement. AWS WAF applies the rule action to the request.   NO_MATCH - Treat the web request as not matching the rule statement.  
    */
  var FallbackBehavior: typings.awsSdk.wafv2Mod.FallbackBehavior = js.native
  /**
    * The name of the HTTP header to use for the IP address. For example, to use the X-Forwarded-For (XFF) header, set this to X-Forwarded-For.  If the specified header isn't present in the request, AWS WAF doesn't apply the rule to the web request at all. 
    */
  var HeaderName: ForwardedIPHeaderName = js.native
}

object ForwardedIPConfig {
  @scala.inline
  def apply(FallbackBehavior: FallbackBehavior, HeaderName: ForwardedIPHeaderName): ForwardedIPConfig = {
    val __obj = js.Dynamic.literal(FallbackBehavior = FallbackBehavior.asInstanceOf[js.Any], HeaderName = HeaderName.asInstanceOf[js.Any])
    __obj.asInstanceOf[ForwardedIPConfig]
  }
  @scala.inline
  implicit class ForwardedIPConfigOps[Self <: ForwardedIPConfig] (val x: Self) extends AnyVal {
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
    def setFallbackBehavior(value: FallbackBehavior): Self = this.set("FallbackBehavior", value.asInstanceOf[js.Any])
    @scala.inline
    def setHeaderName(value: ForwardedIPHeaderName): Self = this.set("HeaderName", value.asInstanceOf[js.Any])
  }
  
}

