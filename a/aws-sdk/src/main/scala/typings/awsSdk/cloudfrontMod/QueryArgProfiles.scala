package typings.awsSdk.cloudfrontMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait QueryArgProfiles extends js.Object {
  /**
    * Number of items for query argument-profile mapping for field-level encryption.
    */
  var Items: js.UndefOr[QueryArgProfileList] = js.native
  /**
    * Number of profiles for query argument-profile mapping for field-level encryption.
    */
  var Quantity: integer = js.native
}

object QueryArgProfiles {
  @scala.inline
  def apply(Quantity: integer, Items: QueryArgProfileList = null): QueryArgProfiles = {
    val __obj = js.Dynamic.literal(Quantity = Quantity.asInstanceOf[js.Any])
    if (Items != null) __obj.updateDynamic("Items")(Items.asInstanceOf[js.Any])
    __obj.asInstanceOf[QueryArgProfiles]
  }
}

