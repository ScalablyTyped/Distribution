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
  def apply(locationType: LocationType, acceleratorTypes: AcceleratorTypeNameList = null): DescribeAcceleratorOfferingsRequest = {
    val __obj = js.Dynamic.literal(locationType = locationType.asInstanceOf[js.Any])
    if (acceleratorTypes != null) __obj.updateDynamic("acceleratorTypes")(acceleratorTypes.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeAcceleratorOfferingsRequest]
  }
}

