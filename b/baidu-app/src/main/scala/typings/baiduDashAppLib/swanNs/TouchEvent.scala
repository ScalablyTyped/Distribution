package typings
package baiduDashAppLib.swanNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait TouchEvent[T /* <: TouchEventType */]
  extends BaseEvent[T, baiduDashAppLib.Anon_Y] {
  var changedTouches: js.Array[Touch]
  var touches: js.Array[Touch]
}

