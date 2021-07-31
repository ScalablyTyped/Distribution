package typings.classValidator

import typings.classValidator.validationOptionsMod.ValidationOptions
import typings.std.PropertyDecorator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object isDivisibleByMod {
  
  @JSImport("class-validator/types/decorator/number/IsDivisibleBy", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("class-validator/types/decorator/number/IsDivisibleBy", "IS_DIVISIBLE_BY")
  @js.native
  val IS_DIVISIBLE_BY: /* "isDivisibleBy" */ String = js.native
  
  @scala.inline
  def IsDivisibleBy_(num: Double): PropertyDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("IsDivisibleBy")(num.asInstanceOf[js.Any]).asInstanceOf[PropertyDecorator]
  @scala.inline
  def IsDivisibleBy_(num: Double, validationOptions: ValidationOptions): PropertyDecorator = (^.asInstanceOf[js.Dynamic].applyDynamic("IsDivisibleBy")(num.asInstanceOf[js.Any], validationOptions.asInstanceOf[js.Any])).asInstanceOf[PropertyDecorator]
  
  @scala.inline
  def isDivisibleBy(value: js.Any, num: Double): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isDivisibleBy")(value.asInstanceOf[js.Any], num.asInstanceOf[js.Any])).asInstanceOf[Boolean]
}
