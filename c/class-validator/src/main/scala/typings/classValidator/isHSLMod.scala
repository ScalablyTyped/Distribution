package typings.classValidator

import typings.classValidator.validationOptionsMod.ValidationOptions
import typings.std.PropertyDecorator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("class-validator/types/decorator/string/IsHSL", JSImport.Namespace)
@js.native
object isHSLMod extends js.Object {
  
  val IS_HSL: /* "isHSL" */ String = js.native
  
  @JSName("IsHSL")
  def IsHSL_(): PropertyDecorator = js.native
  @JSName("IsHSL")
  def IsHSL_(validationOptions: ValidationOptions): PropertyDecorator = js.native
  
  def isHSL(value: js.Any): Boolean = js.native
}
