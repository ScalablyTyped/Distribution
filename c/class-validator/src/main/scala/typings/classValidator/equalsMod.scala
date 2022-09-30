package typings.classValidator

import typings.classValidator.validationOptionsMod.ValidationOptions
import typings.std.PropertyDecorator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object equalsMod {
  
  @JSImport("class-validator/types/decorator/common/Equals", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("class-validator/types/decorator/common/Equals", "EQUALS")
  @js.native
  val EQUALS__ : /* "equals" */ String = js.native
  
  inline def Equals(comparison: Any): PropertyDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("Equals")(comparison.asInstanceOf[js.Any]).asInstanceOf[PropertyDecorator]
  inline def Equals(comparison: Any, validationOptions: ValidationOptions): PropertyDecorator = (^.asInstanceOf[js.Dynamic].applyDynamic("Equals")(comparison.asInstanceOf[js.Any], validationOptions.asInstanceOf[js.Any])).asInstanceOf[PropertyDecorator]
  
  inline def equals_(value: Any, comparison: Any): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("equals")(value.asInstanceOf[js.Any], comparison.asInstanceOf[js.Any])).asInstanceOf[Boolean]
}
