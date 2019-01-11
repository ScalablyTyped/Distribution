package typings
package atBabelTypesLib.atBabelTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JSXElement extends BaseNode {
  var children: js.Array[JSXText | JSXExpressionContainer | JSXSpreadChild | JSXElement | JSXFragment]
  var closingElement: JSXClosingElement | scala.Null
  var openingElement: JSXOpeningElement
  var selfClosing: js.Any
  @JSName("type")
  var type_JSXElement: atBabelTypesLib.atBabelTypesLibStrings.JSXElement
}

