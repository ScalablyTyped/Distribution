package typings.awsSdk.servicecatalogMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateTagOptionInput extends js.Object {
  /**
    * The updated active state.
    */
  var Active: js.UndefOr[TagOptionActive] = js.native
  /**
    * The TagOption identifier.
    */
  var Id: TagOptionId = js.native
  /**
    * The updated value.
    */
  var Value: js.UndefOr[TagOptionValue] = js.native
}

object UpdateTagOptionInput {
  @scala.inline
  def apply(Id: TagOptionId, Active: js.UndefOr[Boolean] = js.undefined, Value: TagOptionValue = null): UpdateTagOptionInput = {
    val __obj = js.Dynamic.literal(Id = Id.asInstanceOf[js.Any])
    if (!js.isUndefined(Active)) __obj.updateDynamic("Active")(Active.asInstanceOf[js.Any])
    if (Value != null) __obj.updateDynamic("Value")(Value.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateTagOptionInput]
  }
}

