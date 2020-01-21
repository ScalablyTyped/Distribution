package typings.azureArmResource.libModelsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Sku extends js.Object {
  /**
    * The SKU capacity.
    */
  var capacity: js.UndefOr[Double] = js.undefined
  /**
    * The SKU family.
    */
  var family: js.UndefOr[String] = js.undefined
  /**
    * The SKU model.
    */
  var model: js.UndefOr[String] = js.undefined
  /**
    * The SKU name.
    */
  var name: String
  /**
    * The SKU size.
    */
  var size: js.UndefOr[String] = js.undefined
  /**
    * The SKU tier.
    */
  var tier: js.UndefOr[String] = js.undefined
}

object Sku {
  @scala.inline
  def apply(
    name: String,
    capacity: Int | Double = null,
    family: String = null,
    model: String = null,
    size: String = null,
    tier: String = null
  ): Sku = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    if (capacity != null) __obj.updateDynamic("capacity")(capacity.asInstanceOf[js.Any])
    if (family != null) __obj.updateDynamic("family")(family.asInstanceOf[js.Any])
    if (model != null) __obj.updateDynamic("model")(model.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (tier != null) __obj.updateDynamic("tier")(tier.asInstanceOf[js.Any])
    __obj.asInstanceOf[Sku]
  }
}

