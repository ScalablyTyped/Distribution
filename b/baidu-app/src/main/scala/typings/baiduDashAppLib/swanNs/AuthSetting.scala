package typings
package baiduDashAppLib.swanNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AuthSetting extends js.Object {
  var complete: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var fail: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var `scope.address`: java.lang.String
  var `scope.invoiceTitle`: java.lang.String
  var `scope.record`: java.lang.String
  var `scope.userInfo`: java.lang.String
  var `scope.userLocation`: java.lang.String
  var `scope.werun`: java.lang.String
  var `scope.writePhotosAlbum`: java.lang.String
  var success: js.UndefOr[js.Function1[/* res */ ErrMsgResponse, scala.Unit]] = js.undefined
}

object AuthSetting {
  @scala.inline
  def apply(
    `scope.address`: java.lang.String,
    `scope.invoiceTitle`: java.lang.String,
    `scope.record`: java.lang.String,
    `scope.userInfo`: java.lang.String,
    `scope.userLocation`: java.lang.String,
    `scope.werun`: java.lang.String,
    `scope.writePhotosAlbum`: java.lang.String,
    complete: js.Function0[scala.Unit] = null,
    fail: js.Function0[scala.Unit] = null,
    success: js.Function1[/* res */ ErrMsgResponse, scala.Unit] = null
  ): AuthSetting = {
    val __obj = js.Dynamic.literal(`scope.address` = `scope.address`, `scope.invoiceTitle` = `scope.invoiceTitle`, `scope.record` = `scope.record`, `scope.userInfo` = `scope.userInfo`, `scope.userLocation` = `scope.userLocation`, `scope.werun` = `scope.werun`, `scope.writePhotosAlbum` = `scope.writePhotosAlbum`)
    if (complete != null) __obj.updateDynamic("complete")(complete)
    if (fail != null) __obj.updateDynamic("fail")(fail)
    if (success != null) __obj.updateDynamic("success")(success)
    __obj.asInstanceOf[AuthSetting]
  }
}

