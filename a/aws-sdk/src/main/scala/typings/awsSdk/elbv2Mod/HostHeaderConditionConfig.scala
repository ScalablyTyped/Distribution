package typings.awsSdk.elbv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HostHeaderConditionConfig extends js.Object {
  /**
    * One or more host names. The maximum size of each name is 128 characters. The comparison is case insensitive. The following wildcard characters are supported: * (matches 0 or more characters) and ? (matches exactly 1 character). If you specify multiple strings, the condition is satisfied if one of the strings matches the host name.
    */
  var Values: js.UndefOr[ListOfString] = js.native
}

object HostHeaderConditionConfig {
  @scala.inline
  def apply(Values: ListOfString = null): HostHeaderConditionConfig = {
    val __obj = js.Dynamic.literal()
    if (Values != null) __obj.updateDynamic("Values")(Values.asInstanceOf[js.Any])
    __obj.asInstanceOf[HostHeaderConditionConfig]
  }
}

