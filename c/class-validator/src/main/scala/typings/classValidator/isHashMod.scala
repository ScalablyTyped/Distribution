package typings.classValidator

import typings.classValidator.validationOptionsMod.ValidationOptions
import typings.std.PropertyDecorator
import typings.validator.mod.validator.HashAlgorithm
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("class-validator/types/decorator/string/IsHash", JSImport.Namespace)
@js.native
object isHashMod extends js.Object {
  
  val IS_HASH: /* "isHash" */ String = js.native
  
  @JSName("IsHash")
  def IsHash_(algorithm: String): PropertyDecorator = js.native
  @JSName("IsHash")
  def IsHash_(algorithm: String, validationOptions: ValidationOptions): PropertyDecorator = js.native
  
  def isHash(value: js.Any, algorithm: HashAlgorithm): Boolean = js.native
}
