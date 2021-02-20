package typings.classValidator

import typings.classValidator.validationOptionsMod.ValidationOptions
import typings.std.Date
import typings.std.PropertyDecorator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object minDateMod {
  
  @JSImport("class-validator/types/decorator/date/MinDate", "MIN_DATE")
  @js.native
  val MIN_DATE: /* "minDate" */ String = js.native
  
  @JSImport("class-validator/types/decorator/date/MinDate", "MinDate")
  @js.native
  def MinDate_(date: Date): PropertyDecorator = js.native
  @JSImport("class-validator/types/decorator/date/MinDate", "MinDate")
  @js.native
  def MinDate_(date: Date, validationOptions: ValidationOptions): PropertyDecorator = js.native
  
  @JSImport("class-validator/types/decorator/date/MinDate", "minDate")
  @js.native
  def minDate(date: js.Any, minDate: Date): Boolean = js.native
}
