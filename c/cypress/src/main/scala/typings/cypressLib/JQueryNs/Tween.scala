package typings
package cypressLib.JQueryNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// This should be a class but doesn't work correctly under the JQuery namespace. Tween should be an inner class of jQuery.
// Undocumented
// https://github.com/jquery/api.jquery.com/issues/391
// https://github.com/jquery/api.jquery.com/issues/61
trait Tween[TElement] extends js.Object {
  var easing: java.lang.String
  var elem: TElement
  var end: scala.Double
  var now: scala.Double
  var options: EffectsOptions[TElement]
  var pos: scala.Double
  var prop: java.lang.String
  var start: scala.Double
  var unit: java.lang.String
}

object Tween {
  @scala.inline
  def apply[TElement](
    easing: java.lang.String,
    elem: TElement,
    end: scala.Double,
    now: scala.Double,
    options: EffectsOptions[TElement],
    pos: scala.Double,
    prop: java.lang.String,
    start: scala.Double,
    unit: java.lang.String
  ): Tween[TElement] = {
    val __obj = js.Dynamic.literal(easing = easing, elem = elem.asInstanceOf[js.Any], end = end, now = now, options = options, pos = pos, prop = prop, start = start, unit = unit)
  
    __obj.asInstanceOf[Tween[TElement]]
  }
}

