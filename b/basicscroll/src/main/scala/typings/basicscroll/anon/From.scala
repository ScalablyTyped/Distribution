package typings.basicscroll.anon

import typings.basicscroll.mod.AnimatedType
import typings.basicscroll.mod.KnownTimings
import typings.basicscroll.mod.TimingFunction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait From extends js.Object {
  /**
    * Start and end values.
    * @default null
    */
  var from: js.UndefOr[AnimatedType] = js.undefined
  /**
    * Animation timing.
    * @default 'linear'
    */
  var timing: js.UndefOr[KnownTimings | TimingFunction] = js.undefined
  /**
    * Start and end values.
    * @default null
    */
  var to: js.UndefOr[AnimatedType] = js.undefined
}

object From {
  @scala.inline
  def apply(
    from: js.UndefOr[Null | AnimatedType] = js.undefined,
    timing: KnownTimings | TimingFunction = null,
    to: js.UndefOr[Null | AnimatedType] = js.undefined
  ): From = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(from)) __obj.updateDynamic("from")(from.asInstanceOf[js.Any])
    if (timing != null) __obj.updateDynamic("timing")(timing.asInstanceOf[js.Any])
    if (!js.isUndefined(to)) __obj.updateDynamic("to")(to.asInstanceOf[js.Any])
    __obj.asInstanceOf[From]
  }
}

