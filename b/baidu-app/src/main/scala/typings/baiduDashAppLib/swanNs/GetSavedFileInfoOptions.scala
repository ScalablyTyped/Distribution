package typings
package baiduDashAppLib.swanNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait GetSavedFileInfoOptions
  extends BaseOptions[js.Any, js.Any] {
  var filePath: java.lang.String
  /** 接口调用成功的回调函数 */
  @JSName("success")
  var success_GetSavedFileInfoOptions: js.UndefOr[js.Function1[/* res */ SavedFileInfoData, scala.Unit]] = js.undefined
}

