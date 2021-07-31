package typings.classValidator

import typings.classValidator.validationOptionsMod.ValidationOptions
import typings.std.PropertyDecorator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object maxMod {
  
  @JSImport("class-validator/types/decorator/number/Max", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("class-validator/types/decorator/number/Max", "MAX")
  @js.native
  val MAX: /* "max" */ String = js.native
  
  @scala.inline
  def Max_(maxValue: Double): PropertyDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("Max")(maxValue.asInstanceOf[js.Any]).asInstanceOf[PropertyDecorator]
  @scala.inline
  def Max_(maxValue: Double, validationOptions: ValidationOptions): PropertyDecorator = (^.asInstanceOf[js.Dynamic].applyDynamic("Max")(maxValue.asInstanceOf[js.Any], validationOptions.asInstanceOf[js.Any])).asInstanceOf[PropertyDecorator]
  
  @scala.inline
  def max(num: js.Any, max: Double): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("max")(num.asInstanceOf[js.Any], max.asInstanceOf[js.Any])).asInstanceOf[Boolean]
}
