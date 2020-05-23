package typings.chrome.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ManufacturerId extends js.Object {
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

object ManufacturerId {
  @scala.inline
  def apply(manufacturerId: String, productId: String, yearOfManufacture: String = null): ManufacturerId = {
    val __obj = js.Dynamic.literal(manufacturerId = manufacturerId.asInstanceOf[js.Any], productId = productId.asInstanceOf[js.Any])
    if (yearOfManufacture != null) __obj.updateDynamic("yearOfManufacture")(yearOfManufacture.asInstanceOf[js.Any])
    __obj.asInstanceOf[ManufacturerId]
  }
}

