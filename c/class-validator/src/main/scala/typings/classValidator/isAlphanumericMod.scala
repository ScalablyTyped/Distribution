package typings.classValidator

import typings.classValidator.validationOptionsMod.ValidationOptions
import typings.std.PropertyDecorator
import typings.validator.mod.validator.AlphanumericLocale
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object isAlphanumericMod {
  
  @JSImport("class-validator/types/decorator/string/IsAlphanumeric", "IS_ALPHANUMERIC")
  @js.native
  val IS_ALPHANUMERIC: /* "isAlphanumeric" */ String = js.native
  
  @JSImport("class-validator/types/decorator/string/IsAlphanumeric", "IsAlphanumeric")
  @js.native
  def IsAlphanumeric_(): PropertyDecorator = js.native
  @JSImport("class-validator/types/decorator/string/IsAlphanumeric", "IsAlphanumeric")
  @js.native
  def IsAlphanumeric_(locale: js.UndefOr[scala.Nothing], validationOptions: ValidationOptions): PropertyDecorator = js.native
  @JSImport("class-validator/types/decorator/string/IsAlphanumeric", "IsAlphanumeric")
  @js.native
  def IsAlphanumeric_(locale: String): PropertyDecorator = js.native
  @JSImport("class-validator/types/decorator/string/IsAlphanumeric", "IsAlphanumeric")
  @js.native
  def IsAlphanumeric_(locale: String, validationOptions: ValidationOptions): PropertyDecorator = js.native
  
  @JSImport("class-validator/types/decorator/string/IsAlphanumeric", "isAlphanumeric")
  @js.native
  def isAlphanumeric(value: js.Any): Boolean = js.native
  @JSImport("class-validator/types/decorator/string/IsAlphanumeric", "isAlphanumeric")
  @js.native
  def isAlphanumeric(value: js.Any, locale: AlphanumericLocale): Boolean = js.native
}
