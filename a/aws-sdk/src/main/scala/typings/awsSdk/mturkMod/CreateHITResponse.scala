package typings.awsSdk.mturkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateHITResponse extends js.Object {
  /**
    *  Contains the newly created HIT data. For a description of the HIT data structure as it appears in responses, see the HIT Data Structure documentation. 
    */
  var HIT: js.UndefOr[typings.awsSdk.mturkMod.HIT] = js.native
}

object CreateHITResponse {
  @scala.inline
  def apply(HIT: HIT = null): CreateHITResponse = {
    val __obj = js.Dynamic.literal()
    if (HIT != null) __obj.updateDynamic("HIT")(HIT.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateHITResponse]
  }
}

