package typings.classValidator

import typings.classValidator.validationOptionsMod.ValidationOptions
import typings.std.PropertyDecorator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("class-validator/types/decorator/string/IsSurrogatePair", JSImport.Namespace)
@js.native
object isSurrogatePairMod extends js.Object {
  
  val IS_SURROGATE_PAIR: /* "isSurrogatePair" */ String = js.native
  
  @JSName("IsSurrogatePair")
  def IsSurrogatePair_(): PropertyDecorator = js.native
  @JSName("IsSurrogatePair")
  def IsSurrogatePair_(validationOptions: ValidationOptions): PropertyDecorator = js.native
  
  def isSurrogatePair(value: js.Any): Boolean = js.native
}
