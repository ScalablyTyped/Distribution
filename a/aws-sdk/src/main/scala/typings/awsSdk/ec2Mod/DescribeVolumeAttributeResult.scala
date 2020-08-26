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
  def apply(): DescribeVolumeAttributeResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeVolumeAttributeResult]
  }
  @scala.inline
  implicit class DescribeVolumeAttributeResultOps[Self <: DescribeVolumeAttributeResult] (val x: Self) extends AnyVal {
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
    def setAutoEnableIO(value: AttributeBooleanValue): Self = this.set("AutoEnableIO", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAutoEnableIO: Self = this.set("AutoEnableIO", js.undefined)
    @scala.inline
    def setProductCodesVarargs(value: ProductCode*): Self = this.set("ProductCodes", js.Array(value :_*))
    @scala.inline
    def setProductCodes(value: ProductCodeList): Self = this.set("ProductCodes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProductCodes: Self = this.set("ProductCodes", js.undefined)
    @scala.inline
    def setVolumeId(value: String): Self = this.set("VolumeId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVolumeId: Self = this.set("VolumeId", js.undefined)
  }
  
}

