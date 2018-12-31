package typings
package baiduDashAppLib.swanNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LoadingOptions
  extends BaseOptions[js.Any, js.Any] {
  /**
  		 * 是否显示透明蒙层，防止触摸穿透，默认：false
  		 */
  var mask: js.UndefOr[
    scala.Boolean | baiduDashAppLib.baiduDashAppLibStrings.`true` | baiduDashAppLib.baiduDashAppLibStrings.`false`
  ] = js.undefined
  /**
  		 * 提示的内容
  		 */
  var title: java.lang.String
}

