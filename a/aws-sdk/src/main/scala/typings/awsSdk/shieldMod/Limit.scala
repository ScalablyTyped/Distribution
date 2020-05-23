package typings.awsSdk.shieldMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Limit extends js.Object {
  /**
    * The maximum number of protections that can be created for the specified Type.
    */
  var Max: js.UndefOr[Long] = js.native
  /**
    * The type of protection.
    */
  var Type: js.UndefOr[String] = js.native
}

object Limit {
  @scala.inline
  def apply(Max: js.UndefOr[Long] = js.undefined, Type: String = null): Limit = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(Max)) __obj.updateDynamic("Max")(Max.get.asInstanceOf[js.Any])
    if (Type != null) __obj.updateDynamic("Type")(Type.asInstanceOf[js.Any])
    __obj.asInstanceOf[Limit]
  }
}

