package typings.classValidator

import typings.classValidator.validationOptionsMod.ValidationOptions
import typings.std.PropertyDecorator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object isOptionalMod {
  
  @JSImport("class-validator/types/decorator/common/IsOptional", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def IsOptional(): PropertyDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("IsOptional")().asInstanceOf[PropertyDecorator]
  @scala.inline
  def IsOptional(validationOptions: ValidationOptions): PropertyDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("IsOptional")(validationOptions.asInstanceOf[js.Any]).asInstanceOf[PropertyDecorator]
}
