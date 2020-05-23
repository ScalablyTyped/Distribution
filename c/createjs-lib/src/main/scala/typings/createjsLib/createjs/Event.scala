package typings.createjsLib.createjs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Event extends js.Object {
  // properties
  var bubbles: Boolean
  var cancelable: Boolean
  var currentTarget: js.Any
  // other event payloads
  var data: js.Any
   // It is 'Object' type officially, but 'any' is easier to use.
  var defaultPrevented: Boolean
  var delta: Double
  var error: String
  var eventPhase: Double
  var id: String
  var immediatePropagationStopped: Boolean
  var item: js.Any
  var loaded: Double
  var name: String
  var next: String
  var params: js.Any
  var paused: Boolean
  var progress: Double
  var propagationStopped: Boolean
  var rawResult: js.Any
  var removed: Boolean
  var result: js.Any
  var runTime: Double
  var src: String
  var target: js.Any
  var time: Double
   // It is 'Object' type officially, but 'any' is easier to use.
  var timeStamp: Double
  var total: Double
  var `type`: String
  def preventDefault(): Unit
  def remove(): Unit
  def set(props: js.Object): Event
  def stopImmediatePropagation(): Unit
  def stopPropagation(): Unit
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
}

