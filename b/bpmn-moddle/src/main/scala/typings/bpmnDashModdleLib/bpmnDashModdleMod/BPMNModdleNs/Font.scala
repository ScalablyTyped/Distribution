package typings
package bpmnDashModdleLib.bpmnDashModdleMod.BPMNModdleNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Font extends TypeDerived {
  var isBold: scala.Boolean
  var isItalic: scala.Boolean
  var isStrikeThrough: scala.Boolean
  var isUnderline: scala.Boolean
  var name: java.lang.String
  var size: scala.Double
}

object Font {
  @scala.inline
  def apply(
    $type: ElementType,
    isBold: scala.Boolean,
    isItalic: scala.Boolean,
    isStrikeThrough: scala.Boolean,
    isUnderline: scala.Boolean,
    name: java.lang.String,
    size: scala.Double
  ): Font = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("$type")($type)
    __obj.updateDynamic("isBold")(isBold)
    __obj.updateDynamic("isItalic")(isItalic)
    __obj.updateDynamic("isStrikeThrough")(isStrikeThrough)
    __obj.updateDynamic("isUnderline")(isUnderline)
    __obj.updateDynamic("name")(name)
    __obj.updateDynamic("size")(size)
    __obj.asInstanceOf[Font]
  }
}

