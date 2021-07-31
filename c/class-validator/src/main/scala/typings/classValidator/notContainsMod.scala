package typings.classValidator

import typings.classValidator.validationOptionsMod.ValidationOptions
import typings.std.PropertyDecorator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object notContainsMod {
  
  @JSImport("class-validator/types/decorator/string/NotContains", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("class-validator/types/decorator/string/NotContains", "NOT_CONTAINS")
  @js.native
  val NOT_CONTAINS: /* "notContains" */ String = js.native
  
  @scala.inline
  def NotContains_(seed: String): PropertyDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("NotContains")(seed.asInstanceOf[js.Any]).asInstanceOf[PropertyDecorator]
  @scala.inline
  def NotContains_(seed: String, validationOptions: ValidationOptions): PropertyDecorator = (^.asInstanceOf[js.Dynamic].applyDynamic("NotContains")(seed.asInstanceOf[js.Any], validationOptions.asInstanceOf[js.Any])).asInstanceOf[PropertyDecorator]
  
  @scala.inline
  def notContains(value: js.Any, seed: String): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("notContains")(value.asInstanceOf[js.Any], seed.asInstanceOf[js.Any])).asInstanceOf[Boolean]
}
