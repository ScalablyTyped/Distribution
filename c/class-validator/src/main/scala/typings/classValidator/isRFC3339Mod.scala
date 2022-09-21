package typings.classValidator

import typings.classValidator.validationOptionsMod.ValidationOptions
import typings.std.PropertyDecorator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object isRFC3339Mod {
  
  @JSImport("class-validator/types/decorator/string/IsRFC3339", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("class-validator/types/decorator/string/IsRFC3339", "IS_RFC_3339")
  @js.native
  val IS_RFC_3339: /* "isRFC3339" */ String = js.native
  
  inline def IsRFC3339_(): PropertyDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("IsRFC3339")().asInstanceOf[PropertyDecorator]
  inline def IsRFC3339_(validationOptions: ValidationOptions): PropertyDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("IsRFC3339")(validationOptions.asInstanceOf[js.Any]).asInstanceOf[PropertyDecorator]
  
  inline def isRFC3339(value: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isRFC3339")(value.asInstanceOf[js.Any]).asInstanceOf[Boolean]
}
