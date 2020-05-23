package typings.canvasjs.anon

import typings.canvasjs.canvasjsStrings.jpg
import typings.canvasjs.canvasjsStrings.png
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FileName extends js.Object {
  var fileName: js.UndefOr[String] = js.undefined
  var format: jpg | png
  var toDataURL: js.UndefOr[Boolean] = js.undefined
}

object FileName {
  @scala.inline
  def apply(format: jpg | png, fileName: String = null, toDataURL: js.UndefOr[Boolean] = js.undefined): FileName = {
    val __obj = js.Dynamic.literal(format = format.asInstanceOf[js.Any])
    if (fileName != null) __obj.updateDynamic("fileName")(fileName.asInstanceOf[js.Any])
    if (!js.isUndefined(toDataURL)) __obj.updateDynamic("toDataURL")(toDataURL.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[FileName]
  }
}

