package typings.canvasjs

import typings.canvasjs.canvasjsStrings.jpg
import typings.canvasjs.canvasjsStrings.png
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonFileName extends js.Object {
  var fileName: js.UndefOr[String] = js.undefined
  var format: jpg | png
  var toDataURL: js.UndefOr[Boolean] = js.undefined
}

object AnonFileName {
  @scala.inline
  def apply(format: jpg | png, fileName: String = null, toDataURL: js.UndefOr[Boolean] = js.undefined): AnonFileName = {
    val __obj = js.Dynamic.literal(format = format.asInstanceOf[js.Any])
    if (fileName != null) __obj.updateDynamic("fileName")(fileName.asInstanceOf[js.Any])
    if (!js.isUndefined(toDataURL)) __obj.updateDynamic("toDataURL")(toDataURL.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonFileName]
  }
}

