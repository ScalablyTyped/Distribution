package typings.classValidator

import typings.classValidator.validationOptionsMod.ValidationOptions
import typings.std.PropertyDecorator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object isSurrogatePairMod {
  
  @JSImport("class-validator/types/decorator/string/IsSurrogatePair", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("class-validator/types/decorator/string/IsSurrogatePair", "IS_SURROGATE_PAIR")
  @js.native
  val IS_SURROGATE_PAIR: /* "isSurrogatePair" */ String = js.native
  
  inline def IsSurrogatePair_(): PropertyDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("IsSurrogatePair")().asInstanceOf[PropertyDecorator]
  inline def IsSurrogatePair_(validationOptions: ValidationOptions): PropertyDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("IsSurrogatePair")(validationOptions.asInstanceOf[js.Any]).asInstanceOf[PropertyDecorator]
  
  inline def isSurrogatePair(value: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isSurrogatePair")(value.asInstanceOf[js.Any]).asInstanceOf[Boolean]
}
