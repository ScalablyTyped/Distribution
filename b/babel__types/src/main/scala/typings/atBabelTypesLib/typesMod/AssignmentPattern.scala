package typings
package atBabelTypesLib.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AssignmentPattern extends BaseNode {
  var decorators: js.Array[Decorator] | scala.Null
  var left: Identifier | ObjectPattern | ArrayPattern
  var right: Expression
  var typeAnnotation: TypeAnnotation | TSTypeAnnotation | Noop | scala.Null
  @JSName("type")
  var type_AssignmentPattern: atBabelTypesLib.atBabelTypesLibStrings.AssignmentPattern
}

