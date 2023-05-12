package typings.classValidator

import typings.classValidator.typesDecoratorValidationOptionsMod.ValidationOptions
import typings.std.PropertyDecorator
import typings.validator.mod.validator.AlphanumericLocale
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesDecoratorStringIsAlphanumericMod {
  
  @JSImport("class-validator/types/decorator/string/IsAlphanumeric", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("class-validator/types/decorator/string/IsAlphanumeric", "IS_ALPHANUMERIC")
  @js.native
  val IS_ALPHANUMERIC: /* "isAlphanumeric" */ String = js.native
  
  inline def IsAlphanumeric_(): PropertyDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("IsAlphanumeric")().asInstanceOf[PropertyDecorator]
  inline def IsAlphanumeric_(locale: Unit, validationOptions: ValidationOptions): PropertyDecorator = (^.asInstanceOf[js.Dynamic].applyDynamic("IsAlphanumeric")(locale.asInstanceOf[js.Any], validationOptions.asInstanceOf[js.Any])).asInstanceOf[PropertyDecorator]
  inline def IsAlphanumeric_(locale: AlphanumericLocale): PropertyDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("IsAlphanumeric")(locale.asInstanceOf[js.Any]).asInstanceOf[PropertyDecorator]
  inline def IsAlphanumeric_(locale: AlphanumericLocale, validationOptions: ValidationOptions): PropertyDecorator = (^.asInstanceOf[js.Dynamic].applyDynamic("IsAlphanumeric")(locale.asInstanceOf[js.Any], validationOptions.asInstanceOf[js.Any])).asInstanceOf[PropertyDecorator]
  
  inline def isAlphanumeric(value: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isAlphanumeric")(value.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  inline def isAlphanumeric(value: Any, locale: AlphanumericLocale): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isAlphanumeric")(value.asInstanceOf[js.Any], locale.asInstanceOf[js.Any])).asInstanceOf[Boolean]
}
