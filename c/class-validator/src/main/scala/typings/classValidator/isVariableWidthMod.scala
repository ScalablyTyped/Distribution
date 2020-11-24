package typings.classValidator

import typings.classValidator.validationOptionsMod.ValidationOptions
import typings.std.PropertyDecorator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("class-validator/types/decorator/string/IsVariableWidth", JSImport.Namespace)
@js.native
object isVariableWidthMod extends js.Object {
  
  val IS_VARIABLE_WIDTH: /* "isVariableWidth" */ String = js.native
  
  @JSName("IsVariableWidth")
  def IsVariableWidth_(): PropertyDecorator = js.native
  @JSName("IsVariableWidth")
  def IsVariableWidth_(validationOptions: ValidationOptions): PropertyDecorator = js.native
  
  def isVariableWidth(value: js.Any): Boolean = js.native
}
