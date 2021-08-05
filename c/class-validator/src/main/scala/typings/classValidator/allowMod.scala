package typings.classValidator

import typings.classValidator.validationOptionsMod.ValidationOptions
import typings.std.PropertyDecorator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object allowMod {
  
  @JSImport("class-validator/types/decorator/common/Allow", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def Allow(): PropertyDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("Allow")().asInstanceOf[PropertyDecorator]
  inline def Allow(validationOptions: ValidationOptions): PropertyDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("Allow")(validationOptions.asInstanceOf[js.Any]).asInstanceOf[PropertyDecorator]
}
