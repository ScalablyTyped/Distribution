package typings.cypress.JQueryNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// This should be a class but doesn't work correctly under the JQuery namespace. Tween should be an inner class of jQuery.
// Undocumented
// https://github.com/jquery/api.jquery.com/issues/391
// https://github.com/jquery/api.jquery.com/issues/61
trait Tween[TElement] extends js.Object {
  var easing: String
  var elem: TElement
  var end: Double
  var now: Double
  var options: EffectsOptions[TElement]
  var pos: Double
  var prop: String
  var start: Double
  var unit: String
}

object Tween {
  @scala.inline
  def apply[TElement](
    easing: String,
    elem: TElement,
    end: Double,
    now: Double,
    options: EffectsOptions[TElement],
    pos: Double,
    prop: String,
    start: Double,
    unit: String
  ): Tween[TElement] = {
    val __obj = js.Dynamic.literal(easing = easing, elem = elem.asInstanceOf[js.Any], end = end, now = now, options = options, pos = pos, prop = prop, start = start, unit = unit)
  
    __obj.asInstanceOf[Tween[TElement]]
  }
}

