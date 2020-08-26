package typings.awsSdk.guarddutyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ProductCode extends js.Object {
  /**
    * The product code information.
    */
  var Code: js.UndefOr[String] = js.native
  /**
    * The product code type.
    */
  var ProductType: js.UndefOr[String] = js.native
}

object ProductCode {
  @scala.inline
  def apply(): ProductCode = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ProductCode]
  }
  @scala.inline
  implicit class ProductCodeOps[Self <: ProductCode] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setCode(value: String): Self = this.set("Code", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCode: Self = this.set("Code", js.undefined)
    @scala.inline
    def setProductType(value: String): Self = this.set("ProductType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProductType: Self = this.set("ProductType", js.undefined)
  }
  
}

