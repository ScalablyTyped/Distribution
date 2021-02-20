package typings.classValidator

import typings.classValidator.validationOptionsMod.ValidationOptions
import typings.std.PropertyDecorator
import typings.validator.mod.validator.HashAlgorithm
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object isHashMod {
  
  @JSImport("class-validator/types/decorator/string/IsHash", "IS_HASH")
  @js.native
  val IS_HASH: /* "isHash" */ String = js.native
  
  @JSImport("class-validator/types/decorator/string/IsHash", "IsHash")
  @js.native
  def IsHash_(algorithm: String): PropertyDecorator = js.native
  @JSImport("class-validator/types/decorator/string/IsHash", "IsHash")
  @js.native
  def IsHash_(algorithm: String, validationOptions: ValidationOptions): PropertyDecorator = js.native
  
  @JSImport("class-validator/types/decorator/string/IsHash", "isHash")
  @js.native
  def isHash(value: js.Any, algorithm: HashAlgorithm): Boolean = js.native
}
