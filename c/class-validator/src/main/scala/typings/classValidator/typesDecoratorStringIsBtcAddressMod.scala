package typings.classValidator

import typings.classValidator.typesDecoratorValidationOptionsMod.ValidationOptions
import typings.std.PropertyDecorator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesDecoratorStringIsBtcAddressMod {
  
  @JSImport("class-validator/types/decorator/string/IsBtcAddress", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("class-validator/types/decorator/string/IsBtcAddress", "IS_BTC_ADDRESS")
  @js.native
  val IS_BTC_ADDRESS: /* "isBtcAddress" */ String = js.native
  
  inline def IsBtcAddress_(): PropertyDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("IsBtcAddress")().asInstanceOf[PropertyDecorator]
  inline def IsBtcAddress_(validationOptions: ValidationOptions): PropertyDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("IsBtcAddress")(validationOptions.asInstanceOf[js.Any]).asInstanceOf[PropertyDecorator]
  
  inline def isBtcAddress(value: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isBtcAddress")(value.asInstanceOf[js.Any]).asInstanceOf[Boolean]
}
