package typings
package benchmarkLib.benchmarkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Benchmark extends js.Object {
  var aborted: scala.Boolean = js.native
  var compiled: js.Function | java.lang.String = js.native
  var count: scala.Double = js.native
  var cycles: scala.Double = js.native
  var error: stdLib.Error = js.native
  var fn: js.Function | java.lang.String = js.native
  var hz: scala.Double = js.native
  var running: scala.Boolean = js.native
  var setup: js.Function | java.lang.String = js.native
  var stats: benchmarkLib.benchmarkMod.BenchmarkNs.Stats = js.native
  var teardown: js.Function | java.lang.String = js.native
  var times: benchmarkLib.benchmarkMod.BenchmarkNs.Times = js.native
  def abort(): Benchmark = js.native
  def clone(options: benchmarkLib.benchmarkMod.BenchmarkNs.Options): Benchmark = js.native
  def compare(benchmark: Benchmark): scala.Double = js.native
  def emit(`type`: java.lang.String): js.Any = js.native
  def emit(`type`: js.Object): js.Any = js.native
  def listeners(`type`: java.lang.String): js.Array[js.Function] = js.native
  def off(): Benchmark = js.native
  def off(`type`: java.lang.String): Benchmark = js.native
  def off(`type`: java.lang.String, listener: js.Function): Benchmark = js.native
  def off(types: js.Array[java.lang.String]): Benchmark = js.native
  def on(): Benchmark = js.native
  def on(`type`: java.lang.String): Benchmark = js.native
  def on(`type`: java.lang.String, listener: js.Function): Benchmark = js.native
  def on(types: js.Array[java.lang.String]): Benchmark = js.native
  def reset(): Benchmark = js.native
  def run(): Benchmark = js.native
  def run(options: benchmarkLib.benchmarkMod.BenchmarkNs.Options): Benchmark = js.native
}

