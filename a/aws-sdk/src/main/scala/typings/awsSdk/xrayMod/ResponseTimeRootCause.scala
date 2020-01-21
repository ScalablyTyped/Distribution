package typings.awsSdk.xrayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ResponseTimeRootCause extends js.Object {
  /**
    * A list of corresponding services. A service identifies a segment and contains a name, account ID, type, and inferred flag.
    */
  var Services: js.UndefOr[ResponseTimeRootCauseServices] = js.native
}

object ResponseTimeRootCause {
  @scala.inline
  def apply(Services: ResponseTimeRootCauseServices = null): ResponseTimeRootCause = {
    val __obj = js.Dynamic.literal()
    if (Services != null) __obj.updateDynamic("Services")(Services.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResponseTimeRootCause]
  }
}

