package typings
package baiduDashAppLib.swanNs.aiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
		 * 用于检测和识别图片中的植物信息
		 */
trait plantClassifyOptions
  extends baiduDashAppLib.swanNs.BaseOptions[js.Any, js.Any] {
  var image: java.lang.String
   // 图像资源地址
  @JSName("success")
  var success_plantClassifyOptions: js.UndefOr[js.Function1[/* res */ plantClassifyResponse, scala.Unit]] = js.undefined
}

