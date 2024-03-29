package typings.classValidator

import typings.classValidator.typesDecoratorValidationOptionsMod.ValidationOptions
import typings.std.PropertyDecorator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesDecoratorCommonIsOptionalMod {
  
  @JSImport("class-validator/types/decorator/common/IsOptional", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def IsOptional(): PropertyDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("IsOptional")().asInstanceOf[PropertyDecorator]
  inline def IsOptional(validationOptions: ValidationOptions): PropertyDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("IsOptional")(validationOptions.asInstanceOf[js.Any]).asInstanceOf[PropertyDecorator]
}
