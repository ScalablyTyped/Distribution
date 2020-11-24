package typings.classValidator

import typings.classValidator.validationOptionsMod.ValidationOptions
import typings.std.PropertyDecorator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("class-validator/types/decorator/string/IsIBAN", JSImport.Namespace)
@js.native
object isIBANMod extends js.Object {
  
  val IS_IBAN: /* "isIBAN" */ String = js.native
  
  @JSName("IsIBAN")
  def IsIBAN_(): PropertyDecorator = js.native
  @JSName("IsIBAN")
  def IsIBAN_(validationOptions: ValidationOptions): PropertyDecorator = js.native
  
  def isIBAN(value: js.Any): Boolean = js.native
}
