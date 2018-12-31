package typings
package babelDashTypesLib.babelDashTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ClassProperty extends Node {
  var decorators: js.UndefOr[js.Array[Decorator]] = js.undefined
  var key: Identifier
  var typeAnnotation: js.UndefOr[TypeAnnotation] = js.undefined
  @JSName("type")
  var type_ClassProperty: babelDashTypesLib.babelDashTypesLibStrings.ClassProperty
  var value: Expression
}

