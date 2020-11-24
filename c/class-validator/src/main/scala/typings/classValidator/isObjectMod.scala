package typings.classValidator

import typings.classValidator.validationOptionsMod.ValidationOptions
import typings.std.PropertyDecorator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("class-validator/types/decorator/typechecker/IsObject", JSImport.Namespace)
@js.native
object isObjectMod extends js.Object {
  
  val IS_OBJECT: /* "isObject" */ String = js.native
  
  @JSName("IsObject")
  def IsObject_(): PropertyDecorator = js.native
  @JSName("IsObject")
  def IsObject_(validationOptions: ValidationOptions): PropertyDecorator = js.native
  
  def isObject(value: js.Any): /* is object */ Boolean = js.native
}
