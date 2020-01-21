package typings.awsSdk.xrayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ErrorRootCause extends js.Object {
  /**
    * A list of services corresponding to an error. A service identifies a segment and it contains a name, account ID, type, and inferred flag.
    */
  var Services: js.UndefOr[ErrorRootCauseServices] = js.native
}

object ErrorRootCause {
  @scala.inline
  def apply(Services: ErrorRootCauseServices = null): ErrorRootCause = {
    val __obj = js.Dynamic.literal()
    if (Services != null) __obj.updateDynamic("Services")(Services.asInstanceOf[js.Any])
    __obj.asInstanceOf[ErrorRootCause]
  }
}

