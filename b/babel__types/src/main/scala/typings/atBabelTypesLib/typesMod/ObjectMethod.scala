package typings
package atBabelTypesLib.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait ObjectMethod extends BaseNode {
  var async: scala.Boolean
  var body: BlockStatement
  var computed: scala.Boolean
  var decorators: js.Array[Decorator] | scala.Null
  var generator: scala.Boolean
  var key: js.Any
  var kind: atBabelTypesLib.atBabelTypesLibStrings.method | atBabelTypesLib.atBabelTypesLibStrings.get | atBabelTypesLib.atBabelTypesLibStrings.set
  var params: js.Array[LVal]
  var returnType: TypeAnnotation | TSTypeAnnotation | Noop | scala.Null
  var typeParameters: TypeParameterDeclaration | TSTypeParameterDeclaration | Noop | scala.Null
  @JSName("type")
  var type_ObjectMethod: atBabelTypesLib.atBabelTypesLibStrings.ObjectMethod
}

