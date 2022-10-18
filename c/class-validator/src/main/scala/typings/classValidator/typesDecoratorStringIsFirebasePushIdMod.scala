package typings.classValidator

import typings.classValidator.typesDecoratorValidationOptionsMod.ValidationOptions
import typings.std.PropertyDecorator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesDecoratorStringIsFirebasePushIdMod {
  
  @JSImport("class-validator/types/decorator/string/IsFirebasePushId", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("class-validator/types/decorator/string/IsFirebasePushId", "IS_FIREBASE_PUSH_ID")
  @js.native
  val IS_FIREBASE_PUSH_ID: /* "IsFirebasePushId" */ String = js.native
  
  inline def IsFirebasePushId_(): PropertyDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("IsFirebasePushId")().asInstanceOf[PropertyDecorator]
  inline def IsFirebasePushId_(validationOptions: ValidationOptions): PropertyDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("IsFirebasePushId")(validationOptions.asInstanceOf[js.Any]).asInstanceOf[PropertyDecorator]
  
  inline def isFirebasePushId(value: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isFirebasePushId")(value.asInstanceOf[js.Any]).asInstanceOf[Boolean]
}
