package typings.classValidator

import typings.classValidator.validationOptionsMod.ValidationOptions
import typings.std.PropertyDecorator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("class-validator/types/decorator/string/IsRFC3339", JSImport.Namespace)
@js.native
object isRFC3339Mod extends js.Object {
  
  val IS_RFC_3339: /* "isRFC3339" */ String = js.native
  
  @JSName("IsRFC3339")
  def IsRFC3339_(): PropertyDecorator = js.native
  @JSName("IsRFC3339")
  def IsRFC3339_(validationOptions: ValidationOptions): PropertyDecorator = js.native
  
  def isRFC3339(value: js.Any): Boolean = js.native
}
