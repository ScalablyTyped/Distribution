package typings
package babelDashTypesLib.babelDashTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait AssignmentProperty extends Node {
  var computed: scala.Boolean
  var decorators: js.UndefOr[js.Array[Decorator]] = js.undefined
  var key: Expression
  var shorthand: scala.Boolean
  @JSName("type")
  var type_AssignmentProperty: babelDashTypesLib.babelDashTypesLibStrings.ObjectProperty
  var value: Pattern
}

