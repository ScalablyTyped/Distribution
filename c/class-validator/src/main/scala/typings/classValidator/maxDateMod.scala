package typings.classValidator

import typings.classValidator.validationOptionsMod.ValidationOptions
import typings.std.Date
import typings.std.PropertyDecorator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object maxDateMod {
  
  @JSImport("class-validator/types/decorator/date/MaxDate", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("class-validator/types/decorator/date/MaxDate", "MAX_DATE")
  @js.native
  val MAX_DATE: /* "maxDate" */ String = js.native
  
  inline def MaxDate_(date: Date): PropertyDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("MaxDate")(date.asInstanceOf[js.Any]).asInstanceOf[PropertyDecorator]
  inline def MaxDate_(date: Date, validationOptions: ValidationOptions): PropertyDecorator = (^.asInstanceOf[js.Dynamic].applyDynamic("MaxDate")(date.asInstanceOf[js.Any], validationOptions.asInstanceOf[js.Any])).asInstanceOf[PropertyDecorator]
  
  inline def maxDate(date: js.Any, maxDate: Date): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("maxDate")(date.asInstanceOf[js.Any], maxDate.asInstanceOf[js.Any])).asInstanceOf[Boolean]
}
