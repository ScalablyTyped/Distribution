package typings.classValidator

import typings.classValidator.validationOptionsMod.ValidationOptions
import typings.std.PropertyDecorator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object isPositiveMod {
  
  @JSImport("class-validator/types/decorator/number/IsPositive", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("class-validator/types/decorator/number/IsPositive", "IS_POSITIVE")
  @js.native
  val IS_POSITIVE: /* "isPositive" */ String = js.native
  
  @scala.inline
  def IsPositive_(): PropertyDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("IsPositive")().asInstanceOf[PropertyDecorator]
  @scala.inline
  def IsPositive_(validationOptions: ValidationOptions): PropertyDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("IsPositive")(validationOptions.asInstanceOf[js.Any]).asInstanceOf[PropertyDecorator]
  
  @scala.inline
  def isPositive(value: js.Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isPositive")(value.asInstanceOf[js.Any]).asInstanceOf[Boolean]
}
