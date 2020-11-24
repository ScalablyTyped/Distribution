package typings.classValidator

import typings.classValidator.validationOptionsMod.ValidationOptions
import typings.std.PropertyDecorator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("class-validator/types/decorator/common/IsIn", JSImport.Namespace)
@js.native
object isInMod extends js.Object {
  
  val IS_IN: /* "isIn" */ String = js.native
  
  @JSName("IsIn")
  def IsIn_(values: js.Array[_]): PropertyDecorator = js.native
  @JSName("IsIn")
  def IsIn_(values: js.Array[_], validationOptions: ValidationOptions): PropertyDecorator = js.native
  
  def isIn(value: js.Any, possibleValues: js.Array[_]): Boolean = js.native
}
