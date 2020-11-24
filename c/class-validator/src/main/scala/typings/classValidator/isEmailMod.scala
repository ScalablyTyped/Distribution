package typings.classValidator

import typings.classValidator.validationOptionsMod.ValidationOptions
import typings.std.PropertyDecorator
import typings.validator.mod.validator.IsEmailOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("class-validator/types/decorator/string/IsEmail", JSImport.Namespace)
@js.native
object isEmailMod extends js.Object {
  
  val IS_EMAIL: /* "isEmail" */ String = js.native
  
  @JSName("IsEmail")
  def IsEmail_(): PropertyDecorator = js.native
  @JSName("IsEmail")
  def IsEmail_(options: js.UndefOr[scala.Nothing], validationOptions: ValidationOptions): PropertyDecorator = js.native
  @JSName("IsEmail")
  def IsEmail_(options: IsEmailOptions): PropertyDecorator = js.native
  @JSName("IsEmail")
  def IsEmail_(options: IsEmailOptions, validationOptions: ValidationOptions): PropertyDecorator = js.native
  
  def isEmail(value: js.Any): Boolean = js.native
  def isEmail(value: js.Any, options: IsEmailOptions): Boolean = js.native
}
