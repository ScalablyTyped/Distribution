package typings.classValidator

import typings.classValidator.validationOptionsMod.ValidationOptions
import typings.std.PropertyDecorator
import typings.validator.mod.validator.IsURLOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object isUrlMod {
  
  @JSImport("class-validator/types/decorator/string/IsUrl", "IS_URL")
  @js.native
  val IS_URL: /* "isUrl" */ String = js.native
  
  @JSImport("class-validator/types/decorator/string/IsUrl", "IsUrl")
  @js.native
  def IsUrl_(): PropertyDecorator = js.native
  @JSImport("class-validator/types/decorator/string/IsUrl", "IsUrl")
  @js.native
  def IsUrl_(options: js.UndefOr[scala.Nothing], validationOptions: ValidationOptions): PropertyDecorator = js.native
  @JSImport("class-validator/types/decorator/string/IsUrl", "IsUrl")
  @js.native
  def IsUrl_(options: IsURLOptions): PropertyDecorator = js.native
  @JSImport("class-validator/types/decorator/string/IsUrl", "IsUrl")
  @js.native
  def IsUrl_(options: IsURLOptions, validationOptions: ValidationOptions): PropertyDecorator = js.native
  
  @JSImport("class-validator/types/decorator/string/IsUrl", "isURL")
  @js.native
  def isURL(value: String): Boolean = js.native
  @JSImport("class-validator/types/decorator/string/IsUrl", "isURL")
  @js.native
  def isURL(value: String, options: IsURLOptions): Boolean = js.native
}
