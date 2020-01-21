package typings.awsSdk.directconnectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RouteFilterPrefix extends js.Object {
  /**
    * The CIDR block for the advertised route. Separate multiple routes using commas. An IPv6 CIDR must use /64 or shorter.
    */
  var cidr: js.UndefOr[CIDR] = js.native
}

object RouteFilterPrefix {
  @scala.inline
  def apply(cidr: CIDR = null): RouteFilterPrefix = {
    val __obj = js.Dynamic.literal()
    if (cidr != null) __obj.updateDynamic("cidr")(cidr.asInstanceOf[js.Any])
    __obj.asInstanceOf[RouteFilterPrefix]
  }
}

