package typings.baiduDashApp.swan

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AuthSetting extends js.Object {
  var complete: js.UndefOr[js.Function0[Unit]] = js.undefined
  var fail: js.UndefOr[js.Function0[Unit]] = js.undefined
  var `scope.address`: String
  var `scope.invoiceTitle`: String
  var `scope.record`: String
  var `scope.userInfo`: String
  var `scope.userLocation`: String
  var `scope.werun`: String
  var `scope.writePhotosAlbum`: String
  var success: js.UndefOr[js.Function1[/* res */ ErrMsgResponse, Unit]] = js.undefined
}

object AuthSetting {
  @scala.inline
  def apply(
    `scope.address`: String,
    `scope.invoiceTitle`: String,
    `scope.record`: String,
    `scope.userInfo`: String,
    `scope.userLocation`: String,
    `scope.werun`: String,
    `scope.writePhotosAlbum`: String,
    complete: () => Unit = null,
    fail: () => Unit = null,
    success: /* res */ ErrMsgResponse => Unit = null
  ): AuthSetting = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("scope.address")(`scope.address`.asInstanceOf[js.Any])
    __obj.updateDynamic("scope.invoiceTitle")(`scope.invoiceTitle`.asInstanceOf[js.Any])
    __obj.updateDynamic("scope.record")(`scope.record`.asInstanceOf[js.Any])
    __obj.updateDynamic("scope.userInfo")(`scope.userInfo`.asInstanceOf[js.Any])
    __obj.updateDynamic("scope.userLocation")(`scope.userLocation`.asInstanceOf[js.Any])
    __obj.updateDynamic("scope.werun")(`scope.werun`.asInstanceOf[js.Any])
    __obj.updateDynamic("scope.writePhotosAlbum")(`scope.writePhotosAlbum`.asInstanceOf[js.Any])
    if (complete != null) __obj.updateDynamic("complete")(js.Any.fromFunction0(complete))
    if (fail != null) __obj.updateDynamic("fail")(js.Any.fromFunction0(fail))
    if (success != null) __obj.updateDynamic("success")(js.Any.fromFunction1(success))
    __obj.asInstanceOf[AuthSetting]
  }
}

