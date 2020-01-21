package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DhcpConfiguration extends js.Object {
  /**
    * The name of a DHCP option.
    */
  var Key: js.UndefOr[String] = js.native
  /**
    * One or more values for the DHCP option.
    */
  var Values: js.UndefOr[DhcpConfigurationValueList] = js.native
}

object DhcpConfiguration {
  @scala.inline
  def apply(Key: String = null, Values: DhcpConfigurationValueList = null): DhcpConfiguration = {
    val __obj = js.Dynamic.literal()
    if (Key != null) __obj.updateDynamic("Key")(Key.asInstanceOf[js.Any])
    if (Values != null) __obj.updateDynamic("Values")(Values.asInstanceOf[js.Any])
    __obj.asInstanceOf[DhcpConfiguration]
  }
}

