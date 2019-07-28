package typings.coreDashJs.webTimersMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("core-js/web/timers", "WeakMap")
@js.native
class WeakMap[K /* <: js.Object */, V] ()
  extends typings.std.WeakMap[K, V] {
  def this(entries: js.Array[js.Tuple2[K, V]]) = this()
}

