package typings.classValidator

import typings.classValidator.typesDecoratorValidationOptionsMod.ValidationOptions
import typings.std.PropertyDecorator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesDecoratorTypecheckerIsIntMod {
  
  @JSImport("class-validator/types/decorator/typechecker/IsInt", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("class-validator/types/decorator/typechecker/IsInt", "IS_INT")
  @js.native
  val IS_INT: /* "isInt" */ String = js.native
  
  inline def IsInt_(): PropertyDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("IsInt")().asInstanceOf[PropertyDecorator]
  inline def IsInt_(validationOptions: ValidationOptions): PropertyDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("IsInt")(validationOptions.asInstanceOf[js.Any]).asInstanceOf[PropertyDecorator]
  
  inline def isInt(`val`: Any): /* is std.Number */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInt")(`val`.asInstanceOf[js.Any]).asInstanceOf[/* is std.Number */ Boolean]
}
