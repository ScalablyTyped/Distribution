package typings.classValidator

import typings.classValidator.validationOptionsMod.ValidationOptions
import typings.std.PropertyDecorator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object validatePromiseMod {
  
  @JSImport("class-validator/types/decorator/common/ValidatePromise", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def ValidatePromise(): PropertyDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("ValidatePromise")().asInstanceOf[PropertyDecorator]
  @scala.inline
  def ValidatePromise(validationOptions: ValidationOptions): PropertyDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("ValidatePromise")(validationOptions.asInstanceOf[js.Any]).asInstanceOf[PropertyDecorator]
}
