package typings.classValidator

import typings.classValidator.validationOptionsMod.ValidationOptions
import typings.std.PropertyDecorator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object isISINMod {
  
  @JSImport("class-validator/types/decorator/string/IsISIN", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("class-validator/types/decorator/string/IsISIN", "IS_ISIN")
  @js.native
  val IS_ISIN: /* "isIsin" */ String = js.native
  
  @scala.inline
  def IsISIN_(): PropertyDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("IsISIN")().asInstanceOf[PropertyDecorator]
  @scala.inline
  def IsISIN_(validationOptions: ValidationOptions): PropertyDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("IsISIN")(validationOptions.asInstanceOf[js.Any]).asInstanceOf[PropertyDecorator]
  
  @scala.inline
  def isISIN(value: js.Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isISIN")(value.asInstanceOf[js.Any]).asInstanceOf[Boolean]
}
