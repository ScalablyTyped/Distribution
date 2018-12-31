package typings
package babelDashTypesLib.babelDashTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JSXElement extends Node {
  var children: js.Array[JSXElement | JSXExpressionContainer | JSXText]
  var closingElement: JSXClosingElement
  var openingElement: JSXOpeningElement
  var selfClosing: js.UndefOr[scala.Boolean] = js.undefined
  @JSName("type")
  var type_JSXElement: babelDashTypesLib.babelDashTypesLibStrings.JSXElement
}

