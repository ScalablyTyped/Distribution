package typings.classValidator

import typings.classValidator.anon.Async
import typings.classValidator.typesDecoratorValidationOptionsMod.ValidationOptions
import typings.std.PropertyDecorator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesDecoratorCommonValidateMod {
  
  @JSImport("class-validator/types/decorator/common/Validate", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def Validate(constraintClass: js.Function): PropertyDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("Validate")(constraintClass.asInstanceOf[js.Any]).asInstanceOf[PropertyDecorator]
  inline def Validate(constraintClass: js.Function, constraints: js.Array[Any]): PropertyDecorator = (^.asInstanceOf[js.Dynamic].applyDynamic("Validate")(constraintClass.asInstanceOf[js.Any], constraints.asInstanceOf[js.Any])).asInstanceOf[PropertyDecorator]
  inline def Validate(constraintClass: js.Function, constraints: js.Array[Any], validationOptions: ValidationOptions): PropertyDecorator = (^.asInstanceOf[js.Dynamic].applyDynamic("Validate")(constraintClass.asInstanceOf[js.Any], constraints.asInstanceOf[js.Any], validationOptions.asInstanceOf[js.Any])).asInstanceOf[PropertyDecorator]
  inline def Validate(constraintClass: js.Function, constraints: Unit, validationOptions: ValidationOptions): PropertyDecorator = (^.asInstanceOf[js.Dynamic].applyDynamic("Validate")(constraintClass.asInstanceOf[js.Any], constraints.asInstanceOf[js.Any], validationOptions.asInstanceOf[js.Any])).asInstanceOf[PropertyDecorator]
  inline def Validate(constraintClass: js.Function, validationOptions: ValidationOptions): PropertyDecorator = (^.asInstanceOf[js.Dynamic].applyDynamic("Validate")(constraintClass.asInstanceOf[js.Any], validationOptions.asInstanceOf[js.Any])).asInstanceOf[PropertyDecorator]
  
  inline def ValidatorConstraint(): js.Function1[/* target */ js.Function, Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("ValidatorConstraint")().asInstanceOf[js.Function1[/* target */ js.Function, Unit]]
  inline def ValidatorConstraint(options: Async): js.Function1[/* target */ js.Function, Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("ValidatorConstraint")(options.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* target */ js.Function, Unit]]
}
