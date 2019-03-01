package typings
package bgiframeLib.BgiFrameNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ISettings extends js.Object {
  var conditional: scala.Boolean
  var height: java.lang.String
  var left: java.lang.String
  var opacity: scala.Boolean
  var src: java.lang.String
  var top: java.lang.String
  var width: java.lang.String
}

object ISettings {
  @scala.inline
  def apply(
    conditional: scala.Boolean,
    height: java.lang.String,
    left: java.lang.String,
    opacity: scala.Boolean,
    src: java.lang.String,
    top: java.lang.String,
    width: java.lang.String
  ): ISettings = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("conditional")(conditional)
    __obj.updateDynamic("height")(height)
    __obj.updateDynamic("left")(left)
    __obj.updateDynamic("opacity")(opacity)
    __obj.updateDynamic("src")(src)
    __obj.updateDynamic("top")(top)
    __obj.updateDynamic("width")(width)
    __obj.asInstanceOf[ISettings]
  }
}

