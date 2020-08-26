package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SpotPrice extends js.Object {
  /**
    * The Availability Zone.
    */
  var AvailabilityZone: js.UndefOr[String] = js.native
  /**
    * The instance type.
    */
  var InstanceType: js.UndefOr[typings.awsSdk.ec2Mod.InstanceType] = js.native
  /**
    * A general description of the AMI.
    */
  var ProductDescription: js.UndefOr[RIProductDescription] = js.native
  /**
    * The maximum price per hour that you are willing to pay for a Spot Instance.
    */
  var SpotPrice: js.UndefOr[String] = js.native
  /**
    * The date and time the request was created, in UTC format (for example, YYYY-MM-DDTHH:MM:SSZ).
    */
  var Timestamp: js.UndefOr[DateTime] = js.native
}

object SpotPrice {
  @scala.inline
  def apply(): SpotPrice = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SpotPrice]
  }
  @scala.inline
  implicit class SpotPriceOps[Self <: SpotPrice] (val x: Self) extends AnyVal {
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
    def setAvailabilityZone(value: String): Self = this.set("AvailabilityZone", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAvailabilityZone: Self = this.set("AvailabilityZone", js.undefined)
    @scala.inline
    def setInstanceType(value: InstanceType): Self = this.set("InstanceType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInstanceType: Self = this.set("InstanceType", js.undefined)
    @scala.inline
    def setProductDescription(value: RIProductDescription): Self = this.set("ProductDescription", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProductDescription: Self = this.set("ProductDescription", js.undefined)
    @scala.inline
    def setSpotPrice(value: String): Self = this.set("SpotPrice", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSpotPrice: Self = this.set("SpotPrice", js.undefined)
    @scala.inline
    def setTimestamp(value: DateTime): Self = this.set("Timestamp", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTimestamp: Self = this.set("Timestamp", js.undefined)
  }
  
}

