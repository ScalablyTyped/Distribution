package typings.classValidator

import typings.classValidator.validationOptionsMod.ValidationOptions
import typings.std.PropertyDecorator
import typings.validator.mod.validator.IsURLOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("class-validator/types/decorator/string/IsUrl", JSImport.Namespace)
@js.native
object isUrlMod extends js.Object {
  
  val IS_URL: /* "isUrl" */ String = js.native
  
  @JSName("IsUrl")
  def IsUrl_(): PropertyDecorator = js.native
  @JSName("IsUrl")
  def IsUrl_(options: js.UndefOr[scala.Nothing], validationOptions: ValidationOptions): PropertyDecorator = js.native
  @JSName("IsUrl")
  def IsUrl_(options: IsURLOptions): PropertyDecorator = js.native
  @JSName("IsUrl")
  def IsUrl_(options: IsURLOptions, validationOptions: ValidationOptions): PropertyDecorator = js.native
  
  def isURL(value: String): Boolean = js.native
  def isURL(value: String, options: IsURLOptions): Boolean = js.native
}
