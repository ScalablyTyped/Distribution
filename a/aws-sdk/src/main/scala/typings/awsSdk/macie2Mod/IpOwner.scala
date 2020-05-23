package typings.awsSdk.macie2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IpOwner extends js.Object {
  /**
    * Reserved for future use.
    */
  var asn: js.UndefOr[string] = js.native
  /**
    * Reserved for future use.
    */
  var asnOrg: js.UndefOr[string] = js.native
  /**
    * Reserved for future use.
    */
  var isp: js.UndefOr[string] = js.native
  /**
    * Reserved for future use.
    */
  @JSName("org")
  var org_ : js.UndefOr[string] = js.native
}

object IpOwner {
  @scala.inline
  def apply(asn: string = null, asnOrg: string = null, isp: string = null, org_ : string = null): IpOwner = {
    val __obj = js.Dynamic.literal()
    if (asn != null) __obj.updateDynamic("asn")(asn.asInstanceOf[js.Any])
    if (asnOrg != null) __obj.updateDynamic("asnOrg")(asnOrg.asInstanceOf[js.Any])
    if (isp != null) __obj.updateDynamic("isp")(isp.asInstanceOf[js.Any])
    if (org_ != null) __obj.updateDynamic("org")(org_.asInstanceOf[js.Any])
    __obj.asInstanceOf[IpOwner]
  }
}

