package typings.classValidator

import typings.classValidator.validationOptionsMod.ValidationOptions
import typings.std.PropertyDecorator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object isJSONMod {
  
  @JSImport("class-validator/types/decorator/string/IsJSON", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("class-validator/types/decorator/string/IsJSON", "IS_JSON")
  @js.native
  val IS_JSON: /* "isJson" */ String = js.native
  
  @scala.inline
  def IsJSON_(): PropertyDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("IsJSON")().asInstanceOf[PropertyDecorator]
  @scala.inline
  def IsJSON_(validationOptions: ValidationOptions): PropertyDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("IsJSON")(validationOptions.asInstanceOf[js.Any]).asInstanceOf[PropertyDecorator]
  
  @scala.inline
  def isJSON(value: js.Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isJSON")(value.asInstanceOf[js.Any]).asInstanceOf[Boolean]
}
