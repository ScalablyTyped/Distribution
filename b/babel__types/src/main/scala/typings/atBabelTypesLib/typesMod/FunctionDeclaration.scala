package typings
package atBabelTypesLib.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FunctionDeclaration extends BaseNode {
  var async: scala.Boolean
  var body: BlockStatement
  var declare: scala.Boolean | scala.Null
  var generator: scala.Boolean
  var id: Identifier | scala.Null
  var params: js.Array[LVal]
  var returnType: TypeAnnotation | TSTypeAnnotation | Noop | scala.Null
  var typeParameters: TypeParameterDeclaration | TSTypeParameterDeclaration | Noop | scala.Null
  @JSName("type")
  var type_FunctionDeclaration: atBabelTypesLib.atBabelTypesLibStrings.FunctionDeclaration
}

