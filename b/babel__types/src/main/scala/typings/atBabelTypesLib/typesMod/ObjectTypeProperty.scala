package typings
package atBabelTypesLib.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ObjectTypeProperty extends BaseNode {
  var key: Identifier | StringLiteral
  var kind: atBabelTypesLib.atBabelTypesLibStrings.init | atBabelTypesLib.atBabelTypesLibStrings.get | atBabelTypesLib.atBabelTypesLibStrings.set | scala.Null
  var optional: scala.Boolean | scala.Null
  var proto: scala.Boolean | scala.Null
  var static: scala.Boolean | scala.Null
  @JSName("type")
  var type_ObjectTypeProperty: atBabelTypesLib.atBabelTypesLibStrings.ObjectTypeProperty
  var value: FlowType
  var variance: Variance | scala.Null
}

