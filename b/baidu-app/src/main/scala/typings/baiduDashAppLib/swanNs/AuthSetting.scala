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

