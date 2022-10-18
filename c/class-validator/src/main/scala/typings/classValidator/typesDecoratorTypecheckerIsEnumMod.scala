package typings.classValidator

import typings.classValidator.typesDecoratorValidationOptionsMod.ValidationOptions
import typings.std.PropertyDecorator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesDecoratorTypecheckerIsEnumMod {
  
  @JSImport("class-validator/types/decorator/typechecker/IsEnum", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("class-validator/types/decorator/typechecker/IsEnum", "IS_ENUM")
  @js.native
  val IS_ENUM: /* "isEnum" */ String = js.native
  
  inline def IsEnum_(entity: js.Object): PropertyDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("IsEnum")(entity.asInstanceOf[js.Any]).asInstanceOf[PropertyDecorator]
  inline def IsEnum_(entity: js.Object, validationOptions: ValidationOptions): PropertyDecorator = (^.asInstanceOf[js.Dynamic].applyDynamic("IsEnum")(entity.asInstanceOf[js.Any], validationOptions.asInstanceOf[js.Any])).asInstanceOf[PropertyDecorator]
  
  inline def isEnum(value: Any, entity: Any): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isEnum")(value.asInstanceOf[js.Any], entity.asInstanceOf[js.Any])).asInstanceOf[Boolean]
}
