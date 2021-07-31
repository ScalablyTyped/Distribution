package typings.classValidator

import typings.classValidator.validationOptionsMod.ValidationOptions
import typings.std.PropertyDecorator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object minLengthMod {
  
  @JSImport("class-validator/types/decorator/string/MinLength", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("class-validator/types/decorator/string/MinLength", "MIN_LENGTH")
  @js.native
  val MIN_LENGTH: /* "minLength" */ String = js.native
  
  @scala.inline
  def MinLength_(min: Double): PropertyDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("MinLength")(min.asInstanceOf[js.Any]).asInstanceOf[PropertyDecorator]
  @scala.inline
  def MinLength_(min: Double, validationOptions: ValidationOptions): PropertyDecorator = (^.asInstanceOf[js.Dynamic].applyDynamic("MinLength")(min.asInstanceOf[js.Any], validationOptions.asInstanceOf[js.Any])).asInstanceOf[PropertyDecorator]
  
  @scala.inline
  def minLength(value: js.Any, min: Double): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("minLength")(value.asInstanceOf[js.Any], min.asInstanceOf[js.Any])).asInstanceOf[Boolean]
}
