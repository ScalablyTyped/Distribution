package typings
package cypressLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_IntervalOff extends js.Object {
  /**
    * The rate (in milliseconds) at which animations fire.
    *
    * @see \`{@link https://api.jquery.com/jQuery.fx.interval/ }\`
    * @since 1.4.3
    *
    * @deprecated Deprecated since 3.0. See \`{@link https://api.jquery.com/jQuery.fx.interval/ }\`.
    */
  var interval: scala.Double
  /**
    * Globally disable all animations.
    *
    * @see \`{@link https://api.jquery.com/jQuery.fx.off/ }\`
    * @since 1.3
    */
  var off: scala.Boolean
  var step: cypressLib.JQueryNs.PlainObject[cypressLib.JQueryNs.AnimationHook[stdLib.Node]]
}

object Anon_IntervalOff {
  @scala.inline
  def apply(
    interval: scala.Double,
    off: scala.Boolean,
    step: cypressLib.JQueryNs.PlainObject[cypressLib.JQueryNs.AnimationHook[stdLib.Node]]
  ): Anon_IntervalOff = {
    val __obj = js.Dynamic.literal(interval = interval, off = off, step = step)
  
    __obj.asInstanceOf[Anon_IntervalOff]
  }
}

