package typings
package atBabelTypesLib.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait ObjectPattern extends BaseNode {
  var decorators: js.Array[Decorator] | scala.Null
  var properties: js.Array[RestElement | ObjectProperty]
  var typeAnnotation: TypeAnnotation | TSTypeAnnotation | Noop | scala.Null
  @JSName("type")
  var type_ObjectPattern: atBabelTypesLib.atBabelTypesLibStrings.ObjectPattern
}

