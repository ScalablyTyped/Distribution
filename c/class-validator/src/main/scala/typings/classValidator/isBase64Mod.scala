package typings.classValidator

import typings.classValidator.validationOptionsMod.ValidationOptions
import typings.std.PropertyDecorator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object isBase64Mod {
  
  @JSImport("class-validator/types/decorator/string/IsBase64", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("class-validator/types/decorator/string/IsBase64", "IS_BASE64")
  @js.native
  val IS_BASE64: /* "isBase64" */ String = js.native
  
  inline def IsBase64_(): PropertyDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("IsBase64")().asInstanceOf[PropertyDecorator]
  inline def IsBase64_(validationOptions: ValidationOptions): PropertyDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("IsBase64")(validationOptions.asInstanceOf[js.Any]).asInstanceOf[PropertyDecorator]
  
  inline def isBase64(value: js.Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isBase64")(value.asInstanceOf[js.Any]).asInstanceOf[Boolean]
}
