package typings.benchmark.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("benchmark", "Deferred")
@js.native
class Deferred protected () extends js.Object {
  def this(clone: Benchmark) = this()
  
  var benchmark: Benchmark = js.native
  
  var cycles: Double = js.native
  
  var elapsed: Double = js.native
  
  def resolve(): Unit = js.native
  
  var timeStamp: Double = js.native
}
