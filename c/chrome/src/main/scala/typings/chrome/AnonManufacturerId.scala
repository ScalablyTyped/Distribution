package typings.chrome

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonManufacturerId extends js.Object {
  /**
    * 3 character manufacturer code.
    */
  var manufacturerId: String
  /**
    * 2 byte manufacturer-assigned code.
    */
  var productId: String
  /**
    * Year of manufacturer.
    */
  var yearOfManufacture: js.UndefOr[String] = js.undefined
}

object AnonManufacturerId {
  @scala.inline
  def apply(manufacturerId: String, productId: String, yearOfManufacture: String = null): AnonManufacturerId = {
    val __obj = js.Dynamic.literal(manufacturerId = manufacturerId.asInstanceOf[js.Any], productId = productId.asInstanceOf[js.Any])
    if (yearOfManufacture != null) __obj.updateDynamic("yearOfManufacture")(yearOfManufacture.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonManufacturerId]
  }
}

