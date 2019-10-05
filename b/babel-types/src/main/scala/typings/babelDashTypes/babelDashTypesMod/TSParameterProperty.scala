package typings.babelDashTypes.babelDashTypesMod

import typings.babelDashTypes.babelDashTypesStrings.`private`
import typings.babelDashTypes.babelDashTypesStrings.`protected`
import typings.babelDashTypes.babelDashTypesStrings.public
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TSParameterProperty
  extends Node
     with LVal {
  var accessibility: public | `private` | `protected` | Null
  var parameter: Identifier | AssignmentPattern
  var readonly: Boolean | Null
  @JSName("type")
  var type_TSParameterProperty: typings.babelDashTypes.babelDashTypesStrings.TSParameterProperty
}

@JSImport("babel-types", "TSParameterProperty")
@js.native
object TSParameterProperty extends js.Object {
  def apply(parameter: AssignmentPattern): TSParameterProperty = js.native
  def apply(parameter: Identifier): TSParameterProperty = js.native
}

