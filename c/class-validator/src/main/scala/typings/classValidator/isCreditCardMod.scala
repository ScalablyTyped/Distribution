package typings.classValidator

import typings.classValidator.validationOptionsMod.ValidationOptions
import typings.std.PropertyDecorator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object isCreditCardMod {
  
  @JSImport("class-validator/types/decorator/string/IsCreditCard", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("class-validator/types/decorator/string/IsCreditCard", "IS_CREDIT_CARD")
  @js.native
  val IS_CREDIT_CARD: /* "isCreditCard" */ String = js.native
  
  @scala.inline
  def IsCreditCard_(): PropertyDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("IsCreditCard")().asInstanceOf[PropertyDecorator]
  @scala.inline
  def IsCreditCard_(validationOptions: ValidationOptions): PropertyDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("IsCreditCard")(validationOptions.asInstanceOf[js.Any]).asInstanceOf[PropertyDecorator]
  
  @scala.inline
  def isCreditCard(value: js.Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isCreditCard")(value.asInstanceOf[js.Any]).asInstanceOf[Boolean]
}
