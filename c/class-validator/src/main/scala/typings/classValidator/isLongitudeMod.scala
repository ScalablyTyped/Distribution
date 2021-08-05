package typings.classValidator

import typings.classValidator.validationOptionsMod.ValidationOptions
import typings.std.PropertyDecorator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object isLongitudeMod {
  
  @JSImport("class-validator/types/decorator/common/IsLongitude", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("class-validator/types/decorator/common/IsLongitude", "IS_LONGITUDE")
  @js.native
  val IS_LONGITUDE: /* "isLongitude" */ String = js.native
  
  inline def IsLongitude_(): PropertyDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("IsLongitude")().asInstanceOf[PropertyDecorator]
  inline def IsLongitude_(validationOptions: ValidationOptions): PropertyDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("IsLongitude")(validationOptions.asInstanceOf[js.Any]).asInstanceOf[PropertyDecorator]
  
  inline def isLongitude(value: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isLongitude")(value.asInstanceOf[js.Any]).asInstanceOf[Boolean]
}
