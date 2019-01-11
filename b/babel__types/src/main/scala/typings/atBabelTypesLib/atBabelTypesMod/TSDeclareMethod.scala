package typings
package atBabelTypesLib.atBabelTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TSDeclareMethod extends BaseNode {
  var `abstract`: scala.Boolean | scala.Null
  var access: atBabelTypesLib.atBabelTypesLibStrings.public | atBabelTypesLib.atBabelTypesLibStrings.`private` | atBabelTypesLib.atBabelTypesLibStrings.`protected` | scala.Null
  var accessibility: atBabelTypesLib.atBabelTypesLibStrings.public | atBabelTypesLib.atBabelTypesLibStrings.`private` | atBabelTypesLib.atBabelTypesLibStrings.`protected` | scala.Null
  var async: scala.Boolean
  var computed: scala.Boolean
  var decorators: js.Array[Decorator] | scala.Null
  var generator: scala.Boolean
  var key: Identifier | StringLiteral | NumericLiteral | Expression
  var kind: atBabelTypesLib.atBabelTypesLibStrings.get | atBabelTypesLib.atBabelTypesLibStrings.set | atBabelTypesLib.atBabelTypesLibStrings.method | atBabelTypesLib.atBabelTypesLibStrings.constructor
  var optional: scala.Boolean | scala.Null
  var params: js.Array[LVal]
  var returnType: TSTypeAnnotation | Noop | scala.Null
  var static: scala.Boolean | scala.Null
  var typeParameters: TSTypeParameterDeclaration | Noop | scala.Null
  @JSName("type")
  var type_TSDeclareMethod: atBabelTypesLib.atBabelTypesLibStrings.TSDeclareMethod
}

