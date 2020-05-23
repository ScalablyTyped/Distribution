package typings.awsSdk.elasticinferenceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeAcceleratorOfferingsResponse extends js.Object {
  /**
    *  The list of accelerator type offerings for a specific location. 
    */
  var acceleratorTypeOfferings: js.UndefOr[AcceleratorTypeOfferingList] = js.native
}

object DescribeAcceleratorOfferingsResponse {
  @scala.inline
  def apply(acceleratorTypeOfferings: AcceleratorTypeOfferingList = null): DescribeAcceleratorOfferingsResponse = {
    val __obj = js.Dynamic.literal()
    if (acceleratorTypeOfferings != null) __obj.updateDynamic("acceleratorTypeOfferings")(acceleratorTypeOfferings.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeAcceleratorOfferingsResponse]
  }
}

