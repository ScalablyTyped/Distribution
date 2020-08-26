package typings.benchmark.mod

import typings.benchmark.anon.Name
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("benchmark", "Suite")
@js.native
class Suite () extends js.Object {
  def this(name: String) = this()
  def this(name: js.UndefOr[scala.Nothing], options: Options) = this()
  def this(name: String, options: Options) = this()
  var aborted: Boolean = js.native
  var length: Double = js.native
  var running: Boolean = js.native
  def abort(): Suite = js.native
  def add(fn: String): Suite = js.native
  def add(fn: String, options: Options): Suite = js.native
  def add(fn: js.Function): Suite = js.native
  def add(fn: js.Function, options: Options): Suite = js.native
  def add(name: String, fn: String): Suite = js.native
  def add(name: String, fn: String, options: Options): Suite = js.native
  def add(name: String, fn: js.Function): Suite = js.native
  def add(name: String, fn: js.Function, options: Options): Suite = js.native
  def add(options: Options): Suite = js.native
  def clone(options: Options): Suite = js.native
  def emit(`type`: String): js.Any = js.native
  def emit(`type`: js.Object): js.Any = js.native
  def filter(callback: String): Suite = js.native
  def filter(callback: js.Function): Suite = js.native
  def forEach(callback: js.Function): Suite = js.native
  def indexOf(value: js.Any): Double = js.native
  def invoke(name: String, args: js.Any*): js.Array[_] = js.native
  def join(): String = js.native
  def join(separator: String): String = js.native
  def listeners(`type`: String): js.Array[js.Function] = js.native
  def map(callback: js.Function): js.Array[_] = js.native
  def off(): Suite = js.native
  def off(`type`: js.UndefOr[scala.Nothing], callback: js.Function): Suite = js.native
  def off(`type`: String): Suite = js.native
  def off(`type`: String, callback: js.Function): Suite = js.native
  def off(types: js.Array[String]): Suite = js.native
  def on(): Suite = js.native
  def on(`type`: js.UndefOr[scala.Nothing], callback: js.Function): Suite = js.native
  def on(`type`: String): Suite = js.native
  def on(`type`: String, callback: js.Function): Suite = js.native
  def on(types: js.Array[String]): Suite = js.native
  def pluck(property: String): js.Array[_] = js.native
  def pop(): js.Function = js.native
  def push(benchmark: Benchmark): Double = js.native
  def reduce[T](callback: js.Function, accumulator: T): T = js.native
  def reset(): Suite = js.native
  def reverse(): js.Array[_] = js.native
  def run(): Suite = js.native
  def run(options: Options): Suite = js.native
  def shift(): Benchmark = js.native
  def slice(start: Double, deleteCount: Double, values: js.Any*): js.Array[_] = js.native
  def slice(start: Double, end: Double): js.Array[_] = js.native
  def unshift(benchmark: Benchmark): Double = js.native
}

/* static members */
@JSImport("benchmark", "Suite")
@js.native
object Suite extends js.Object {
  var options: Name = js.native
}

