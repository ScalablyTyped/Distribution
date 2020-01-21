package typings.countupJs.mod

import typings.std.HTMLElement
import typings.std.HTMLInputElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("countup.js", "CountUp")
@js.native
class CountUp protected () extends js.Object {
  def this(target: String, endVal: Double) = this()
  def this(target: HTMLElement, endVal: Double) = this()
  def this(target: HTMLInputElement, endVal: Double) = this()
  def this(target: String, endVal: Double, options: CountUpOptions) = this()
  def this(target: HTMLElement, endVal: Double, options: CountUpOptions) = this()
  def this(target: HTMLInputElement, endVal: Double, options: CountUpOptions) = this()
  var countDown: js.Any = js.native
  var decimalMult: js.Any = js.native
  var defaults: js.Any = js.native
  var determineDirectionAndSmartEasing: js.Any = js.native
  var duration: Double = js.native
  var easingFn: js.UndefOr[
    js.Function4[/* t */ Double, /* b */ Double, /* c */ Double, /* d */ Double, Double]
  ] = js.native
  var el: js.Any = js.native
  var endVal: js.Any = js.native
  var error: String = js.native
  var finalEndVal: js.Any = js.native
  var frameVal: Double = js.native
  var options: js.UndefOr[js.Any] = js.native
  var paused: Boolean = js.native
  var rAF: js.Any = js.native
  var remaining: js.Any = js.native
  var resetDuration: js.Any = js.native
  var startTime: js.Any = js.native
  var startVal: Double = js.native
  var target: js.Any = js.native
  var useEasing: js.Any = js.native
  var version: String = js.native
  def callback(): js.Any = js.native
  def callback(args: js.Any): js.Any = js.native
  def count(timestamp: Double): Unit = js.native
  def easeOutExpo(t: Double, b: Double, c: Double, d: Double): Double = js.native
  def ensureNumber(n: js.Any): Boolean = js.native
  def formatNumber(num: Double): String = js.native
  def formattingFn(num: Double): String = js.native
  def pauseResume(): Unit = js.native
  def printValue(`val`: Double): Unit = js.native
  def reset(): Unit = js.native
  def start(): Unit = js.native
  def start(callback: js.Function1[/* args */ js.UndefOr[js.Any], _]): Unit = js.native
  def update(newEndVal: js.Any): Unit = js.native
  def validateValue(value: Double): Double = js.native
}

