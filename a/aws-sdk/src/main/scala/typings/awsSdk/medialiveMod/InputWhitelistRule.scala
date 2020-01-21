package typings.awsSdk.medialiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InputWhitelistRule extends js.Object {
  /**
    * The IPv4 CIDR that's whitelisted.
    */
  var Cidr: js.UndefOr[string] = js.native
}

object InputWhitelistRule {
  @scala.inline
  def apply(Cidr: string = null): InputWhitelistRule = {
    val __obj = js.Dynamic.literal()
    if (Cidr != null) __obj.updateDynamic("Cidr")(Cidr.asInstanceOf[js.Any])
    __obj.asInstanceOf[InputWhitelistRule]
  }
}

