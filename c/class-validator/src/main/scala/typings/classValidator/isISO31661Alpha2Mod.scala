package typings.classValidator

import typings.classValidator.validationOptionsMod.ValidationOptions
import typings.std.PropertyDecorator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object isISO31661Alpha2Mod {
  
  @JSImport("class-validator/types/decorator/string/IsISO31661Alpha2", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("class-validator/types/decorator/string/IsISO31661Alpha2", "IS_ISO31661_ALPHA_2")
  @js.native
  val IS_ISO31661_ALPHA_2: /* "isISO31661Alpha2" */ String = js.native
  
  @scala.inline
  def IsISO31661Alpha2_(): PropertyDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("IsISO31661Alpha2")().asInstanceOf[PropertyDecorator]
  @scala.inline
  def IsISO31661Alpha2_(validationOptions: ValidationOptions): PropertyDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("IsISO31661Alpha2")(validationOptions.asInstanceOf[js.Any]).asInstanceOf[PropertyDecorator]
  
  @scala.inline
  def isISO31661Alpha2(value: js.Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isISO31661Alpha2")(value.asInstanceOf[js.Any]).asInstanceOf[Boolean]
}
