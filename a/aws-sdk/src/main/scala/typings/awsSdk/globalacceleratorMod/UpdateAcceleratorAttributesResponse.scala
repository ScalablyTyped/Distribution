package typings.awsSdk.globalacceleratorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateAcceleratorAttributesResponse extends js.Object {
  /**
    * Updated attributes for the accelerator.
    */
  var AcceleratorAttributes: js.UndefOr[typings.awsSdk.globalacceleratorMod.AcceleratorAttributes] = js.native
}

object UpdateAcceleratorAttributesResponse {
  @scala.inline
  def apply(AcceleratorAttributes: AcceleratorAttributes = null): UpdateAcceleratorAttributesResponse = {
    val __obj = js.Dynamic.literal()
    if (AcceleratorAttributes != null) __obj.updateDynamic("AcceleratorAttributes")(AcceleratorAttributes.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateAcceleratorAttributesResponse]
  }
}

