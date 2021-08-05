package typings.classValidator

import typings.classValidator.validationOptionsMod.ValidationOptions
import typings.std.PropertyDecorator
import typings.validator.mod.validator.IsMACAddressOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object isMacAddressMod {
  
  @JSImport("class-validator/types/decorator/string/IsMacAddress", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("class-validator/types/decorator/string/IsMacAddress", "IS_MAC_ADDRESS")
  @js.native
  val IS_MAC_ADDRESS: /* "isMacAddress" */ String = js.native
  
  inline def IsMACAddress_(): PropertyDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("IsMACAddress")().asInstanceOf[PropertyDecorator]
  inline def IsMACAddress_(optionsArg: Unit, validationOptionsArg: ValidationOptions): PropertyDecorator = (^.asInstanceOf[js.Dynamic].applyDynamic("IsMACAddress")(optionsArg.asInstanceOf[js.Any], validationOptionsArg.asInstanceOf[js.Any])).asInstanceOf[PropertyDecorator]
  inline def IsMACAddress_(optionsArg: IsMACAddressOptions): PropertyDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("IsMACAddress")(optionsArg.asInstanceOf[js.Any]).asInstanceOf[PropertyDecorator]
  inline def IsMACAddress_(optionsArg: IsMACAddressOptions, validationOptionsArg: ValidationOptions): PropertyDecorator = (^.asInstanceOf[js.Dynamic].applyDynamic("IsMACAddress")(optionsArg.asInstanceOf[js.Any], validationOptionsArg.asInstanceOf[js.Any])).asInstanceOf[PropertyDecorator]
  inline def IsMACAddress_(validationOptionsArg: ValidationOptions): PropertyDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("IsMACAddress")(validationOptionsArg.asInstanceOf[js.Any]).asInstanceOf[PropertyDecorator]
  
  inline def isMACAddress(value: js.Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isMACAddress")(value.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  inline def isMACAddress(value: js.Any, options: IsMACAddressOptions): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isMACAddress")(value.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Boolean]
}
