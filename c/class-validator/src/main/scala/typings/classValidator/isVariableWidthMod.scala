package typings.classValidator

import typings.classValidator.validationOptionsMod.ValidationOptions
import typings.std.PropertyDecorator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object isVariableWidthMod {
  
  @JSImport("class-validator/types/decorator/string/IsVariableWidth", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("class-validator/types/decorator/string/IsVariableWidth", "IS_VARIABLE_WIDTH")
  @js.native
  val IS_VARIABLE_WIDTH: /* "isVariableWidth" */ String = js.native
  
  @scala.inline
  def IsVariableWidth_(): PropertyDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("IsVariableWidth")().asInstanceOf[PropertyDecorator]
  @scala.inline
  def IsVariableWidth_(validationOptions: ValidationOptions): PropertyDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("IsVariableWidth")(validationOptions.asInstanceOf[js.Any]).asInstanceOf[PropertyDecorator]
  
  @scala.inline
  def isVariableWidth(value: js.Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isVariableWidth")(value.asInstanceOf[js.Any]).asInstanceOf[Boolean]
}
