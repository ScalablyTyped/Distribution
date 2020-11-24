package typings.classValidator

import typings.classValidator.validationOptionsMod.ValidationOptions
import typings.std.PropertyDecorator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("class-validator/types/decorator/string/IsBase32", JSImport.Namespace)
@js.native
object isBase32Mod extends js.Object {
  
  val IS_BASE32: /* "isBase32" */ String = js.native
  
  @JSName("IsBase32")
  def IsBase32_(): PropertyDecorator = js.native
  @JSName("IsBase32")
  def IsBase32_(validationOptions: ValidationOptions): PropertyDecorator = js.native
  
  def isBase32(value: js.Any): Boolean = js.native
}
