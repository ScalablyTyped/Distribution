package typings.classValidator

import typings.classValidator.validationOptionsMod.ValidationOptions
import typings.std.Date
import typings.std.PropertyDecorator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object minDateMod {
  
  @JSImport("class-validator/types/decorator/date/MinDate", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("class-validator/types/decorator/date/MinDate", "MIN_DATE")
  @js.native
  val MIN_DATE: /* "minDate" */ String = js.native
  
  @scala.inline
  def MinDate_(date: Date): PropertyDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("MinDate")(date.asInstanceOf[js.Any]).asInstanceOf[PropertyDecorator]
  @scala.inline
  def MinDate_(date: Date, validationOptions: ValidationOptions): PropertyDecorator = (^.asInstanceOf[js.Dynamic].applyDynamic("MinDate")(date.asInstanceOf[js.Any], validationOptions.asInstanceOf[js.Any])).asInstanceOf[PropertyDecorator]
  
  @scala.inline
  def minDate(date: js.Any, minDate: Date): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("minDate")(date.asInstanceOf[js.Any], minDate.asInstanceOf[js.Any])).asInstanceOf[Boolean]
}
