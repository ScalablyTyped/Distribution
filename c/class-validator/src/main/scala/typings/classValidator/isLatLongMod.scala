package typings.classValidator

import typings.classValidator.validationOptionsMod.ValidationOptions
import typings.std.PropertyDecorator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object isLatLongMod {
  
  @JSImport("class-validator/types/decorator/common/IsLatLong", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("class-validator/types/decorator/common/IsLatLong", "IS_LATLONG")
  @js.native
  val IS_LATLONG: /* "isLatLong" */ String = js.native
  
  inline def IsLatLong_(): PropertyDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("IsLatLong")().asInstanceOf[PropertyDecorator]
  inline def IsLatLong_(validationOptions: ValidationOptions): PropertyDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("IsLatLong")(validationOptions.asInstanceOf[js.Any]).asInstanceOf[PropertyDecorator]
  
  inline def isLatLong(value: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isLatLong")(value.asInstanceOf[js.Any]).asInstanceOf[Boolean]
}
