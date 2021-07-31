package typings.classValidator

import typings.classValidator.validationOptionsMod.ValidationOptions
import typings.std.PropertyDecorator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object containsMod {
  
  @JSImport("class-validator/types/decorator/string/Contains", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("class-validator/types/decorator/string/Contains", "CONTAINS")
  @js.native
  val CONTAINS: /* "contains" */ String = js.native
  
  @scala.inline
  def Contains_(seed: String): PropertyDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("Contains")(seed.asInstanceOf[js.Any]).asInstanceOf[PropertyDecorator]
  @scala.inline
  def Contains_(seed: String, validationOptions: ValidationOptions): PropertyDecorator = (^.asInstanceOf[js.Dynamic].applyDynamic("Contains")(seed.asInstanceOf[js.Any], validationOptions.asInstanceOf[js.Any])).asInstanceOf[PropertyDecorator]
  
  @scala.inline
  def contains(value: js.Any, seed: String): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("contains")(value.asInstanceOf[js.Any], seed.asInstanceOf[js.Any])).asInstanceOf[Boolean]
}
