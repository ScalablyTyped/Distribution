package typings
package baiduDashAppLib.swanNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ActionSheetOptions
  extends BaseOptions[js.Any, js.Any] {
  /**
  		 * 按钮的文字颜色，默认为"#000000"
  		 */
  var itemColor: js.UndefOr[java.lang.String] = js.undefined
  /**
  		 * 按钮的文字数组，数组长度最大为6个
  		 */
  var itemList: js.Array[java.lang.String]
  /**
  		 * 接口调用成功的回调函数
  		 */
  @JSName("success")
  var success_ActionSheetOptions: js.UndefOr[js.Function1[/* res */ baiduDashAppLib.Anon_TapIndex, scala.Unit]] = js.undefined
}

