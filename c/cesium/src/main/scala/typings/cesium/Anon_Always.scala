package typings.cesium

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Always extends js.Object {
  def always(e: js.Any, t: js.Any): js.Any
  def otherwise(e: js.Any): js.Any
  def spread(t: js.Any): js.Any
  def `then`(e: js.Any): js.Any
  def `yield`(e: js.Any): js.Any
}

object Anon_Always {
  @scala.inline
  def apply(
    always: (js.Any, js.Any) => js.Any,
    otherwise: js.Any => js.Any,
    spread: js.Any => js.Any,
    `then`: js.Any => js.Any,
    `yield`: js.Any => js.Any
  ): Anon_Always = {
    val __obj = js.Dynamic.literal(always = js.Any.fromFunction2(always), otherwise = js.Any.fromFunction1(otherwise), spread = js.Any.fromFunction1(spread))
    __obj.updateDynamic("then")(js.Any.fromFunction1(`then`))
    __obj.updateDynamic("yield")(js.Any.fromFunction1(`yield`))
    __obj.asInstanceOf[Anon_Always]
  }
}

