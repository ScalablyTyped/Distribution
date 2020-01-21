package typings.awsSdk.globalacceleratorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IpSet extends js.Object {
  /**
    * The array of IP addresses in the IP address set. An IP address set can have a maximum of two IP addresses.
    */
  var IpAddresses: js.UndefOr[typings.awsSdk.globalacceleratorMod.IpAddresses] = js.native
  /**
    * The types of IP addresses included in this IP set.
    */
  var IpFamily: js.UndefOr[GenericString] = js.native
}

object IpSet {
  @scala.inline
  def apply(IpAddresses: IpAddresses = null, IpFamily: GenericString = null): IpSet = {
    val __obj = js.Dynamic.literal()
    if (IpAddresses != null) __obj.updateDynamic("IpAddresses")(IpAddresses.asInstanceOf[js.Any])
    if (IpFamily != null) __obj.updateDynamic("IpFamily")(IpFamily.asInstanceOf[js.Any])
    __obj.asInstanceOf[IpSet]
  }
}

