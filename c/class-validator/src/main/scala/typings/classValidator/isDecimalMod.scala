package typings.classValidator

import typings.classValidator.validationOptionsMod.ValidationOptions
import typings.std.PropertyDecorator
import typings.validator.mod.validator.IsDecimalOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("class-validator/types/decorator/string/IsDecimal", JSImport.Namespace)
@js.native
object isDecimalMod extends js.Object {
  
  val IS_DECIMAL: /* "isDecimal" */ String = js.native
  
  @JSName("IsDecimal")
  def IsDecimal_(): PropertyDecorator = js.native
  @JSName("IsDecimal")
  def IsDecimal_(options: js.UndefOr[scala.Nothing], validationOptions: ValidationOptions): PropertyDecorator = js.native
  @JSName("IsDecimal")
  def IsDecimal_(options: IsDecimalOptions): PropertyDecorator = js.native
  @JSName("IsDecimal")
  def IsDecimal_(options: IsDecimalOptions, validationOptions: ValidationOptions): PropertyDecorator = js.native
  
  def isDecimal(value: js.Any): Boolean = js.native
  def isDecimal(value: js.Any, options: IsDecimalOptions): Boolean = js.native
}
