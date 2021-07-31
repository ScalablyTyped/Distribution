package typings.classValidator

import typings.classValidator.validationOptionsMod.ValidationOptions
import typings.std.PropertyDecorator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object isHexadecimalMod {
  
  @JSImport("class-validator/types/decorator/string/IsHexadecimal", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("class-validator/types/decorator/string/IsHexadecimal", "IS_HEXADECIMAL")
  @js.native
  val IS_HEXADECIMAL: /* "isHexadecimal" */ String = js.native
  
  @scala.inline
  def IsHexadecimal_(): PropertyDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("IsHexadecimal")().asInstanceOf[PropertyDecorator]
  @scala.inline
  def IsHexadecimal_(validationOptions: ValidationOptions): PropertyDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("IsHexadecimal")(validationOptions.asInstanceOf[js.Any]).asInstanceOf[PropertyDecorator]
  
  @scala.inline
  def isHexadecimal(value: js.Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isHexadecimal")(value.asInstanceOf[js.Any]).asInstanceOf[Boolean]
}
