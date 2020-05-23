package typings.awsSdk.xrayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FaultRootCause extends js.Object {
  /**
    * A flag that denotes that the root cause impacts the trace client.
    */
  var ClientImpacting: js.UndefOr[NullableBoolean] = js.native
  /**
    * A list of corresponding services. A service identifies a segment and it contains a name, account ID, type, and inferred flag.
    */
  var Services: js.UndefOr[FaultRootCauseServices] = js.native
}

object FaultRootCause {
  @scala.inline
  def apply(
    ClientImpacting: js.UndefOr[NullableBoolean] = js.undefined,
    Services: FaultRootCauseServices = null
  ): FaultRootCause = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(ClientImpacting)) __obj.updateDynamic("ClientImpacting")(ClientImpacting.get.asInstanceOf[js.Any])
    if (Services != null) __obj.updateDynamic("Services")(Services.asInstanceOf[js.Any])
    __obj.asInstanceOf[FaultRootCause]
  }
}

