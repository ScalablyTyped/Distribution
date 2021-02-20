package typings.classValidator

import typings.classValidator.validationOptionsMod.ValidationOptions
import typings.std.PropertyDecorator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object validateIfMod {
  
  @JSImport("class-validator/types/decorator/common/ValidateIf", "ValidateIf")
  @js.native
  def ValidateIf(condition: js.Function2[/* object */ js.Any, /* value */ js.Any, Boolean]): PropertyDecorator = js.native
  @JSImport("class-validator/types/decorator/common/ValidateIf", "ValidateIf")
  @js.native
  def ValidateIf(
    condition: js.Function2[/* object */ js.Any, /* value */ js.Any, Boolean],
    validationOptions: ValidationOptions
  ): PropertyDecorator = js.native
}
