package typings.classValidator.isUUIDMod

import typings.classValidator.validationOptionsMod.ValidationOptions
import typings.std.PropertyDecorator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("class-validator/types/decorator/string/IsUUID", "IsUUID")
@js.native
object IsUUID_ extends js.Object {
  
  def apply(): PropertyDecorator = js.native
  def apply(version: js.UndefOr[scala.Nothing], validationOptions: ValidationOptions): PropertyDecorator = js.native
  def apply(version: UUIDVersion): PropertyDecorator = js.native
  def apply(version: UUIDVersion, validationOptions: ValidationOptions): PropertyDecorator = js.native
}
