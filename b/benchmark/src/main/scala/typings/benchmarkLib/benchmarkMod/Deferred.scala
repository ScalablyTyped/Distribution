package typings
package benchmarkLib.benchmarkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("benchmark", "Deferred")
@js.native
class Deferred protected () extends js.Object {
  def this(clone: Benchmark) = this()
  var benchmark: Benchmark = js.native
  var cycles: scala.Double = js.native
  var elapsed: scala.Double = js.native
  var timeStamp: scala.Double = js.native
}

