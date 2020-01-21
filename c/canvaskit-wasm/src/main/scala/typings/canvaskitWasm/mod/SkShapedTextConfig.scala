package typings.canvaskitWasm.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SkShapedTextConfig extends js.Object {
  var font: SkFont
  var leftToRight: Boolean
  var text: String
  var width: Double
}

object SkShapedTextConfig {
  @scala.inline
  def apply(font: SkFont, leftToRight: Boolean, text: String, width: Double): SkShapedTextConfig = {
    val __obj = js.Dynamic.literal(font = font.asInstanceOf[js.Any], leftToRight = leftToRight.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[SkShapedTextConfig]
  }
}

