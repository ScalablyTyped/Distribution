package typings.classValidator

import typings.classValidator.validationOptionsMod.ValidationOptions
import typings.std.PropertyDecorator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("class-validator/types/decorator/typechecker/IsDate", JSImport.Namespace)
@js.native
object isDateMod extends js.Object {
  
  val IS_DATE: /* "isDate" */ String = js.native
  
  @JSName("IsDate")
  def IsDate_(): PropertyDecorator = js.native
  @JSName("IsDate")
  def IsDate_(validationOptions: ValidationOptions): PropertyDecorator = js.native
  
  def isDate(value: js.Any): Boolean = js.native
}
