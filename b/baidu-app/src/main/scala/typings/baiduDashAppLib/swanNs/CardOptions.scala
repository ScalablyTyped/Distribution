package typings
package baiduDashAppLib.swanNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait CardOptions
  extends BaseOptions[js.Any, js.Any] {
  var cardList: js.Array[Card]
  @JSName("complete")
  var complete_CardOptions: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  @JSName("fail")
  var fail_CardOptions: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  @JSName("success")
  var success_CardOptions: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
}

