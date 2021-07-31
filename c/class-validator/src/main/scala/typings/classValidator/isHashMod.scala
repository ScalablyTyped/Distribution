package typings.classValidator

import typings.classValidator.validationOptionsMod.ValidationOptions
import typings.std.PropertyDecorator
import typings.validator.mod.validator.HashAlgorithm
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object isHashMod {
  
  @JSImport("class-validator/types/decorator/string/IsHash", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("class-validator/types/decorator/string/IsHash", "IS_HASH")
  @js.native
  val IS_HASH: /* "isHash" */ String = js.native
  
  @scala.inline
  def IsHash_(algorithm: String): PropertyDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("IsHash")(algorithm.asInstanceOf[js.Any]).asInstanceOf[PropertyDecorator]
  @scala.inline
  def IsHash_(algorithm: String, validationOptions: ValidationOptions): PropertyDecorator = (^.asInstanceOf[js.Dynamic].applyDynamic("IsHash")(algorithm.asInstanceOf[js.Any], validationOptions.asInstanceOf[js.Any])).asInstanceOf[PropertyDecorator]
  
  @scala.inline
  def isHash(value: js.Any, algorithm: HashAlgorithm): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isHash")(value.asInstanceOf[js.Any], algorithm.asInstanceOf[js.Any])).asInstanceOf[Boolean]
}
