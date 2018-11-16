package typings
package atBabelTypesLib.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait Identifier extends BaseNode {
  var decorators: js.Array[Decorator] | scala.Null
  var name: java.lang.String
  var optional: scala.Boolean | scala.Null
  var typeAnnotation: TypeAnnotation | TSTypeAnnotation | Noop | scala.Null
  @JSName("type")
  var type_Identifier: atBabelTypesLib.atBabelTypesLibStrings.Identifier
}

