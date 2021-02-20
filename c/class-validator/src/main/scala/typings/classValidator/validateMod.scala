package typings.classValidator

import typings.classValidator.anon.Async
import typings.classValidator.validationOptionsMod.ValidationOptions
import typings.std.PropertyDecorator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object validateMod {
  
  @JSImport("class-validator/types/decorator/common/Validate", "Validate")
  @js.native
  def Validate(constraintClass: js.Function): PropertyDecorator = js.native
  @JSImport("class-validator/types/decorator/common/Validate", "Validate")
  @js.native
  def Validate(
    constraintClass: js.Function,
    constraints: js.UndefOr[scala.Nothing],
    validationOptions: ValidationOptions
  ): PropertyDecorator = js.native
  @JSImport("class-validator/types/decorator/common/Validate", "Validate")
  @js.native
  def Validate(constraintClass: js.Function, constraints: js.Array[_]): PropertyDecorator = js.native
  @JSImport("class-validator/types/decorator/common/Validate", "Validate")
  @js.native
  def Validate(constraintClass: js.Function, constraints: js.Array[_], validationOptions: ValidationOptions): PropertyDecorator = js.native
  @JSImport("class-validator/types/decorator/common/Validate", "Validate")
  @js.native
  def Validate(constraintClass: js.Function, validationOptions: ValidationOptions): PropertyDecorator = js.native
  
  @JSImport("class-validator/types/decorator/common/Validate", "ValidatorConstraint")
  @js.native
  def ValidatorConstraint(): js.Function1[/* target */ js.Function, Unit] = js.native
  @JSImport("class-validator/types/decorator/common/Validate", "ValidatorConstraint")
  @js.native
  def ValidatorConstraint(options: Async): js.Function1[/* target */ js.Function, Unit] = js.native
}
