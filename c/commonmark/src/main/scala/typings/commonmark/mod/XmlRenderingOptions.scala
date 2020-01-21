package typings.commonmark.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait XmlRenderingOptions extends js.Object {
  var sourcepos: js.UndefOr[Boolean] = js.undefined
  var time: js.UndefOr[Boolean] = js.undefined
}

object XmlRenderingOptions {
  @scala.inline
  def apply(sourcepos: js.UndefOr[Boolean] = js.undefined, time: js.UndefOr[Boolean] = js.undefined): XmlRenderingOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(sourcepos)) __obj.updateDynamic("sourcepos")(sourcepos.asInstanceOf[js.Any])
    if (!js.isUndefined(time)) __obj.updateDynamic("time")(time.asInstanceOf[js.Any])
    __obj.asInstanceOf[XmlRenderingOptions]
  }
}

