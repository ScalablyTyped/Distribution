package typings.classValidator

import typings.classValidator.validationOptionsMod.ValidationOptions
import typings.std.PropertyDecorator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object isHexColorMod {
  
  @JSImport("class-validator/types/decorator/string/IsHexColor", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("class-validator/types/decorator/string/IsHexColor", "IS_HEX_COLOR")
  @js.native
  val IS_HEX_COLOR: /* "isHexColor" */ String = js.native
  
  @scala.inline
  def IsHexColor_(): PropertyDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("IsHexColor")().asInstanceOf[PropertyDecorator]
  @scala.inline
  def IsHexColor_(validationOptions: ValidationOptions): PropertyDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("IsHexColor")(validationOptions.asInstanceOf[js.Any]).asInstanceOf[PropertyDecorator]
  
  @scala.inline
  def isHexColor(value: js.Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isHexColor")(value.asInstanceOf[js.Any]).asInstanceOf[Boolean]
}
