package typings
package babelDashTypesLib.babelDashTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ObjectMethod extends Node {
  var async: scala.Boolean
  var body: BlockStatement
  var computed: scala.Boolean
  var decorators: js.UndefOr[js.Array[Decorator]] = js.undefined
  var generator: scala.Boolean
  var id: Identifier
  var key: Expression
  var kind: babelDashTypesLib.babelDashTypesLibStrings.get | babelDashTypesLib.babelDashTypesLibStrings.set | babelDashTypesLib.babelDashTypesLibStrings.method
  var params: js.Array[LVal]
  var returnType: js.UndefOr[TypeAnnotation] = js.undefined
  var shorthand: scala.Boolean
  var typeParameters: js.UndefOr[TypeParameterDeclaration] = js.undefined
  @JSName("type")
  var type_ObjectMethod: babelDashTypesLib.babelDashTypesLibStrings.ObjectMethod
  var value: Expression
}

