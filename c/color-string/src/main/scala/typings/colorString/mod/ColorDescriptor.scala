package typings.colorString.mod

import typings.colorString.colorStringStrings.hsl
import typings.colorString.colorStringStrings.hwb
import typings.colorString.colorStringStrings.rgb
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ColorDescriptor extends js.Object {
  var model: rgb | hsl | hwb
  var value: Color
}

object ColorDescriptor {
  @scala.inline
  def apply(model: rgb | hsl | hwb, value: Color): ColorDescriptor = {
    val __obj = js.Dynamic.literal(model = model.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ColorDescriptor]
  }
}

