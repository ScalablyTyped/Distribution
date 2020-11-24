package typings.classValidator

import typings.classValidator.validationOptionsMod.ValidationOptions
import typings.std.PropertyDecorator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("class-validator/types/decorator/number/Max", JSImport.Namespace)
@js.native
object maxMod extends js.Object {
  
  val MAX: /* "max" */ String = js.native
  
  @JSName("Max")
  def Max_(maxValue: Double): PropertyDecorator = js.native
  @JSName("Max")
  def Max_(maxValue: Double, validationOptions: ValidationOptions): PropertyDecorator = js.native
  
  def max(num: js.Any, max: Double): Boolean = js.native
}
