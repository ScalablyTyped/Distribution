package typings.classValidator

import typings.classValidator.validationOptionsMod.ValidationOptions
import typings.std.PropertyDecorator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("class-validator/types/decorator/string/IsLocale", JSImport.Namespace)
@js.native
object isLocaleMod extends js.Object {
  
  val IS_LOCALE: /* "isLocale" */ String = js.native
  
  @JSName("IsLocale")
  def IsLocale_(): PropertyDecorator = js.native
  @JSName("IsLocale")
  def IsLocale_(validationOptions: ValidationOptions): PropertyDecorator = js.native
  
  def isLocale(value: js.Any): Boolean = js.native
}
