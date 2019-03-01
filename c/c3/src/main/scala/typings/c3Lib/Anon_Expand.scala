package typings
package c3Lib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Expand extends js.Object {
  /**
    * Enable or disable expanding pie pieces.
    */
  var expand: js.UndefOr[scala.Boolean] = js.undefined
  var label: js.UndefOr[Anon_Format] = js.undefined
}

object Anon_Expand {
  @scala.inline
  def apply(expand: js.UndefOr[scala.Boolean] = js.undefined, label: Anon_Format = null): Anon_Expand = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(expand)) __obj.updateDynamic("expand")(expand)
    if (label != null) __obj.updateDynamic("label")(label)
    __obj.asInstanceOf[Anon_Expand]
  }
}

