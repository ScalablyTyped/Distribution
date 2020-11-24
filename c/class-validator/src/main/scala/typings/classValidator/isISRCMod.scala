package typings.classValidator

import typings.classValidator.validationOptionsMod.ValidationOptions
import typings.std.PropertyDecorator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("class-validator/types/decorator/string/IsISRC", JSImport.Namespace)
@js.native
object isISRCMod extends js.Object {
  
  val IS_ISRC: /* "isISRC" */ String = js.native
  
  @JSName("IsISRC")
  def IsISRC_(): PropertyDecorator = js.native
  @JSName("IsISRC")
  def IsISRC_(validationOptions: ValidationOptions): PropertyDecorator = js.native
  
  def isISRC(value: js.Any): Boolean = js.native
}
