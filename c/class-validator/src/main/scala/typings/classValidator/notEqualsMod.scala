package typings.classValidator

import typings.classValidator.validationOptionsMod.ValidationOptions
import typings.std.PropertyDecorator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object notEqualsMod {
  
  @JSImport("class-validator/types/decorator/common/NotEquals", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("class-validator/types/decorator/common/NotEquals", "NOT_EQUALS")
  @js.native
  val NOT_EQUALS: /* "notEquals" */ String = js.native
  
  inline def NotEquals_(comparison: js.Any): PropertyDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("NotEquals")(comparison.asInstanceOf[js.Any]).asInstanceOf[PropertyDecorator]
  inline def NotEquals_(comparison: js.Any, validationOptions: ValidationOptions): PropertyDecorator = (^.asInstanceOf[js.Dynamic].applyDynamic("NotEquals")(comparison.asInstanceOf[js.Any], validationOptions.asInstanceOf[js.Any])).asInstanceOf[PropertyDecorator]
  
  inline def notEquals(value: js.Any, comparison: js.Any): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("notEquals")(value.asInstanceOf[js.Any], comparison.asInstanceOf[js.Any])).asInstanceOf[Boolean]
}
