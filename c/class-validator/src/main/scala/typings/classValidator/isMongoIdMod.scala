package typings.classValidator

import typings.classValidator.validationOptionsMod.ValidationOptions
import typings.std.PropertyDecorator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("class-validator/types/decorator/string/IsMongoId", JSImport.Namespace)
@js.native
object isMongoIdMod extends js.Object {
  
  val IS_MONGO_ID: /* "isMongoId" */ String = js.native
  
  @JSName("IsMongoId")
  def IsMongoId_(): PropertyDecorator = js.native
  @JSName("IsMongoId")
  def IsMongoId_(validationOptions: ValidationOptions): PropertyDecorator = js.native
  
  def isMongoId(value: js.Any): Boolean = js.native
}
