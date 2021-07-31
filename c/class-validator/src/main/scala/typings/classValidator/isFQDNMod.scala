package typings.classValidator

import typings.classValidator.validationOptionsMod.ValidationOptions
import typings.std.PropertyDecorator
import typings.validator.mod.validator.IsFQDNOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object isFQDNMod {
  
  @JSImport("class-validator/types/decorator/string/IsFQDN", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("class-validator/types/decorator/string/IsFQDN", "IS_FQDN")
  @js.native
  val IS_FQDN: /* "isFqdn" */ String = js.native
  
  @scala.inline
  def IsFQDN_(): PropertyDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("IsFQDN")().asInstanceOf[PropertyDecorator]
  @scala.inline
  def IsFQDN_(options: Unit, validationOptions: ValidationOptions): PropertyDecorator = (^.asInstanceOf[js.Dynamic].applyDynamic("IsFQDN")(options.asInstanceOf[js.Any], validationOptions.asInstanceOf[js.Any])).asInstanceOf[PropertyDecorator]
  @scala.inline
  def IsFQDN_(options: IsFQDNOptions): PropertyDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("IsFQDN")(options.asInstanceOf[js.Any]).asInstanceOf[PropertyDecorator]
  @scala.inline
  def IsFQDN_(options: IsFQDNOptions, validationOptions: ValidationOptions): PropertyDecorator = (^.asInstanceOf[js.Dynamic].applyDynamic("IsFQDN")(options.asInstanceOf[js.Any], validationOptions.asInstanceOf[js.Any])).asInstanceOf[PropertyDecorator]
  
  @scala.inline
  def isFQDN(value: js.Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isFQDN")(value.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  @scala.inline
  def isFQDN(value: js.Any, options: IsFQDNOptions): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isFQDN")(value.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Boolean]
}
