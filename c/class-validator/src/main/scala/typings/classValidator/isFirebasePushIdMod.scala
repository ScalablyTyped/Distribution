package typings.classValidator

import typings.classValidator.validationOptionsMod.ValidationOptions
import typings.std.PropertyDecorator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object isFirebasePushIdMod {
  
  @JSImport("class-validator/types/decorator/string/IsFirebasePushId", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("class-validator/types/decorator/string/IsFirebasePushId", "IS_FIREBASE_PUSH_ID")
  @js.native
  val IS_FIREBASE_PUSH_ID: /* "IsFirebasePushId" */ String = js.native
  
  @scala.inline
  def IsFirebasePushId_(): PropertyDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("IsFirebasePushId")().asInstanceOf[PropertyDecorator]
  @scala.inline
  def IsFirebasePushId_(validationOptions: ValidationOptions): PropertyDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("IsFirebasePushId")(validationOptions.asInstanceOf[js.Any]).asInstanceOf[PropertyDecorator]
  
  @scala.inline
  def isFirebasePushId(value: js.Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isFirebasePushId")(value.asInstanceOf[js.Any]).asInstanceOf[Boolean]
}
