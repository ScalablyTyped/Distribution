package typings.bpmnDashModdle.bpmnDashModdleMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Font extends TypeDerived {
  var isBold: Boolean
  var isItalic: Boolean
  var isStrikeThrough: Boolean
  var isUnderline: Boolean
  var name: String
  var size: Double
}

object Font {
  @scala.inline
  def apply(
    $parent: TypeDerived,
    $type: ElementType,
    isBold: Boolean,
    isItalic: Boolean,
    isStrikeThrough: Boolean,
    isUnderline: Boolean,
    name: String,
    size: Double
  ): Font = {
    val __obj = js.Dynamic.literal($parent = $parent.asInstanceOf[js.Any], $type = $type.asInstanceOf[js.Any], isBold = isBold.asInstanceOf[js.Any], isItalic = isItalic.asInstanceOf[js.Any], isStrikeThrough = isStrikeThrough.asInstanceOf[js.Any], isUnderline = isUnderline.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Font]
  }
}

