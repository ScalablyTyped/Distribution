package typings.awsSdk.xrayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BackendConnectionErrors extends js.Object {
  /**
    * 
    */
  var ConnectionRefusedCount: js.UndefOr[NullableInteger] = js.native
  /**
    * 
    */
  var HTTPCode4XXCount: js.UndefOr[NullableInteger] = js.native
  /**
    * 
    */
  var HTTPCode5XXCount: js.UndefOr[NullableInteger] = js.native
  /**
    * 
    */
  var OtherCount: js.UndefOr[NullableInteger] = js.native
  /**
    * 
    */
  var TimeoutCount: js.UndefOr[NullableInteger] = js.native
  /**
    * 
    */
  var UnknownHostCount: js.UndefOr[NullableInteger] = js.native
}

object BackendConnectionErrors {
  @scala.inline
  def apply(
    ConnectionRefusedCount: js.UndefOr[NullableInteger] = js.undefined,
    HTTPCode4XXCount: js.UndefOr[NullableInteger] = js.undefined,
    HTTPCode5XXCount: js.UndefOr[NullableInteger] = js.undefined,
    OtherCount: js.UndefOr[NullableInteger] = js.undefined,
    TimeoutCount: js.UndefOr[NullableInteger] = js.undefined,
    UnknownHostCount: js.UndefOr[NullableInteger] = js.undefined
  ): BackendConnectionErrors = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(ConnectionRefusedCount)) __obj.updateDynamic("ConnectionRefusedCount")(ConnectionRefusedCount.get.asInstanceOf[js.Any])
    if (!js.isUndefined(HTTPCode4XXCount)) __obj.updateDynamic("HTTPCode4XXCount")(HTTPCode4XXCount.get.asInstanceOf[js.Any])
    if (!js.isUndefined(HTTPCode5XXCount)) __obj.updateDynamic("HTTPCode5XXCount")(HTTPCode5XXCount.get.asInstanceOf[js.Any])
    if (!js.isUndefined(OtherCount)) __obj.updateDynamic("OtherCount")(OtherCount.get.asInstanceOf[js.Any])
    if (!js.isUndefined(TimeoutCount)) __obj.updateDynamic("TimeoutCount")(TimeoutCount.get.asInstanceOf[js.Any])
    if (!js.isUndefined(UnknownHostCount)) __obj.updateDynamic("UnknownHostCount")(UnknownHostCount.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[BackendConnectionErrors]
  }
}

