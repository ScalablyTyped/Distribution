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
    val __obj = js.Dynamic.literal($parent = $parent, $type = $type, isBold = isBold, isItalic = isItalic, isStrikeThrough = isStrikeThrough, isUnderline = isUnderline, name = name, size = size)
  
    __obj.asInstanceOf[Font]
  }
}

