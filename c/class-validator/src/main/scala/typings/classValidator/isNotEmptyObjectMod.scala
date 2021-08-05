package typings.classValidator

import typings.classValidator.validationOptionsMod.ValidationOptions
import typings.std.PropertyDecorator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object isNotEmptyObjectMod {
  
  @JSImport("class-validator/types/decorator/object/IsNotEmptyObject", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("class-validator/types/decorator/object/IsNotEmptyObject", "IS_NOT_EMPTY_OBJECT")
  @js.native
  val IS_NOT_EMPTY_OBJECT: /* "isNotEmptyObject" */ String = js.native
  
  inline def IsNotEmptyObject_(): PropertyDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("IsNotEmptyObject")().asInstanceOf[PropertyDecorator]
  inline def IsNotEmptyObject_(validationOptions: ValidationOptions): PropertyDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("IsNotEmptyObject")(validationOptions.asInstanceOf[js.Any]).asInstanceOf[PropertyDecorator]
  
  inline def isNotEmptyObject(value: js.Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isNotEmptyObject")(value.asInstanceOf[js.Any]).asInstanceOf[Boolean]
}
