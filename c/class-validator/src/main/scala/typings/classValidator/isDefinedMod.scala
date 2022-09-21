package typings.classValidator

import typings.classValidator.validationOptionsMod.ValidationOptions
import typings.std.PropertyDecorator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object isDefinedMod {
  
  @JSImport("class-validator/types/decorator/common/IsDefined", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("class-validator/types/decorator/common/IsDefined", "IS_DEFINED")
  @js.native
  val IS_DEFINED: String = js.native
  
  inline def IsDefined_(): PropertyDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("IsDefined")().asInstanceOf[PropertyDecorator]
  inline def IsDefined_(validationOptions: ValidationOptions): PropertyDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("IsDefined")(validationOptions.asInstanceOf[js.Any]).asInstanceOf[PropertyDecorator]
  
  inline def isDefined(value: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isDefined")(value.asInstanceOf[js.Any]).asInstanceOf[Boolean]
}
