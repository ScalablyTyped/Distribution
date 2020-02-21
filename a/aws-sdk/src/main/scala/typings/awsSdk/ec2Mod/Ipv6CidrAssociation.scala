package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Ipv6CidrAssociation extends js.Object {
  /**
    * The resource that's associated with the IPv6 CIDR block.
    */
  var AssociatedResource: js.UndefOr[String] = js.native
  /**
    * The IPv6 CIDR block.
    */
  var Ipv6Cidr: js.UndefOr[String] = js.native
}

object Ipv6CidrAssociation {
  @scala.inline
  def apply(AssociatedResource: String = null, Ipv6Cidr: String = null): Ipv6CidrAssociation = {
    val __obj = js.Dynamic.literal()
    if (AssociatedResource != null) __obj.updateDynamic("AssociatedResource")(AssociatedResource.asInstanceOf[js.Any])
    if (Ipv6Cidr != null) __obj.updateDynamic("Ipv6Cidr")(Ipv6Cidr.asInstanceOf[js.Any])
    __obj.asInstanceOf[Ipv6CidrAssociation]
  }
}

