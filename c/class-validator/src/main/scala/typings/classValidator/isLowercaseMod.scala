package typings.classValidator

import typings.classValidator.validationOptionsMod.ValidationOptions
import typings.std.PropertyDecorator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object isLowercaseMod {
  
  @JSImport("class-validator/types/decorator/string/IsLowercase", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("class-validator/types/decorator/string/IsLowercase", "IS_LOWERCASE")
  @js.native
  val IS_LOWERCASE: /* "isLowercase" */ String = js.native
  
  inline def IsLowercase_(): PropertyDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("IsLowercase")().asInstanceOf[PropertyDecorator]
  inline def IsLowercase_(validationOptions: ValidationOptions): PropertyDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("IsLowercase")(validationOptions.asInstanceOf[js.Any]).asInstanceOf[PropertyDecorator]
  
  inline def isLowercase(value: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isLowercase")(value.asInstanceOf[js.Any]).asInstanceOf[Boolean]
}
