package typings.awsSdk.servicecatalogMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TagOptionDetail extends js.Object {
  /**
    * The TagOption active state.
    */
  var Active: js.UndefOr[TagOptionActive] = js.native
  /**
    * The TagOption identifier.
    */
  var Id: js.UndefOr[TagOptionId] = js.native
  /**
    * The TagOption key.
    */
  var Key: js.UndefOr[TagOptionKey] = js.native
  /**
    * The TagOption value.
    */
  var Value: js.UndefOr[TagOptionValue] = js.native
}

object TagOptionDetail {
  @scala.inline
  def apply(
    Active: js.UndefOr[Boolean] = js.undefined,
    Id: TagOptionId = null,
    Key: TagOptionKey = null,
    Value: TagOptionValue = null
  ): TagOptionDetail = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(Active)) __obj.updateDynamic("Active")(Active.asInstanceOf[js.Any])
    if (Id != null) __obj.updateDynamic("Id")(Id.asInstanceOf[js.Any])
    if (Key != null) __obj.updateDynamic("Key")(Key.asInstanceOf[js.Any])
    if (Value != null) __obj.updateDynamic("Value")(Value.asInstanceOf[js.Any])
    __obj.asInstanceOf[TagOptionDetail]
  }
}

