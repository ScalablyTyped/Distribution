package typings.classValidator

import typings.classValidator.typesDecoratorValidationOptionsMod.ValidationOptions
import typings.std.PropertyDecorator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesDecoratorTypecheckerIsStringMod {
  
  @JSImport("class-validator/types/decorator/typechecker/IsString", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("class-validator/types/decorator/typechecker/IsString", "IS_STRING")
  @js.native
  val IS_STRING: /* "isString" */ String = js.native
  
  inline def IsString_(): PropertyDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("IsString")().asInstanceOf[PropertyDecorator]
  inline def IsString_(validationOptions: ValidationOptions): PropertyDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("IsString")(validationOptions.asInstanceOf[js.Any]).asInstanceOf[PropertyDecorator]
  
  inline def isString(value: Any): /* is string */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isString")(value.asInstanceOf[js.Any]).asInstanceOf[/* is string */ Boolean]
}
