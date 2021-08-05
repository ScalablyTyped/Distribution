package typings.classValidator

import typings.classValidator.validationOptionsMod.ValidationOptions
import typings.std.PropertyDecorator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object isISRCMod {
  
  @JSImport("class-validator/types/decorator/string/IsISRC", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("class-validator/types/decorator/string/IsISRC", "IS_ISRC")
  @js.native
  val IS_ISRC: /* "isISRC" */ String = js.native
  
  inline def IsISRC_(): PropertyDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("IsISRC")().asInstanceOf[PropertyDecorator]
  inline def IsISRC_(validationOptions: ValidationOptions): PropertyDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("IsISRC")(validationOptions.asInstanceOf[js.Any]).asInstanceOf[PropertyDecorator]
  
  inline def isISRC(value: js.Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isISRC")(value.asInstanceOf[js.Any]).asInstanceOf[Boolean]
}
