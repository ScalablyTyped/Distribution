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
    val __obj = js.Dynamic.literal($type = $type, isBold = isBold, isItalic = isItalic, isStrikeThrough = isStrikeThrough, isUnderline = isUnderline, name = name, size = size)
  
    __obj.asInstanceOf[Font]
  }
}

