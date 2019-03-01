package typings
package c3Lib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_R extends js.Object {
  /**
    * The radius size of each point on selected.
    */
  var r: js.UndefOr[scala.Double] = js.undefined
}

object Anon_R {
  @scala.inline
  def apply(r: scala.Int | scala.Double = null): Anon_R = {
    val __obj = js.Dynamic.literal()
    if (r != null) __obj.updateDynamic("r")(r.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_R]
  }
}

