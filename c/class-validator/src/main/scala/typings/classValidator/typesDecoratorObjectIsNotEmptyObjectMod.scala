package typings.classValidator

import typings.classValidator.anon.Nullable
import typings.classValidator.typesDecoratorValidationOptionsMod.ValidationOptions
import typings.std.PropertyDecorator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesDecoratorObjectIsNotEmptyObjectMod {
  
  @JSImport("class-validator/types/decorator/object/IsNotEmptyObject", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("class-validator/types/decorator/object/IsNotEmptyObject", "IS_NOT_EMPTY_OBJECT")
  @js.native
  val IS_NOT_EMPTY_OBJECT: /* "isNotEmptyObject" */ String = js.native
  
  inline def IsNotEmptyObject_(): PropertyDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("IsNotEmptyObject")().asInstanceOf[PropertyDecorator]
  inline def IsNotEmptyObject_(options: Unit, validationOptions: ValidationOptions): PropertyDecorator = (^.asInstanceOf[js.Dynamic].applyDynamic("IsNotEmptyObject")(options.asInstanceOf[js.Any], validationOptions.asInstanceOf[js.Any])).asInstanceOf[PropertyDecorator]
  inline def IsNotEmptyObject_(options: Nullable): PropertyDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("IsNotEmptyObject")(options.asInstanceOf[js.Any]).asInstanceOf[PropertyDecorator]
  inline def IsNotEmptyObject_(options: Nullable, validationOptions: ValidationOptions): PropertyDecorator = (^.asInstanceOf[js.Dynamic].applyDynamic("IsNotEmptyObject")(options.asInstanceOf[js.Any], validationOptions.asInstanceOf[js.Any])).asInstanceOf[PropertyDecorator]
  
  inline def isNotEmptyObject(value: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isNotEmptyObject")(value.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  inline def isNotEmptyObject(value: Any, options: Nullable): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isNotEmptyObject")(value.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Boolean]
}
