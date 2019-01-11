package typings
package atBabelTypesLib.atBabelTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FunctionExpression extends BaseNode {
  var async: scala.Boolean
  var body: BlockStatement
  var generator: scala.Boolean
  var id: Identifier | scala.Null
  var params: js.Array[LVal]
  var returnType: TypeAnnotation | TSTypeAnnotation | Noop | scala.Null
  var typeParameters: TypeParameterDeclaration | TSTypeParameterDeclaration | Noop | scala.Null
  @JSName("type")
  var type_FunctionExpression: atBabelTypesLib.atBabelTypesLibStrings.FunctionExpression
}

