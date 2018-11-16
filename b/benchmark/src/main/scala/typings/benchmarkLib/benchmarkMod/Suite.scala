package typings
package benchmarkLib.benchmarkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("benchmark", "Suite")
@js.native
class Suite ()
  extends benchmarkLib.benchmarkMod.BenchmarkNs.Suite {
  def this(name: java.lang.String) = this()
  def this(name: java.lang.String, options: benchmarkLib.benchmarkMod.BenchmarkNs.Options) = this()
}

@JSImport("benchmark", "Suite")
@js.native
object Suite extends js.Object {
  var options: benchmarkLib.Anon_Name = js.native
}

