package typings.classValidator

import typings.classValidator.typesDecoratorValidationOptionsMod.ValidationOptions
import typings.std.PropertyDecorator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesDecoratorCommonIsEmptyMod {
  
  @JSImport("class-validator/types/decorator/common/IsEmpty", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("class-validator/types/decorator/common/IsEmpty", "IS_EMPTY")
  @js.native
  val IS_EMPTY: /* "isEmpty" */ String = js.native
  
  inline def IsEmpty_(): PropertyDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("IsEmpty")().asInstanceOf[PropertyDecorator]
  inline def IsEmpty_(validationOptions: ValidationOptions): PropertyDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("IsEmpty")(validationOptions.asInstanceOf[js.Any]).asInstanceOf[PropertyDecorator]
  
  inline def isEmpty(value: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isEmpty")(value.asInstanceOf[js.Any]).asInstanceOf[Boolean]
}
