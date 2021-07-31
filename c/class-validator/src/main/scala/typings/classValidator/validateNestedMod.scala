package typings.classValidator

import typings.classValidator.validationOptionsMod.ValidationOptions
import typings.std.PropertyDecorator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object validateNestedMod {
  
  @JSImport("class-validator/types/decorator/common/ValidateNested", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def ValidateNested(): PropertyDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("ValidateNested")().asInstanceOf[PropertyDecorator]
  @scala.inline
  def ValidateNested(validationOptions: ValidationOptions): PropertyDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("ValidateNested")(validationOptions.asInstanceOf[js.Any]).asInstanceOf[PropertyDecorator]
}
