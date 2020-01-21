package typings.awsSdk.cloudfrontMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Aliases extends js.Object {
  /**
    * A complex type that contains the CNAME aliases, if any, that you want to associate with this distribution.
    */
  var Items: js.UndefOr[AliasList] = js.native
  /**
    * The number of CNAME aliases, if any, that you want to associate with this distribution.
    */
  var Quantity: integer = js.native
}

object Aliases {
  @scala.inline
  def apply(Quantity: integer, Items: AliasList = null): Aliases = {
    val __obj = js.Dynamic.literal(Quantity = Quantity.asInstanceOf[js.Any])
    if (Items != null) __obj.updateDynamic("Items")(Items.asInstanceOf[js.Any])
    __obj.asInstanceOf[Aliases]
  }
}

