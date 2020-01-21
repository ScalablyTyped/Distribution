package typings.awsSdk.mediaconvertMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NielsenConfiguration extends js.Object {
  /**
    * Nielsen has discontinued the use of breakout code functionality. If you must include this property, set the value to zero.
    */
  var BreakoutCode: js.UndefOr[integerMin0Max0] = js.native
  /**
    * Use Distributor ID (DistributorID) to specify the distributor ID that is assigned to your organization by Neilsen.
    */
  var DistributorId: js.UndefOr[string] = js.native
}

object NielsenConfiguration {
  @scala.inline
  def apply(BreakoutCode: Int | Double = null, DistributorId: string = null): NielsenConfiguration = {
    val __obj = js.Dynamic.literal()
    if (BreakoutCode != null) __obj.updateDynamic("BreakoutCode")(BreakoutCode.asInstanceOf[js.Any])
    if (DistributorId != null) __obj.updateDynamic("DistributorId")(DistributorId.asInstanceOf[js.Any])
    __obj.asInstanceOf[NielsenConfiguration]
  }
}

