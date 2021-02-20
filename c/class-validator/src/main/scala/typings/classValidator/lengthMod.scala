package typings.classValidator

import typings.classValidator.validationOptionsMod.ValidationOptions
import typings.std.PropertyDecorator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object lengthMod {
  
  @JSImport("class-validator/types/decorator/string/Length", "LENGTH")
  @js.native
  val LENGTH: /* "length" */ String = js.native
  
  @JSImport("class-validator/types/decorator/string/Length", "Length")
  @js.native
  def Length_(min: Double): PropertyDecorator = js.native
  @JSImport("class-validator/types/decorator/string/Length", "Length")
  @js.native
  def Length_(min: Double, max: js.UndefOr[scala.Nothing], validationOptions: ValidationOptions): PropertyDecorator = js.native
  @JSImport("class-validator/types/decorator/string/Length", "Length")
  @js.native
  def Length_(min: Double, max: Double): PropertyDecorator = js.native
  @JSImport("class-validator/types/decorator/string/Length", "Length")
  @js.native
  def Length_(min: Double, max: Double, validationOptions: ValidationOptions): PropertyDecorator = js.native
  
  @JSImport("class-validator/types/decorator/string/Length", "length")
  @js.native
  def length(value: js.Any, min: Double): Boolean = js.native
  @JSImport("class-validator/types/decorator/string/Length", "length")
  @js.native
  def length(value: js.Any, min: Double, max: Double): Boolean = js.native
}
