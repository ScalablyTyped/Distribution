package typings.classValidator

import typings.classValidator.validationOptionsMod.ValidationOptions
import typings.std.PropertyDecorator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("class-validator/types/decorator/object/IsNotEmptyObject", JSImport.Namespace)
@js.native
object isNotEmptyObjectMod extends js.Object {
  
  val IS_NOT_EMPTY_OBJECT: /* "isNotEmptyObject" */ String = js.native
  
  @JSName("IsNotEmptyObject")
  def IsNotEmptyObject_(): PropertyDecorator = js.native
  @JSName("IsNotEmptyObject")
  def IsNotEmptyObject_(validationOptions: ValidationOptions): PropertyDecorator = js.native
  
  def isNotEmptyObject(value: js.Any): Boolean = js.native
}
