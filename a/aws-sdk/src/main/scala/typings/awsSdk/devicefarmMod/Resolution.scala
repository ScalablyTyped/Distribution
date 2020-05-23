package typings.awsSdk.devicefarmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Resolution extends js.Object {
  /**
    * The screen resolution's height, expressed in pixels.
    */
  var height: js.UndefOr[Integer] = js.native
  /**
    * The screen resolution's width, expressed in pixels.
    */
  var width: js.UndefOr[Integer] = js.native
}

object Resolution {
  @scala.inline
  def apply(height: js.UndefOr[Integer] = js.undefined, width: js.UndefOr[Integer] = js.undefined): Resolution = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(height)) __obj.updateDynamic("height")(height.get.asInstanceOf[js.Any])
    if (!js.isUndefined(width)) __obj.updateDynamic("width")(width.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Resolution]
  }
}

