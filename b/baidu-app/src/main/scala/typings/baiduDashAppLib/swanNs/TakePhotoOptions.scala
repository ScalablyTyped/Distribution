package typings
package baiduDashAppLib.swanNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait TakePhotoOptions
  extends BaseOptions[js.Any, js.Any] {
  /** 成像质量，值为high, normal, low，默认normal */
  var quality: js.UndefOr[java.lang.String] = js.undefined
  @JSName("success")
  var success_TakePhotoOptions: js.UndefOr[js.Function1[/* res */ baiduDashAppLib.Anon_TempImagePath, scala.Unit]] = js.undefined
}

