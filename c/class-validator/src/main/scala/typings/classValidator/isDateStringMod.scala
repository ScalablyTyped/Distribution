package typings.classValidator

import typings.classValidator.validationOptionsMod.ValidationOptions
import typings.std.PropertyDecorator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object isDateStringMod {
  
  @JSImport("class-validator/types/decorator/string/IsDateString", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("class-validator/types/decorator/string/IsDateString", "IS_DATE_STRING")
  @js.native
  val IS_DATE_STRING: /* "isDateString" */ String = js.native
  
  inline def IsDateString_(): PropertyDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("IsDateString")().asInstanceOf[PropertyDecorator]
  inline def IsDateString_(validationOptions: ValidationOptions): PropertyDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("IsDateString")(validationOptions.asInstanceOf[js.Any]).asInstanceOf[PropertyDecorator]
  
  inline def isDateString(value: js.Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isDateString")(value.asInstanceOf[js.Any]).asInstanceOf[Boolean]
}
