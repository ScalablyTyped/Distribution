package typings.classValidator

import typings.classValidator.typesDecoratorValidationOptionsMod.ValidationOptions
import typings.std.PropertyDecorator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesDecoratorStringIsJWTMod {
  
  @JSImport("class-validator/types/decorator/string/IsJWT", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("class-validator/types/decorator/string/IsJWT", "IS_JWT")
  @js.native
  val IS_JWT: /* "isJwt" */ String = js.native
  
  inline def IsJWT_(): PropertyDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("IsJWT")().asInstanceOf[PropertyDecorator]
  inline def IsJWT_(validationOptions: ValidationOptions): PropertyDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("IsJWT")(validationOptions.asInstanceOf[js.Any]).asInstanceOf[PropertyDecorator]
  
  inline def isJWT(value: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isJWT")(value.asInstanceOf[js.Any]).asInstanceOf[Boolean]
}
