package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeVolumeAttributeResult extends js.Object {
  /**
    * The state of autoEnableIO attribute.
    */
  var AutoEnableIO: js.UndefOr[AttributeBooleanValue] = js.native
  /**
    * A list of product codes.
    */
  var ProductCodes: js.UndefOr[ProductCodeList] = js.native
  /**
    * The ID of the volume.
    */
  var VolumeId: js.UndefOr[String] = js.native
}

object DescribeVolumeAttributeResult {
  @scala.inline
  def apply(
    AutoEnableIO: AttributeBooleanValue = null,
    ProductCodes: ProductCodeList = null,
    VolumeId: String = null
  ): DescribeVolumeAttributeResult = {
    val __obj = js.Dynamic.literal()
    if (AutoEnableIO != null) __obj.updateDynamic("AutoEnableIO")(AutoEnableIO.asInstanceOf[js.Any])
    if (ProductCodes != null) __obj.updateDynamic("ProductCodes")(ProductCodes.asInstanceOf[js.Any])
    if (VolumeId != null) __obj.updateDynamic("VolumeId")(VolumeId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeVolumeAttributeResult]
  }
}

