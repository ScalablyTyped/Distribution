package typings
package canvasjsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_FileName extends js.Object {
  var fileName: js.UndefOr[java.lang.String] = js.undefined
  var format: canvasjsLib.canvasjsLibStrings.jpg | canvasjsLib.canvasjsLibStrings.png
  var toDataURL: js.UndefOr[scala.Boolean] = js.undefined
}

object Anon_FileName {
  @scala.inline
  def apply(
    format: canvasjsLib.canvasjsLibStrings.jpg | canvasjsLib.canvasjsLibStrings.png,
    fileName: java.lang.String = null,
    toDataURL: js.UndefOr[scala.Boolean] = js.undefined
  ): Anon_FileName = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("format")(format.asInstanceOf[js.Any])
    if (fileName != null) __obj.updateDynamic("fileName")(fileName)
    if (!js.isUndefined(toDataURL)) __obj.updateDynamic("toDataURL")(toDataURL)
    __obj.asInstanceOf[Anon_FileName]
  }
}

