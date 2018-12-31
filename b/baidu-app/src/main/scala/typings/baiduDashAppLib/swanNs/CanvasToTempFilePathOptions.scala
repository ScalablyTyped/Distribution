package typings
package baiduDashAppLib.swanNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CanvasToTempFilePathOptions
  extends BaseOptions[js.Any, js.Any] {
  /**
  		 * 画布标识，传入 <canvas/> 的 cavas-id
  		 */
  var canvasId: java.lang.String
  	// 输出图片宽度（默认为 width * 屏幕像素密度）
  var destHeight: js.UndefOr[scala.Double] = js.undefined
  	// 画布高度（默认为 canvas 高度 - y）
  var destWidth: js.UndefOr[scala.Double] = js.undefined
  	// 输出图片高度（默认为 height * 屏幕像素密度）
  var fileType: js.UndefOr[java.lang.String] = js.undefined
  	// 画布宽度（默认为 canvas 宽度 - x）
  var height: js.UndefOr[scala.Double] = js.undefined
  	// 画布 y 轴起点（默认 0 ）
  var width: js.UndefOr[scala.Double] = js.undefined
  var x: js.UndefOr[scala.Double] = js.undefined
  	// 画布 x 轴起点（默认 0 ）
  var y: js.UndefOr[scala.Double] = js.undefined
}

