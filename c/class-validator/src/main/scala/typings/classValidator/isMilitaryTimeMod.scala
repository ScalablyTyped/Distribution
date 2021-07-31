package typings.classValidator

import typings.classValidator.validationOptionsMod.ValidationOptions
import typings.std.PropertyDecorator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object isMilitaryTimeMod {
  
  @JSImport("class-validator/types/decorator/string/IsMilitaryTime", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("class-validator/types/decorator/string/IsMilitaryTime", "IS_MILITARY_TIME")
  @js.native
  val IS_MILITARY_TIME: /* "isMilitaryTime" */ String = js.native
  
  @scala.inline
  def IsMilitaryTime_(): PropertyDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("IsMilitaryTime")().asInstanceOf[PropertyDecorator]
  @scala.inline
  def IsMilitaryTime_(validationOptions: ValidationOptions): PropertyDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("IsMilitaryTime")(validationOptions.asInstanceOf[js.Any]).asInstanceOf[PropertyDecorator]
  
  @scala.inline
  def isMilitaryTime(value: js.Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isMilitaryTime")(value.asInstanceOf[js.Any]).asInstanceOf[Boolean]
}
