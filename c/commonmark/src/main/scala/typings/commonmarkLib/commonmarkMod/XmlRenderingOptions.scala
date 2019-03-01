package typings
package commonmarkLib.commonmarkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait XmlRenderingOptions extends js.Object {
  var sourcepos: js.UndefOr[scala.Boolean] = js.undefined
  var time: js.UndefOr[scala.Boolean] = js.undefined
}

object XmlRenderingOptions {
  @scala.inline
  def apply(
    sourcepos: js.UndefOr[scala.Boolean] = js.undefined,
    time: js.UndefOr[scala.Boolean] = js.undefined
  ): XmlRenderingOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(sourcepos)) __obj.updateDynamic("sourcepos")(sourcepos)
    if (!js.isUndefined(time)) __obj.updateDynamic("time")(time)
    __obj.asInstanceOf[XmlRenderingOptions]
  }
}

