package typings.classValidator

import typings.classValidator.validationOptionsMod.ValidationOptions
import typings.std.PropertyDecorator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object isMimeTypeMod {
  
  @JSImport("class-validator/types/decorator/string/IsMimeType", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("class-validator/types/decorator/string/IsMimeType", "IS_MIME_TYPE")
  @js.native
  val IS_MIME_TYPE: /* "isMimeType" */ String = js.native
  
  inline def IsMimeType_(): PropertyDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("IsMimeType")().asInstanceOf[PropertyDecorator]
  inline def IsMimeType_(validationOptions: ValidationOptions): PropertyDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("IsMimeType")(validationOptions.asInstanceOf[js.Any]).asInstanceOf[PropertyDecorator]
  
  inline def isMimeType(value: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isMimeType")(value.asInstanceOf[js.Any]).asInstanceOf[Boolean]
}
