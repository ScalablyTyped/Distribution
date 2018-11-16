package typings
package benchmarkLib.benchmarkMod.BenchmarkNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Suite extends js.Object {
  var aborted: scala.Boolean = js.native
  var length: scala.Double = js.native
  var running: scala.Boolean = js.native
  def abort(): Suite = js.native
  def add(fn: java.lang.String): Suite = js.native
  def add(fn: java.lang.String, options: Options): Suite = js.native
  def add(fn: js.Function): Suite = js.native
  def add(fn: js.Function, options: Options): Suite = js.native
  def add(name: java.lang.String, fn: java.lang.String): Suite = js.native
  def add(name: java.lang.String, fn: java.lang.String, options: Options): Suite = js.native
  def add(name: java.lang.String, fn: js.Function): Suite = js.native
  def add(name: java.lang.String, fn: js.Function, options: Options): Suite = js.native
  def add(options: Options): Suite = js.native
  def clone(options: Options): Suite = js.native
  def emit(`type`: java.lang.String): js.Any = js.native
  def emit(`type`: js.Object): js.Any = js.native
  def filter(callback: java.lang.String): Suite = js.native
  def filter(callback: js.Function): Suite = js.native
  def forEach(callback: js.Function): Suite = js.native
  def indexOf(value: js.Any): scala.Double = js.native
  def invoke(name: java.lang.String, args: js.Any*): js.Array[_] = js.native
  def join(): java.lang.String = js.native
  def join(separator: java.lang.String): java.lang.String = js.native
  def listeners(`type`: java.lang.String): js.Array[js.Function] = js.native
  def map(callback: js.Function): js.Array[_] = js.native
  def off(): Suite = js.native
  def off(`type`: java.lang.String): Suite = js.native
  def off(`type`: java.lang.String, callback: js.Function): Suite = js.native
  def off(types: js.Array[java.lang.String]): Suite = js.native
  def on(): Suite = js.native
  def on(`type`: java.lang.String): Suite = js.native
  def on(`type`: java.lang.String, callback: js.Function): Suite = js.native
  def on(types: js.Array[java.lang.String]): Suite = js.native
  def pluck(property: java.lang.String): js.Array[_] = js.native
  def pop(): js.Function = js.native
  def push(benchmark: benchmarkLib.benchmarkMod.Benchmark): scala.Double = js.native
  def reduce[T](callback: js.Function, accumulator: T): T = js.native
  def reset(): Suite = js.native
  def reverse(): js.Array[_] = js.native
  def run(): Suite = js.native
  def run(options: Options): Suite = js.native
  def shift(): benchmarkLib.benchmarkMod.Benchmark = js.native
  def slice(start: scala.Double, deleteCount: scala.Double, values: js.Any*): js.Array[_] = js.native
  def slice(start: scala.Double, end: scala.Double): js.Array[_] = js.native
  def unshift(benchmark: benchmarkLib.benchmarkMod.Benchmark): scala.Double = js.native
}

