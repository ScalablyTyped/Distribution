package typings.classValidator

import typings.classValidator.validationOptionsMod.ValidationOptions
import typings.std.PropertyDecorator
import typings.validator.mod.validator.IsEmailOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object isEmailMod {
  
  @JSImport("class-validator/types/decorator/string/IsEmail", "IS_EMAIL")
  @js.native
  val IS_EMAIL: /* "isEmail" */ String = js.native
  
  @JSImport("class-validator/types/decorator/string/IsEmail", "IsEmail")
  @js.native
  def IsEmail_(): PropertyDecorator = js.native
  @JSImport("class-validator/types/decorator/string/IsEmail", "IsEmail")
  @js.native
  def IsEmail_(options: js.UndefOr[scala.Nothing], validationOptions: ValidationOptions): PropertyDecorator = js.native
  @JSImport("class-validator/types/decorator/string/IsEmail", "IsEmail")
  @js.native
  def IsEmail_(options: IsEmailOptions): PropertyDecorator = js.native
  @JSImport("class-validator/types/decorator/string/IsEmail", "IsEmail")
  @js.native
  def IsEmail_(options: IsEmailOptions, validationOptions: ValidationOptions): PropertyDecorator = js.native
  
  @JSImport("class-validator/types/decorator/string/IsEmail", "isEmail")
  @js.native
  def isEmail(value: js.Any): Boolean = js.native
  @JSImport("class-validator/types/decorator/string/IsEmail", "isEmail")
  @js.native
  def isEmail(value: js.Any, options: IsEmailOptions): Boolean = js.native
}
