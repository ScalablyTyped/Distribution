package typings.classValidator

import typings.classValidator.typesDecoratorValidationOptionsMod.ValidationOptions
import typings.std.PropertyDecorator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesDecoratorStringIsTaxIdMod {
  
  @JSImport("class-validator/types/decorator/string/is-tax-id", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("class-validator/types/decorator/string/is-tax-id", "IS_TAX_ID")
  @js.native
  val IS_TAX_ID: /* "isTaxId" */ String = js.native
  
  inline def IsTaxId_(): PropertyDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("IsTaxId")().asInstanceOf[PropertyDecorator]
  inline def IsTaxId_(locale: String): PropertyDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("IsTaxId")(locale.asInstanceOf[js.Any]).asInstanceOf[PropertyDecorator]
  inline def IsTaxId_(locale: String, validationOptions: ValidationOptions): PropertyDecorator = (^.asInstanceOf[js.Dynamic].applyDynamic("IsTaxId")(locale.asInstanceOf[js.Any], validationOptions.asInstanceOf[js.Any])).asInstanceOf[PropertyDecorator]
  inline def IsTaxId_(locale: Unit, validationOptions: ValidationOptions): PropertyDecorator = (^.asInstanceOf[js.Dynamic].applyDynamic("IsTaxId")(locale.asInstanceOf[js.Any], validationOptions.asInstanceOf[js.Any])).asInstanceOf[PropertyDecorator]
  
  inline def isTaxId(value: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isTaxId")(value.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  inline def isTaxId(value: Any, locale: String): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isTaxId")(value.asInstanceOf[js.Any], locale.asInstanceOf[js.Any])).asInstanceOf[Boolean]
}
