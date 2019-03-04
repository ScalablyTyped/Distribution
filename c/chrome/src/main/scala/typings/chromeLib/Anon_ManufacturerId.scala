package typings
package chromeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ManufacturerId extends js.Object {
  /**
    * 3 character manufacturer code.
    */
  var manufacturerId: java.lang.String
  /**
    * 2 byte manufacturer-assigned code.
    */
  var productId: java.lang.String
  /**
    * Year of manufacturer.
    */
  var yearOfManufacture: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_ManufacturerId {
  @scala.inline
  def apply(
    manufacturerId: java.lang.String,
    productId: java.lang.String,
    yearOfManufacture: java.lang.String = null
  ): Anon_ManufacturerId = {
    val __obj = js.Dynamic.literal(manufacturerId = manufacturerId, productId = productId)
    if (yearOfManufacture != null) __obj.updateDynamic("yearOfManufacture")(yearOfManufacture)
    __obj.asInstanceOf[Anon_ManufacturerId]
  }
}

