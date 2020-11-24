package typings.classValidator

import typings.classValidator.validationOptionsMod.ValidationOptions
import typings.std.PropertyDecorator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("class-validator/types/decorator/string/IsAscii", JSImport.Namespace)
@js.native
object isAsciiMod extends js.Object {
  
  val IS_ASCII: /* "isAscii" */ String = js.native
  
  @JSName("IsAscii")
  def IsAscii_(): PropertyDecorator = js.native
  @JSName("IsAscii")
  def IsAscii_(validationOptions: ValidationOptions): PropertyDecorator = js.native
  
  def isAscii(value: js.Any): Boolean = js.native
}
