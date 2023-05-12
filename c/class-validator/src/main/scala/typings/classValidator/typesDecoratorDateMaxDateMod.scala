package typings.classValidator

import typings.classValidator.typesDecoratorValidationOptionsMod.ValidationOptions
import typings.std.PropertyDecorator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesDecoratorDateMaxDateMod {
  
  @JSImport("class-validator/types/decorator/date/MaxDate", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("class-validator/types/decorator/date/MaxDate", "MAX_DATE")
  @js.native
  val MAX_DATE: /* "maxDate" */ String = js.native
  
  inline def MaxDate_(date: js.Date): PropertyDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("MaxDate")(date.asInstanceOf[js.Any]).asInstanceOf[PropertyDecorator]
  inline def MaxDate_(date: js.Date, validationOptions: ValidationOptions): PropertyDecorator = (^.asInstanceOf[js.Dynamic].applyDynamic("MaxDate")(date.asInstanceOf[js.Any], validationOptions.asInstanceOf[js.Any])).asInstanceOf[PropertyDecorator]
  inline def MaxDate_(date: js.Function0[js.Date]): PropertyDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("MaxDate")(date.asInstanceOf[js.Any]).asInstanceOf[PropertyDecorator]
  inline def MaxDate_(date: js.Function0[js.Date], validationOptions: ValidationOptions): PropertyDecorator = (^.asInstanceOf[js.Dynamic].applyDynamic("MaxDate")(date.asInstanceOf[js.Any], validationOptions.asInstanceOf[js.Any])).asInstanceOf[PropertyDecorator]
  
  inline def maxDate(date: Any, maxDate: js.Date): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("maxDate")(date.asInstanceOf[js.Any], maxDate.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def maxDate(date: Any, maxDate: js.Function0[js.Date]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("maxDate")(date.asInstanceOf[js.Any], maxDate.asInstanceOf[js.Any])).asInstanceOf[Boolean]
}
