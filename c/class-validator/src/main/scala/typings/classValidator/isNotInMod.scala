package typings.classValidator

import typings.classValidator.validationOptionsMod.ValidationOptions
import typings.std.PropertyDecorator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("class-validator/types/decorator/common/IsNotIn", JSImport.Namespace)
@js.native
object isNotInMod extends js.Object {
  
  val IS_NOT_IN: /* "isNotIn" */ String = js.native
  
  @JSName("IsNotIn")
  def IsNotIn_(values: js.Array[_]): PropertyDecorator = js.native
  @JSName("IsNotIn")
  def IsNotIn_(values: js.Array[_], validationOptions: ValidationOptions): PropertyDecorator = js.native
  
  def isNotIn(value: js.Any, possibleValues: js.Array[_]): Boolean = js.native
}
