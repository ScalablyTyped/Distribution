package typings
package atBabelTypesLib.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait ObjectProperty extends BaseNode {
  var computed: scala.Boolean
  var decorators: js.Array[Decorator] | scala.Null
  var key: js.Any
  var shorthand: scala.Boolean
  @JSName("type")
  var type_ObjectProperty: atBabelTypesLib.atBabelTypesLibStrings.ObjectProperty
  var value: Expression | PatternLike
}

