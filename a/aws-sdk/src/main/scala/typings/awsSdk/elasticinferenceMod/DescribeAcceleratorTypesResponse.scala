package typings.awsSdk.elasticinferenceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeAcceleratorTypesResponse extends js.Object {
  /**
    *  The available accelerator types. 
    */
  var acceleratorTypes: js.UndefOr[AcceleratorTypeList] = js.native
}

object DescribeAcceleratorTypesResponse {
  @scala.inline
  def apply(acceleratorTypes: AcceleratorTypeList = null): DescribeAcceleratorTypesResponse = {
    val __obj = js.Dynamic.literal()
    if (acceleratorTypes != null) __obj.updateDynamic("acceleratorTypes")(acceleratorTypes.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeAcceleratorTypesResponse]
  }
}

