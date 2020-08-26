package typings.chrome.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ManufacturerId extends js.Object {
  /**
    * 3 character manufacturer code.
    */
  var manufacturerId: String = js.native
  /**
    * 2 byte manufacturer-assigned code.
    */
  var productId: String = js.native
  /**
    * Year of manufacturer.
    */
  var yearOfManufacture: js.UndefOr[String] = js.native
}

object ManufacturerId {
  @scala.inline
  def apply(manufacturerId: String, productId: String): ManufacturerId = {
    val __obj = js.Dynamic.literal(manufacturerId = manufacturerId.asInstanceOf[js.Any], productId = productId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ManufacturerId]
  }
  @scala.inline
  implicit class ManufacturerIdOps[Self <: ManufacturerId] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setManufacturerId(value: String): Self = this.set("manufacturerId", value.asInstanceOf[js.Any])
    @scala.inline
    def setProductId(value: String): Self = this.set("productId", value.asInstanceOf[js.Any])
    @scala.inline
    def setYearOfManufacture(value: String): Self = this.set("yearOfManufacture", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteYearOfManufacture: Self = this.set("yearOfManufacture", js.undefined)
  }
  
}

