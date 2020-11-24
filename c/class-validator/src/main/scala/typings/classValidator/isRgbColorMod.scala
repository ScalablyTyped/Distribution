package typings.classValidator

import typings.classValidator.validationOptionsMod.ValidationOptions
import typings.std.PropertyDecorator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("class-validator/types/decorator/string/IsRgbColor", JSImport.Namespace)
@js.native
object isRgbColorMod extends js.Object {
  
  val IS_RGB_COLOR: /* "isRgbColor" */ String = js.native
  
  @JSName("IsRgbColor")
  def IsRgbColor_(): PropertyDecorator = js.native
  @JSName("IsRgbColor")
  def IsRgbColor_(includePercentValues: js.UndefOr[scala.Nothing], validationOptions: ValidationOptions): PropertyDecorator = js.native
  @JSName("IsRgbColor")
  def IsRgbColor_(includePercentValues: Boolean): PropertyDecorator = js.native
  @JSName("IsRgbColor")
  def IsRgbColor_(includePercentValues: Boolean, validationOptions: ValidationOptions): PropertyDecorator = js.native
  
  def isRgbColor(value: js.Any): Boolean = js.native
  def isRgbColor(value: js.Any, includePercentValues: Boolean): Boolean = js.native
}
