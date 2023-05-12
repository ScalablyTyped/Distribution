package typings.classValidator

import typings.classValidator.typesDecoratorValidationOptionsMod.ValidationOptions
import typings.std.PropertyDecorator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesDecoratorStringIsTimeZoneMod {
  
  @JSImport("class-validator/types/decorator/string/IsTimeZone", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("class-validator/types/decorator/string/IsTimeZone", "IS_TIMEZONE")
  @js.native
  val IS_TIMEZONE: /* "isTimeZone" */ String = js.native
  
  inline def IsTimeZone_(): PropertyDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("IsTimeZone")().asInstanceOf[PropertyDecorator]
  inline def IsTimeZone_(validationOptions: ValidationOptions): PropertyDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("IsTimeZone")(validationOptions.asInstanceOf[js.Any]).asInstanceOf[PropertyDecorator]
  
  inline def isTimeZone(value: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isTimeZone")(value.asInstanceOf[js.Any]).asInstanceOf[Boolean]
}
