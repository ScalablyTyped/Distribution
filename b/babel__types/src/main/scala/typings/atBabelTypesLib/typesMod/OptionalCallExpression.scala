package typings
package atBabelTypesLib.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait OptionalCallExpression extends BaseNode {
  var arguments: js.Array[Expression | SpreadElement | JSXNamespacedName]
  var callee: Expression
  var optional: scala.Boolean
  var typeArguments: TypeParameterInstantiation | scala.Null
  var typeParameters: TSTypeParameterInstantiation | scala.Null
  @JSName("type")
  var type_OptionalCallExpression: atBabelTypesLib.atBabelTypesLibStrings.OptionalCallExpression
}

