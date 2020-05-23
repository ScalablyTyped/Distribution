package typings.cypress.Cypress

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AfterScreenshotReturnObject extends js.Object {
  var dimensions: js.UndefOr[Dimensions] = js.undefined
  var path: js.UndefOr[String] = js.undefined
  var size: js.UndefOr[Double] = js.undefined
}

object AfterScreenshotReturnObject {
  @scala.inline
  def apply(dimensions: Dimensions = null, path: String = null, size: js.UndefOr[Double] = js.undefined): AfterScreenshotReturnObject = {
    val __obj = js.Dynamic.literal()
    if (dimensions != null) __obj.updateDynamic("dimensions")(dimensions.asInstanceOf[js.Any])
    if (path != null) __obj.updateDynamic("path")(path.asInstanceOf[js.Any])
    if (!js.isUndefined(size)) __obj.updateDynamic("size")(size.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[AfterScreenshotReturnObject]
  }
}

