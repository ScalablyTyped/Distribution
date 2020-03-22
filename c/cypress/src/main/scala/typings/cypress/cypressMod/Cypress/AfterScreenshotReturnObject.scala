package typings.cypress.cypressMod.Cypress

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
  def apply(dimensions: Dimensions = null, path: String = null, size: Int | Double = null): AfterScreenshotReturnObject = {
    val __obj = js.Dynamic.literal()
    if (dimensions != null) __obj.updateDynamic("dimensions")(dimensions.asInstanceOf[js.Any])
    if (path != null) __obj.updateDynamic("path")(path.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    __obj.asInstanceOf[AfterScreenshotReturnObject]
  }
}

