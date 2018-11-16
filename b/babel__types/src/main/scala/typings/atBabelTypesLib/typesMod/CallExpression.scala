package typings
package atBabelTypesLib.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait CallExpression extends BaseNode {
  var arguments: js.Array[Expression | SpreadElement | JSXNamespacedName]
  var callee: Expression
  var optional: atBabelTypesLib.atBabelTypesLibNumbers.`true` | atBabelTypesLib.atBabelTypesLibNumbers.`false` | scala.Null
  var typeArguments: TypeParameterInstantiation | scala.Null
  var typeParameters: TSTypeParameterInstantiation | scala.Null
  @JSName("type")
  var type_CallExpression: atBabelTypesLib.atBabelTypesLibStrings.CallExpression
}

