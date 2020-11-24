package typings.classValidator

import typings.classValidator.validationOptionsMod.ValidationOptions
import typings.std.PropertyDecorator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("class-validator/types/decorator/string/IsJSON", JSImport.Namespace)
@js.native
object isJSONMod extends js.Object {
  
  val IS_JSON: /* "isJson" */ String = js.native
  
  @JSName("IsJSON")
  def IsJSON_(): PropertyDecorator = js.native
  @JSName("IsJSON")
  def IsJSON_(validationOptions: ValidationOptions): PropertyDecorator = js.native
  
  def isJSON(value: js.Any): Boolean = js.native
}
