package typings.awsSdkClientXrayNode.typesBackendConnectionErrorsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BackendConnectionErrors extends js.Object {
  /**
    * <p/>
    */
  var ConnectionRefusedCount: js.UndefOr[Double] = js.undefined
  /**
    * <p/>
    */
  var HTTPCode4XXCount: js.UndefOr[Double] = js.undefined
  /**
    * <p/>
    */
  var HTTPCode5XXCount: js.UndefOr[Double] = js.undefined
  /**
    * <p/>
    */
  var OtherCount: js.UndefOr[Double] = js.undefined
  /**
    * <p/>
    */
  var TimeoutCount: js.UndefOr[Double] = js.undefined
  /**
    * <p/>
    */
  var UnknownHostCount: js.UndefOr[Double] = js.undefined
}

object BackendConnectionErrors {
  @scala.inline
  def apply(
    ConnectionRefusedCount: js.UndefOr[Double] = js.undefined,
    HTTPCode4XXCount: js.UndefOr[Double] = js.undefined,
    HTTPCode5XXCount: js.UndefOr[Double] = js.undefined,
    OtherCount: js.UndefOr[Double] = js.undefined,
    TimeoutCount: js.UndefOr[Double] = js.undefined,
    UnknownHostCount: js.UndefOr[Double] = js.undefined
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

