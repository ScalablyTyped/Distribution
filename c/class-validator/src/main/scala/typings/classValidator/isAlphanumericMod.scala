package typings.classValidator

import typings.classValidator.validationOptionsMod.ValidationOptions
import typings.std.PropertyDecorator
import typings.validator.mod.validator.AlphanumericLocale
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("class-validator/types/decorator/string/IsAlphanumeric", JSImport.Namespace)
@js.native
object isAlphanumericMod extends js.Object {
  
  val IS_ALPHANUMERIC: /* "isAlphanumeric" */ String = js.native
  
  @JSName("IsAlphanumeric")
  def IsAlphanumeric_(): PropertyDecorator = js.native
  @JSName("IsAlphanumeric")
  def IsAlphanumeric_(locale: js.UndefOr[scala.Nothing], validationOptions: ValidationOptions): PropertyDecorator = js.native
  @JSName("IsAlphanumeric")
  def IsAlphanumeric_(locale: String): PropertyDecorator = js.native
  @JSName("IsAlphanumeric")
  def IsAlphanumeric_(locale: String, validationOptions: ValidationOptions): PropertyDecorator = js.native
  
  def isAlphanumeric(value: js.Any): Boolean = js.native
  def isAlphanumeric(value: js.Any, locale: AlphanumericLocale): Boolean = js.native
}
