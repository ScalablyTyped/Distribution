package typings.classValidator

import typings.classValidator.validationOptionsMod.ValidationOptions
import typings.std.PropertyDecorator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object isBooleanMod {
  
  @JSImport("class-validator/types/decorator/typechecker/IsBoolean", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("class-validator/types/decorator/typechecker/IsBoolean", "IS_BOOLEAN")
  @js.native
  val IS_BOOLEAN: /* "isBoolean" */ String = js.native
  
  inline def IsBoolean_(): PropertyDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("IsBoolean")().asInstanceOf[PropertyDecorator]
  inline def IsBoolean_(validationOptions: ValidationOptions): PropertyDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("IsBoolean")(validationOptions.asInstanceOf[js.Any]).asInstanceOf[PropertyDecorator]
  
  inline def isBoolean(value: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isBoolean")(value.asInstanceOf[js.Any]).asInstanceOf[Boolean]
}
