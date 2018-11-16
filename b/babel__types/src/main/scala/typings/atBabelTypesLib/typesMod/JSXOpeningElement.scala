package typings
package atBabelTypesLib.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait JSXOpeningElement extends BaseNode {
  var attributes: js.Array[JSXAttribute | JSXSpreadAttribute]
  var name: JSXIdentifier | JSXMemberExpression
  var selfClosing: scala.Boolean
  var typeParameters: TypeParameterInstantiation | TSTypeParameterInstantiation | scala.Null
  @JSName("type")
  var type_JSXOpeningElement: atBabelTypesLib.atBabelTypesLibStrings.JSXOpeningElement
}

