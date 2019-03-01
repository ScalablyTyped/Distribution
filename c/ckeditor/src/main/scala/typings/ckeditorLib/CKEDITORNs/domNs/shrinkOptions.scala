package typings
package ckeditorLib.CKEDITORNs.domNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait shrinkOptions extends js.Object {
  var shrinkOnBlockBoundary: js.UndefOr[scala.Boolean] = js.undefined
  var skipBogus: js.UndefOr[scala.Boolean] = js.undefined
}

object shrinkOptions {
  @scala.inline
  def apply(
    shrinkOnBlockBoundary: js.UndefOr[scala.Boolean] = js.undefined,
    skipBogus: js.UndefOr[scala.Boolean] = js.undefined
  ): shrinkOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(shrinkOnBlockBoundary)) __obj.updateDynamic("shrinkOnBlockBoundary")(shrinkOnBlockBoundary)
    if (!js.isUndefined(skipBogus)) __obj.updateDynamic("skipBogus")(skipBogus)
    __obj.asInstanceOf[shrinkOptions]
  }
}

