package typings.classValidator

import typings.classValidator.validationOptionsMod.ValidationOptions
import typings.std.PropertyDecorator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object isHalfWidthMod {
  
  @JSImport("class-validator/types/decorator/string/IsHalfWidth", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("class-validator/types/decorator/string/IsHalfWidth", "IS_HALF_WIDTH")
  @js.native
  val IS_HALF_WIDTH: /* "isHalfWidth" */ String = js.native
  
  @scala.inline
  def IsHalfWidth_(): PropertyDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("IsHalfWidth")().asInstanceOf[PropertyDecorator]
  @scala.inline
  def IsHalfWidth_(validationOptions: ValidationOptions): PropertyDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("IsHalfWidth")(validationOptions.asInstanceOf[js.Any]).asInstanceOf[PropertyDecorator]
  
  @scala.inline
  def isHalfWidth(value: js.Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isHalfWidth")(value.asInstanceOf[js.Any]).asInstanceOf[Boolean]
}
