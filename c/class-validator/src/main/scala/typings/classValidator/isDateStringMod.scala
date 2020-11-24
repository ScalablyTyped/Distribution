package typings.classValidator

import typings.classValidator.validationOptionsMod.ValidationOptions
import typings.std.PropertyDecorator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("class-validator/types/decorator/string/IsDateString", JSImport.Namespace)
@js.native
object isDateStringMod extends js.Object {
  
  val IS_DATE_STRING: /* "isDateString" */ String = js.native
  
  @JSName("IsDateString")
  def IsDateString_(): PropertyDecorator = js.native
  @JSName("IsDateString")
  def IsDateString_(validationOptions: ValidationOptions): PropertyDecorator = js.native
  
  def isDateString(value: js.Any): Boolean = js.native
}
