package typings.awsSdk.elbv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SourceIpConditionConfig extends js.Object {
  /**
    * One or more source IP addresses, in CIDR format. You can use both IPv4 and IPv6 addresses. Wildcards are not supported. If you specify multiple addresses, the condition is satisfied if the source IP address of the request matches one of the CIDR blocks. This condition is not satisfied by the addresses in the X-Forwarded-For header. To search for addresses in the X-Forwarded-For header, use HttpHeaderConditionConfig.
    */
  var Values: js.UndefOr[ListOfString] = js.native
}

object SourceIpConditionConfig {
  @scala.inline
  def apply(Values: ListOfString = null): SourceIpConditionConfig = {
    val __obj = js.Dynamic.literal()
    if (Values != null) __obj.updateDynamic("Values")(Values.asInstanceOf[js.Any])
    __obj.asInstanceOf[SourceIpConditionConfig]
  }
}

