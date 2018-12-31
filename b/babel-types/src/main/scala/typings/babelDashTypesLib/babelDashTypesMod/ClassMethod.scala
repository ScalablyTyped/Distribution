package typings
package babelDashTypesLib.babelDashTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ClassMethod extends Node {
  var async: scala.Boolean
  var body: BlockStatement
  var computed: scala.Boolean
  var decorators: js.UndefOr[js.Array[Decorator]] = js.undefined
  var expression: scala.Boolean
  var generator: scala.Boolean
  var id: Identifier
  var key: Expression
  var kind: babelDashTypesLib.babelDashTypesLibStrings.constructor | babelDashTypesLib.babelDashTypesLibStrings.method | babelDashTypesLib.babelDashTypesLibStrings.get | babelDashTypesLib.babelDashTypesLibStrings.set
  var params: js.Array[LVal]
  var returnType: js.UndefOr[TypeAnnotation] = js.undefined
  var static: scala.Boolean
  var typeParameters: js.UndefOr[TypeParameterDeclaration] = js.undefined
  @JSName("type")
  var type_ClassMethod: babelDashTypesLib.babelDashTypesLibStrings.ClassMethod
  var value: js.UndefOr[FunctionExpression] = js.undefined
}

