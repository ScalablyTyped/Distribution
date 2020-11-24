package typings.classValidator

import typings.classValidator.validationOptionsMod.ValidationOptions
import typings.std.PropertyDecorator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("class-validator/types/decorator/common/IsLongitude", JSImport.Namespace)
@js.native
object isLongitudeMod extends js.Object {
  
  val IS_LONGITUDE: /* "isLongitude" */ String = js.native
  
  @JSName("IsLongitude")
  def IsLongitude_(): PropertyDecorator = js.native
  @JSName("IsLongitude")
  def IsLongitude_(validationOptions: ValidationOptions): PropertyDecorator = js.native
  
  def isLongitude(value: String): Boolean = js.native
}
