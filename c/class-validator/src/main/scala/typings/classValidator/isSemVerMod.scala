package typings.classValidator

import typings.classValidator.validationOptionsMod.ValidationOptions
import typings.std.PropertyDecorator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object isSemVerMod {
  
  @JSImport("class-validator/types/decorator/string/IsSemVer", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("class-validator/types/decorator/string/IsSemVer", "IS_SEM_VER")
  @js.native
  val IS_SEM_VER: /* "isSemVer" */ String = js.native
  
  inline def IsSemVer_(): PropertyDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("IsSemVer")().asInstanceOf[PropertyDecorator]
  inline def IsSemVer_(validationOptions: ValidationOptions): PropertyDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("IsSemVer")(validationOptions.asInstanceOf[js.Any]).asInstanceOf[PropertyDecorator]
  
  inline def isSemVer(value: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isSemVer")(value.asInstanceOf[js.Any]).asInstanceOf[Boolean]
}
