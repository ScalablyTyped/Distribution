package typings.classValidator

import typings.classValidator.typesDecoratorValidationOptionsMod.ValidationOptions
import typings.std.PropertyDecorator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesDecoratorTypecheckerIsDateMod {
  
  @JSImport("class-validator/types/decorator/typechecker/IsDate", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("class-validator/types/decorator/typechecker/IsDate", "IS_DATE")
  @js.native
  val IS_DATE: /* "isDate" */ String = js.native
  
  inline def IsDate_(): PropertyDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("IsDate")().asInstanceOf[PropertyDecorator]
  inline def IsDate_(validationOptions: ValidationOptions): PropertyDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("IsDate")(validationOptions.asInstanceOf[js.Any]).asInstanceOf[PropertyDecorator]
  
  inline def isDate(value: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isDate")(value.asInstanceOf[js.Any]).asInstanceOf[Boolean]
}
