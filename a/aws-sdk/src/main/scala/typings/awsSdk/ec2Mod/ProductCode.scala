package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ProductCode extends js.Object {
  /**
    * The product code.
    */
  var ProductCodeId: js.UndefOr[String] = js.native
  /**
    * The type of product code.
    */
  var ProductCodeType: js.UndefOr[ProductCodeValues] = js.native
}

object ProductCode {
  @scala.inline
  def apply(ProductCodeId: String = null, ProductCodeType: ProductCodeValues = null): ProductCode = {
    val __obj = js.Dynamic.literal()
    if (ProductCodeId != null) __obj.updateDynamic("ProductCodeId")(ProductCodeId.asInstanceOf[js.Any])
    if (ProductCodeType != null) __obj.updateDynamic("ProductCodeType")(ProductCodeType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProductCode]
  }
}

