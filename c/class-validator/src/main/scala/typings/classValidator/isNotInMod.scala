package typings.classValidator

import typings.classValidator.validationOptionsMod.ValidationOptions
import typings.std.PropertyDecorator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object isNotInMod {
  
  @JSImport("class-validator/types/decorator/common/IsNotIn", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("class-validator/types/decorator/common/IsNotIn", "IS_NOT_IN")
  @js.native
  val IS_NOT_IN: /* "isNotIn" */ String = js.native
  
  inline def IsNotIn_(values: js.Array[js.Any]): PropertyDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("IsNotIn")(values.asInstanceOf[js.Any]).asInstanceOf[PropertyDecorator]
  inline def IsNotIn_(values: js.Array[js.Any], validationOptions: ValidationOptions): PropertyDecorator = (^.asInstanceOf[js.Dynamic].applyDynamic("IsNotIn")(values.asInstanceOf[js.Any], validationOptions.asInstanceOf[js.Any])).asInstanceOf[PropertyDecorator]
  
  inline def isNotIn(value: js.Any, possibleValues: js.Array[js.Any]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isNotIn")(value.asInstanceOf[js.Any], possibleValues.asInstanceOf[js.Any])).asInstanceOf[Boolean]
}
