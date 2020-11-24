package typings.classValidator

import typings.classValidator.validationOptionsMod.ValidationOptions
import typings.std.Date
import typings.std.PropertyDecorator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("class-validator/types/decorator/date/MinDate", JSImport.Namespace)
@js.native
object minDateMod extends js.Object {
  
  val MIN_DATE: /* "minDate" */ String = js.native
  
  @JSName("MinDate")
  def MinDate_(date: Date): PropertyDecorator = js.native
  @JSName("MinDate")
  def MinDate_(date: Date, validationOptions: ValidationOptions): PropertyDecorator = js.native
  
  def minDate(date: js.Any, minDate: Date): Boolean = js.native
}
