package typings.chaiJquery.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Interval extends js.Object {
  /**
    * The rate (in milliseconds) at which animations fire.
    */
  var interval: Double = js.native
  /**
    * Globally disable all animations.
    */
  var off: Boolean = js.native
  var speeds: Fast = js.native
  var step: js.Any = js.native
  def stop(): Unit = js.native
  def tick(): Unit = js.native
}

object Interval {
  @scala.inline
  def apply(interval: Double, off: Boolean, speeds: Fast, step: js.Any, stop: () => Unit, tick: () => Unit): Interval = {
    val __obj = js.Dynamic.literal(interval = interval.asInstanceOf[js.Any], off = off.asInstanceOf[js.Any], speeds = speeds.asInstanceOf[js.Any], step = step.asInstanceOf[js.Any], stop = js.Any.fromFunction0(stop), tick = js.Any.fromFunction0(tick))
    __obj.asInstanceOf[Interval]
  }
  @scala.inline
  implicit class IntervalOps[Self <: Interval] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setInterval(value: Double): Self = this.set("interval", value.asInstanceOf[js.Any])
    @scala.inline
    def setOff(value: Boolean): Self = this.set("off", value.asInstanceOf[js.Any])
    @scala.inline
    def setSpeeds(value: Fast): Self = this.set("speeds", value.asInstanceOf[js.Any])
    @scala.inline
    def setStep(value: js.Any): Self = this.set("step", value.asInstanceOf[js.Any])
    @scala.inline
    def setStop(value: () => Unit): Self = this.set("stop", js.Any.fromFunction0(value))
    @scala.inline
    def setTick(value: () => Unit): Self = this.set("tick", js.Any.fromFunction0(value))
  }
  
}

