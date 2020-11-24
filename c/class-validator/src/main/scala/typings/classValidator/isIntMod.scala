package typings.classValidator

import typings.classValidator.validationOptionsMod.ValidationOptions
import typings.std.PropertyDecorator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("class-validator/types/decorator/typechecker/IsInt", JSImport.Namespace)
@js.native
object isIntMod extends js.Object {
  
  val IS_INT: /* "isInt" */ String = js.native
  
  @JSName("IsInt")
  def IsInt_(): PropertyDecorator = js.native
  @JSName("IsInt")
  def IsInt_(validationOptions: ValidationOptions): PropertyDecorator = js.native
  
  def isInt(`val`: js.Any): Boolean = js.native
}
