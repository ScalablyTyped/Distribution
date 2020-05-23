package typings.awsSdk.xrayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ResponseTimeRootCause extends js.Object {
  /**
    * A flag that denotes that the root cause impacts the trace client.
    */
  var ClientImpacting: js.UndefOr[NullableBoolean] = js.native
  /**
    * A list of corresponding services. A service identifies a segment and contains a name, account ID, type, and inferred flag.
    */
  var Services: js.UndefOr[ResponseTimeRootCauseServices] = js.native
}

object ResponseTimeRootCause {
  @scala.inline
  def apply(
    ClientImpacting: js.UndefOr[NullableBoolean] = js.undefined,
    Services: ResponseTimeRootCauseServices = null
  ): ResponseTimeRootCause = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(ClientImpacting)) __obj.updateDynamic("ClientImpacting")(ClientImpacting.get.asInstanceOf[js.Any])
    if (Services != null) __obj.updateDynamic("Services")(Services.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResponseTimeRootCause]
  }
}

