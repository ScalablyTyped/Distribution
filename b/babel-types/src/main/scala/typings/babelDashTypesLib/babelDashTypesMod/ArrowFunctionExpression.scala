package typings
package babelDashTypesLib.babelDashTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait ArrowFunctionExpression extends Node {
  var async: scala.Boolean
  var body: BlockStatement | Expression
  var expression: scala.Boolean
  var generator: scala.Boolean
  var id: Identifier
  var params: js.Array[LVal]
  var returnType: js.UndefOr[TypeAnnotation] = js.undefined
  var typeParameters: js.UndefOr[TypeParameterDeclaration] = js.undefined
  @JSName("type")
  var type_ArrowFunctionExpression: babelDashTypesLib.babelDashTypesLibStrings.ArrowFunctionExpression
}

