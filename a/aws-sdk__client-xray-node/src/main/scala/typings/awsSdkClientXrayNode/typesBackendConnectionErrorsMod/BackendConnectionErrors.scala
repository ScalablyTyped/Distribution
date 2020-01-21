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
    ConnectionRefusedCount: Int | Double = null,
    HTTPCode4XXCount: Int | Double = null,
    HTTPCode5XXCount: Int | Double = null,
    OtherCount: Int | Double = null,
    TimeoutCount: Int | Double = null,
    UnknownHostCount: Int | Double = null
  ): BackendConnectionErrors = {
    val __obj = js.Dynamic.literal()
    if (ConnectionRefusedCount != null) __obj.updateDynamic("ConnectionRefusedCount")(ConnectionRefusedCount.asInstanceOf[js.Any])
    if (HTTPCode4XXCount != null) __obj.updateDynamic("HTTPCode4XXCount")(HTTPCode4XXCount.asInstanceOf[js.Any])
    if (HTTPCode5XXCount != null) __obj.updateDynamic("HTTPCode5XXCount")(HTTPCode5XXCount.asInstanceOf[js.Any])
    if (OtherCount != null) __obj.updateDynamic("OtherCount")(OtherCount.asInstanceOf[js.Any])
    if (TimeoutCount != null) __obj.updateDynamic("TimeoutCount")(TimeoutCount.asInstanceOf[js.Any])
    if (UnknownHostCount != null) __obj.updateDynamic("UnknownHostCount")(UnknownHostCount.asInstanceOf[js.Any])
    __obj.asInstanceOf[BackendConnectionErrors]
  }
}

