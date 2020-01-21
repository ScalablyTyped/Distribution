package typings.azureArmResource.libModelsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlanPatchable extends js.Object {
  /**
    * The plan name.
    */
  var name: js.UndefOr[String] = js.undefined
  /**
    * The product code.
    */
  var product: js.UndefOr[String] = js.undefined
  /**
    * The promotion code.
    */
  var promotionCode: js.UndefOr[String] = js.undefined
  /**
    * The publisher ID.
    */
  var publisher: js.UndefOr[String] = js.undefined
  /**
    * The plan's version.
    */
  var version: js.UndefOr[String] = js.undefined
}

object PlanPatchable {
  @scala.inline
  def apply(
    name: String = null,
    product: String = null,
    promotionCode: String = null,
    publisher: String = null,
    version: String = null
  ): PlanPatchable = {
    val __obj = js.Dynamic.literal()
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (product != null) __obj.updateDynamic("product")(product.asInstanceOf[js.Any])
    if (promotionCode != null) __obj.updateDynamic("promotionCode")(promotionCode.asInstanceOf[js.Any])
    if (publisher != null) __obj.updateDynamic("publisher")(publisher.asInstanceOf[js.Any])
    if (version != null) __obj.updateDynamic("version")(version.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlanPatchable]
  }
}

