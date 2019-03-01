package typings
package colorLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AlphaB extends js.Object {
  var alpha: js.UndefOr[scala.Double] = js.undefined
  var b: scala.Double
  var g: scala.Double
  var r: scala.Double
}

object Anon_AlphaB {
  @scala.inline
  def apply(b: scala.Double, g: scala.Double, r: scala.Double, alpha: scala.Int | scala.Double = null): Anon_AlphaB = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("b")(b)
    __obj.updateDynamic("g")(g)
    __obj.updateDynamic("r")(r)
    if (alpha != null) __obj.updateDynamic("alpha")(alpha.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_AlphaB]
  }
}

