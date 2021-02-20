package typings.classValidator

import typings.classValidator.validationOptionsMod.ValidationOptions
import typings.std.PropertyDecorator
import typings.validator.mod.validator.AlphaLocale
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object isAlphaMod {
  
  @JSImport("class-validator/types/decorator/string/IsAlpha", "IS_ALPHA")
  @js.native
  val IS_ALPHA: /* "isAlpha" */ String = js.native
  
  @JSImport("class-validator/types/decorator/string/IsAlpha", "IsAlpha")
  @js.native
  def IsAlpha_(): PropertyDecorator = js.native
  @JSImport("class-validator/types/decorator/string/IsAlpha", "IsAlpha")
  @js.native
  def IsAlpha_(locale: js.UndefOr[scala.Nothing], validationOptions: ValidationOptions): PropertyDecorator = js.native
  @JSImport("class-validator/types/decorator/string/IsAlpha", "IsAlpha")
  @js.native
  def IsAlpha_(locale: String): PropertyDecorator = js.native
  @JSImport("class-validator/types/decorator/string/IsAlpha", "IsAlpha")
  @js.native
  def IsAlpha_(locale: String, validationOptions: ValidationOptions): PropertyDecorator = js.native
  
  @JSImport("class-validator/types/decorator/string/IsAlpha", "isAlpha")
  @js.native
  def isAlpha(value: js.Any): Boolean = js.native
  @JSImport("class-validator/types/decorator/string/IsAlpha", "isAlpha")
  @js.native
  def isAlpha(value: js.Any, locale: AlphaLocale): Boolean = js.native
}
