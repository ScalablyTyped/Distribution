package typings.classValidator

import typings.classValidator.validationOptionsMod.ValidationOptions
import typings.std.Date
import typings.std.PropertyDecorator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("class-validator/types/decorator/date/MaxDate", JSImport.Namespace)
@js.native
object maxDateMod extends js.Object {
  
  val MAX_DATE: /* "maxDate" */ String = js.native
  
  @JSName("MaxDate")
  def MaxDate_(date: Date): PropertyDecorator = js.native
  @JSName("MaxDate")
  def MaxDate_(date: Date, validationOptions: ValidationOptions): PropertyDecorator = js.native
  
  def maxDate(date: js.Any, maxDate: Date): Boolean = js.native
}
