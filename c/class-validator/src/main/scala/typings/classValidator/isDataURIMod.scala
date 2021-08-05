package typings.classValidator

import typings.classValidator.validationOptionsMod.ValidationOptions
import typings.std.PropertyDecorator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object isDataURIMod {
  
  @JSImport("class-validator/types/decorator/string/IsDataURI", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("class-validator/types/decorator/string/IsDataURI", "IS_DATA_URI")
  @js.native
  val IS_DATA_URI: /* "isDataURI" */ String = js.native
  
  inline def IsDataURI_(): PropertyDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("IsDataURI")().asInstanceOf[PropertyDecorator]
  inline def IsDataURI_(validationOptions: ValidationOptions): PropertyDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("IsDataURI")(validationOptions.asInstanceOf[js.Any]).asInstanceOf[PropertyDecorator]
  
  inline def isDataURI(value: js.Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isDataURI")(value.asInstanceOf[js.Any]).asInstanceOf[Boolean]
}
