package typings.babelTypes.ts36Mod

import typings.babelTypes.babelTypesStrings.`private`
import typings.babelTypes.babelTypesStrings.`protected`
import typings.babelTypes.babelTypesStrings.public
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TSParameterProperty
  extends Node
     with LVal {
  
  var accessibility: public | `private` | `protected` | Null = js.native
  
  var parameter: Identifier_ | AssignmentPattern_ = js.native
  
  var readonly: Boolean | Null = js.native
  
  @JSName("type")
  var type_TSParameterProperty: typings.babelTypes.babelTypesStrings.TSParameterProperty = js.native
}
@JSImport("babel-types/ts3.6", "TSParameterProperty")
@js.native
object TSParameterProperty extends js.Object {
  
  def apply(parameter: AssignmentPattern_): TSParameterProperty = js.native
  def apply(parameter: Identifier_): TSParameterProperty = js.native
}
