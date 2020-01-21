package typings.azureArmResource.libModelsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Plan extends js.Object {
  /**
    * The plan name.
    */
  var name: String
  /**
    * The product code.
    */
  var product: String
  /**
    * The promotion code.
    */
  var promotionCode: js.UndefOr[String] = js.undefined
  /**
    * The publisher ID.
    */
  var publisher: String
  /**
    * The plan's version.
    */
  var version: String
}

object Plan {
  @scala.inline
  def apply(name: String, product: String, publisher: String, version: String, promotionCode: String = null): Plan = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], product = product.asInstanceOf[js.Any], publisher = publisher.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    if (promotionCode != null) __obj.updateDynamic("promotionCode")(promotionCode.asInstanceOf[js.Any])
    __obj.asInstanceOf[Plan]
  }
}

