package typings.classValidator

import typings.classValidator.validationOptionsMod.ValidationOptions
import typings.std.PropertyDecorator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object isInMod {
  
  @JSImport("class-validator/types/decorator/common/IsIn", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("class-validator/types/decorator/common/IsIn", "IS_IN")
  @js.native
  val IS_IN: /* "isIn" */ String = js.native
  
  inline def IsIn_(values: js.Array[Any]): PropertyDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("IsIn")(values.asInstanceOf[js.Any]).asInstanceOf[PropertyDecorator]
  inline def IsIn_(values: js.Array[Any], validationOptions: ValidationOptions): PropertyDecorator = (^.asInstanceOf[js.Dynamic].applyDynamic("IsIn")(values.asInstanceOf[js.Any], validationOptions.asInstanceOf[js.Any])).asInstanceOf[PropertyDecorator]
  
  inline def isIn(value: Any, possibleValues: js.Array[Any]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isIn")(value.asInstanceOf[js.Any], possibleValues.asInstanceOf[js.Any])).asInstanceOf[Boolean]
}
