package typings.classValidator

import typings.classValidator.typesDecoratorValidationOptionsMod.ValidationOptions
import typings.std.PropertyDecorator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesDecoratorStringIsISO31661Alpha3Mod {
  
  @JSImport("class-validator/types/decorator/string/IsISO31661Alpha3", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("class-validator/types/decorator/string/IsISO31661Alpha3", "IS_ISO31661_ALPHA_3")
  @js.native
  val IS_ISO31661_ALPHA_3: /* "isISO31661Alpha3" */ String = js.native
  
  inline def IsISO31661Alpha3_(): PropertyDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("IsISO31661Alpha3")().asInstanceOf[PropertyDecorator]
  inline def IsISO31661Alpha3_(validationOptions: ValidationOptions): PropertyDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("IsISO31661Alpha3")(validationOptions.asInstanceOf[js.Any]).asInstanceOf[PropertyDecorator]
  
  inline def isISO31661Alpha3(value: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isISO31661Alpha3")(value.asInstanceOf[js.Any]).asInstanceOf[Boolean]
}
