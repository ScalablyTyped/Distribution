package typings.awsSdk.xrayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FaultRootCause extends js.Object {
  /**
    * A list of corresponding services. A service identifies a segment and it contains a name, account ID, type, and inferred flag.
    */
  var Services: js.UndefOr[FaultRootCauseServices] = js.native
}

object FaultRootCause {
  @scala.inline
  def apply(Services: FaultRootCauseServices = null): FaultRootCause = {
    val __obj = js.Dynamic.literal()
    if (Services != null) __obj.updateDynamic("Services")(Services.asInstanceOf[js.Any])
    __obj.asInstanceOf[FaultRootCause]
  }
}

