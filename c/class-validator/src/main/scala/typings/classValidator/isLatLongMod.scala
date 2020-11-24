package typings.classValidator

import typings.classValidator.validationOptionsMod.ValidationOptions
import typings.std.PropertyDecorator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("class-validator/types/decorator/common/IsLatLong", JSImport.Namespace)
@js.native
object isLatLongMod extends js.Object {
  
  val IS_LATLONG: /* "isLatLong" */ String = js.native
  
  @JSName("IsLatLong")
  def IsLatLong_(): PropertyDecorator = js.native
  @JSName("IsLatLong")
  def IsLatLong_(validationOptions: ValidationOptions): PropertyDecorator = js.native
  
  def isLatLong(value: String): Boolean = js.native
}
