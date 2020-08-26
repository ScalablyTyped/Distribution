package typings.awsSdk.elasticinferenceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeAcceleratorOfferingsRequest extends js.Object {
  /**
    *  The list of accelerator types to describe. 
    */
  var acceleratorTypes: js.UndefOr[AcceleratorTypeNameList] = js.native
  /**
    *  The location type that you want to describe accelerator type offerings for. It can assume the following values: region: will return the accelerator type offering at the regional level. availability-zone: will return the accelerator type offering at the availability zone level. availability-zone-id: will return the accelerator type offering at the availability zone level returning the availability zone id. 
    */
  var locationType: LocationType = js.native
}

object DescribeAcceleratorOfferingsRequest {
  @scala.inline
  def apply(locationType: LocationType): DescribeAcceleratorOfferingsRequest = {
    val __obj = js.Dynamic.literal(locationType = locationType.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeAcceleratorOfferingsRequest]
  }
  @scala.inline
  implicit class DescribeAcceleratorOfferingsRequestOps[Self <: DescribeAcceleratorOfferingsRequest] (val x: Self) extends AnyVal {
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
    def setLocationType(value: LocationType): Self = this.set("locationType", value.asInstanceOf[js.Any])
    @scala.inline
    def setAcceleratorTypesVarargs(value: AcceleratorTypeName*): Self = this.set("acceleratorTypes", js.Array(value :_*))
    @scala.inline
    def setAcceleratorTypes(value: AcceleratorTypeNameList): Self = this.set("acceleratorTypes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAcceleratorTypes: Self = this.set("acceleratorTypes", js.undefined)
  }
  
}

