package typings.cypress.JQuery

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @see \`{@link https://gist.github.com/gnarf/54829d408993526fe475#tweens }\`
  * @since 1.8
  */
// This should be a class but doesn't work correctly under the JQuery namespace. Tween should be an inner class of jQuery.
trait Tween[TElement] extends js.Object {
  /**
    * The easing used
    * @see \`{@link https://gist.github.com/gnarf/54829d408993526fe475#tweens }\`
    * @since 1.8
    */
  var easing: String
  /**
    * The element being animated
    * @see \`{@link https://gist.github.com/gnarf/54829d408993526fe475#tweens }\`
    * @since 1.8
    */
  var elem: TElement
  /**
    * The ending value of the tween
    * @see \`{@link https://gist.github.com/gnarf/54829d408993526fe475#tweens }\`
    * @since 1.8
    */
  var end: Double
  /**
    * The current value of the tween
    * @see \`{@link https://gist.github.com/gnarf/54829d408993526fe475#tweens }\`
    * @since 1.8
    */
  var now: Double
  /**
    * A reference to the animation options
    * @see \`{@link https://gist.github.com/gnarf/54829d408993526fe475#tweens }\`
    * @since 1.8
    */
  var options: EffectsOptions[TElement]
  // Undocumented. Is this intended to be public?
  var pos: js.UndefOr[Double] = js.undefined
  /**
    * The property being animated
    * @see \`{@link https://gist.github.com/gnarf/54829d408993526fe475#tweens }\`
    * @since 1.8
    */
  var prop: String
  /**
    * The starting value of the tween
    * @see \`{@link https://gist.github.com/gnarf/54829d408993526fe475#tweens }\`
    * @since 1.8
    */
  var start: Double
  /**
    * The CSS unit for the tween
    * @see \`{@link https://gist.github.com/gnarf/54829d408993526fe475#tweens }\`
    * @since 1.8
    */
  var unit: String
  /**
    * Reads the current value for property from the element
    * @see \`{@link https://gist.github.com/gnarf/54829d408993526fe475#tweens }\`
    * @since 1.8
    */
  def cur(): js.Any
  /**
    * Updates the value for the property on the animated elemd.
    * @param progress A number from 0 to 1.
    * @see \`{@link https://gist.github.com/gnarf/54829d408993526fe475#tweens }\`
    * @since 1.8
    */
  def run(progress: Double): this.type
}

object Tween {
  @scala.inline
  def apply[TElement](
    cur: () => js.Any,
    easing: String,
    elem: TElement,
    end: Double,
    now: Double,
    options: EffectsOptions[TElement],
    prop: String,
    run: Double => Tween[TElement],
    start: Double,
    unit: String,
    pos: Int | Double = null
  ): Tween[TElement] = {
    val __obj = js.Dynamic.literal(cur = js.Any.fromFunction0(cur), easing = easing.asInstanceOf[js.Any], elem = elem.asInstanceOf[js.Any], end = end.asInstanceOf[js.Any], now = now.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], prop = prop.asInstanceOf[js.Any], run = js.Any.fromFunction1(run), start = start.asInstanceOf[js.Any], unit = unit.asInstanceOf[js.Any])
    if (pos != null) __obj.updateDynamic("pos")(pos.asInstanceOf[js.Any])
    __obj.asInstanceOf[Tween[TElement]]
  }
}

