package typings
package atBabelTypesLib.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ArrayPattern extends BaseNode {
  var decorators: js.Array[Decorator] | scala.Null
  var elements: js.Array[PatternLike]
  var typeAnnotation: TypeAnnotation | TSTypeAnnotation | Noop | scala.Null
  @JSName("type")
  var type_ArrayPattern: atBabelTypesLib.atBabelTypesLibStrings.ArrayPattern
}

