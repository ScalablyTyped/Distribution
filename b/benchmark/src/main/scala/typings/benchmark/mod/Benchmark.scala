package typings.benchmark.mod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Benchmark extends js.Object {
  var aborted: Boolean = js.native
  var compiled: js.Function | String = js.native
  var count: Double = js.native
  var cycles: Double = js.native
  var error: Error = js.native
  var fn: js.Function | String = js.native
  var hz: Double = js.native
  var running: Boolean = js.native
  var setup: js.Function | String = js.native
  var stats: Stats = js.native
  var teardown: js.Function | String = js.native
  var times: Times = js.native
  def abort(): Benchmark = js.native
  def clone(options: Options): Benchmark = js.native
  def compare(benchmark: Benchmark): Double = js.native
  def emit(`type`: String): js.Any = js.native
  def emit(`type`: js.Object): js.Any = js.native
  def listeners(`type`: String): js.Array[js.Function] = js.native
  def off(): Benchmark = js.native
  def off(`type`: js.UndefOr[scala.Nothing], listener: js.Function): Benchmark = js.native
  def off(`type`: String): Benchmark = js.native
  def off(`type`: String, listener: js.Function): Benchmark = js.native
  def off(types: js.Array[String]): Benchmark = js.native
  def on(): Benchmark = js.native
  def on(`type`: js.UndefOr[scala.Nothing], listener: js.Function): Benchmark = js.native
  def on(`type`: String): Benchmark = js.native
  def on(`type`: String, listener: js.Function): Benchmark = js.native
  def on(types: js.Array[String]): Benchmark = js.native
  def reset(): Benchmark = js.native
  def run(): Benchmark = js.native
  def run(options: Options): Benchmark = js.native
}

