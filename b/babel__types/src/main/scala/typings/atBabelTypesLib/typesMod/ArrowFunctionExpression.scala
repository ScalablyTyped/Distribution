package typings
package atBabelTypesLib.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ArrowFunctionExpression extends BaseNode {
  var async: scala.Boolean
  var body: BlockStatement | Expression
  var expression: scala.Boolean | scala.Null
  var generator: scala.Boolean
  var params: js.Array[LVal]
  var returnType: TypeAnnotation | TSTypeAnnotation | Noop | scala.Null
  var typeParameters: TypeParameterDeclaration | TSTypeParameterDeclaration | Noop | scala.Null
  @JSName("type")
  var type_ArrowFunctionExpression: atBabelTypesLib.atBabelTypesLibStrings.ArrowFunctionExpression
}

