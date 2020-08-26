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
  def apply(): DescribeAcceleratorOfferingsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeAcceleratorOfferingsResponse]
  }
  @scala.inline
  implicit class DescribeAcceleratorOfferingsResponseOps[Self <: DescribeAcceleratorOfferingsResponse] (val x: Self) extends AnyVal {
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
    def setAcceleratorTypeOfferingsVarargs(value: AcceleratorTypeOffering*): Self = this.set("acceleratorTypeOfferings", js.Array(value :_*))
    @scala.inline
    def setAcceleratorTypeOfferings(value: AcceleratorTypeOfferingList): Self = this.set("acceleratorTypeOfferings", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAcceleratorTypeOfferings: Self = this.set("acceleratorTypeOfferings", js.undefined)
  }
  
}

