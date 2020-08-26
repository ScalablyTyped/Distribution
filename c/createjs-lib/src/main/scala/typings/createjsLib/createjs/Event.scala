package typings.createjsLib.createjs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Event extends js.Object {
  // properties
  var bubbles: Boolean = js.native
  var cancelable: Boolean = js.native
  var currentTarget: js.Any = js.native
  // other event payloads
  var data: js.Any = js.native
   // It is 'Object' type officially, but 'any' is easier to use.
  var defaultPrevented: Boolean = js.native
  var delta: Double = js.native
  var error: String = js.native
  var eventPhase: Double = js.native
  var id: String = js.native
  var immediatePropagationStopped: Boolean = js.native
  var item: js.Any = js.native
  var loaded: Double = js.native
  var name: String = js.native
  var next: String = js.native
  var params: js.Any = js.native
  var paused: Boolean = js.native
  var progress: Double = js.native
  var propagationStopped: Boolean = js.native
  var rawResult: js.Any = js.native
  var removed: Boolean = js.native
  var result: js.Any = js.native
  var runTime: Double = js.native
  var src: String = js.native
  var target: js.Any = js.native
  var time: Double = js.native
   // It is 'Object' type officially, but 'any' is easier to use.
  var timeStamp: Double = js.native
  var total: Double = js.native
  var `type`: String = js.native
  def preventDefault(): Unit = js.native
  def remove(): Unit = js.native
  def set(props: js.Object): Event = js.native
  def stopImmediatePropagation(): Unit = js.native
  def stopPropagation(): Unit = js.native
}

object Event {
  @scala.inline
  def apply(
    bubbles: Boolean,
    cancelable: Boolean,
    currentTarget: js.Any,
    data: js.Any,
    defaultPrevented: Boolean,
    delta: Double,
    error: String,
    eventPhase: Double,
    id: String,
    immediatePropagationStopped: Boolean,
    item: js.Any,
    loaded: Double,
    name: String,
    next: String,
    params: js.Any,
    paused: Boolean,
    preventDefault: () => Unit,
    progress: Double,
    propagationStopped: Boolean,
    rawResult: js.Any,
    remove: () => Unit,
    removed: Boolean,
    result: js.Any,
    runTime: Double,
    set: js.Object => Event,
    src: String,
    stopImmediatePropagation: () => Unit,
    stopPropagation: () => Unit,
    target: js.Any,
    time: Double,
    timeStamp: Double,
    total: Double,
    `type`: String
  ): Event = {
    val __obj = js.Dynamic.literal(bubbles = bubbles.asInstanceOf[js.Any], cancelable = cancelable.asInstanceOf[js.Any], currentTarget = currentTarget.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], defaultPrevented = defaultPrevented.asInstanceOf[js.Any], delta = delta.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], eventPhase = eventPhase.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], immediatePropagationStopped = immediatePropagationStopped.asInstanceOf[js.Any], item = item.asInstanceOf[js.Any], loaded = loaded.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], next = next.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any], paused = paused.asInstanceOf[js.Any], preventDefault = js.Any.fromFunction0(preventDefault), progress = progress.asInstanceOf[js.Any], propagationStopped = propagationStopped.asInstanceOf[js.Any], rawResult = rawResult.asInstanceOf[js.Any], remove = js.Any.fromFunction0(remove), removed = removed.asInstanceOf[js.Any], result = result.asInstanceOf[js.Any], runTime = runTime.asInstanceOf[js.Any], set = js.Any.fromFunction1(set), src = src.asInstanceOf[js.Any], stopImmediatePropagation = js.Any.fromFunction0(stopImmediatePropagation), stopPropagation = js.Any.fromFunction0(stopPropagation), target = target.asInstanceOf[js.Any], time = time.asInstanceOf[js.Any], timeStamp = timeStamp.asInstanceOf[js.Any], total = total.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Event]
  }
  @scala.inline
  implicit class EventOps[Self <: Event] (val x: Self) extends AnyVal {
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
    def setBubbles(value: Boolean): Self = this.set("bubbles", value.asInstanceOf[js.Any])
    @scala.inline
    def setCancelable(value: Boolean): Self = this.set("cancelable", value.asInstanceOf[js.Any])
    @scala.inline
    def setCurrentTarget(value: js.Any): Self = this.set("currentTarget", value.asInstanceOf[js.Any])
    @scala.inline
    def setData(value: js.Any): Self = this.set("data", value.asInstanceOf[js.Any])
    @scala.inline
    def setDefaultPrevented(value: Boolean): Self = this.set("defaultPrevented", value.asInstanceOf[js.Any])
    @scala.inline
    def setDelta(value: Double): Self = this.set("delta", value.asInstanceOf[js.Any])
    @scala.inline
    def setError(value: String): Self = this.set("error", value.asInstanceOf[js.Any])
    @scala.inline
    def setEventPhase(value: Double): Self = this.set("eventPhase", value.asInstanceOf[js.Any])
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setImmediatePropagationStopped(value: Boolean): Self = this.set("immediatePropagationStopped", value.asInstanceOf[js.Any])
    @scala.inline
    def setItem(value: js.Any): Self = this.set("item", value.asInstanceOf[js.Any])
    @scala.inline
    def setLoaded(value: Double): Self = this.set("loaded", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setNext(value: String): Self = this.set("next", value.asInstanceOf[js.Any])
    @scala.inline
    def setParams(value: js.Any): Self = this.set("params", value.asInstanceOf[js.Any])
    @scala.inline
    def setPaused(value: Boolean): Self = this.set("paused", value.asInstanceOf[js.Any])
    @scala.inline
    def setPreventDefault(value: () => Unit): Self = this.set("preventDefault", js.Any.fromFunction0(value))
    @scala.inline
    def setProgress(value: Double): Self = this.set("progress", value.asInstanceOf[js.Any])
    @scala.inline
    def setPropagationStopped(value: Boolean): Self = this.set("propagationStopped", value.asInstanceOf[js.Any])
    @scala.inline
    def setRawResult(value: js.Any): Self = this.set("rawResult", value.asInstanceOf[js.Any])
    @scala.inline
    def setRemove(value: () => Unit): Self = this.set("remove", js.Any.fromFunction0(value))
    @scala.inline
    def setRemoved(value: Boolean): Self = this.set("removed", value.asInstanceOf[js.Any])
    @scala.inline
    def setResult(value: js.Any): Self = this.set("result", value.asInstanceOf[js.Any])
    @scala.inline
    def setRunTime(value: Double): Self = this.set("runTime", value.asInstanceOf[js.Any])
    @scala.inline
    def setSet(value: js.Object => Event): Self = this.set("set", js.Any.fromFunction1(value))
    @scala.inline
    def setSrc(value: String): Self = this.set("src", value.asInstanceOf[js.Any])
    @scala.inline
    def setStopImmediatePropagation(value: () => Unit): Self = this.set("stopImmediatePropagation", js.Any.fromFunction0(value))
    @scala.inline
    def setStopPropagation(value: () => Unit): Self = this.set("stopPropagation", js.Any.fromFunction0(value))
    @scala.inline
    def setTarget(value: js.Any): Self = this.set("target", value.asInstanceOf[js.Any])
    @scala.inline
    def setTime(value: Double): Self = this.set("time", value.asInstanceOf[js.Any])
    @scala.inline
    def setTimeStamp(value: Double): Self = this.set("timeStamp", value.asInstanceOf[js.Any])
    @scala.inline
    def setTotal(value: Double): Self = this.set("total", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
  }
  
}

