package typings.ckeditor.CKEDITOR.dom

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait shrinkOptions extends js.Object {
  var shrinkOnBlockBoundary: js.UndefOr[Boolean] = js.undefined
  var skipBogus: js.UndefOr[Boolean] = js.undefined
}

object shrinkOptions {
  @scala.inline
  def apply(
    shrinkOnBlockBoundary: js.UndefOr[Boolean] = js.undefined,
    skipBogus: js.UndefOr[Boolean] = js.undefined
  ): shrinkOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(shrinkOnBlockBoundary)) __obj.updateDynamic("shrinkOnBlockBoundary")(shrinkOnBlockBoundary.asInstanceOf[js.Any])
    if (!js.isUndefined(skipBogus)) __obj.updateDynamic("skipBogus")(skipBogus.asInstanceOf[js.Any])
    __obj.asInstanceOf[shrinkOptions]
  }
}

