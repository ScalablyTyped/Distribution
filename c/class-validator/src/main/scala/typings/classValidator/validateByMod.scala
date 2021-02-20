package typings.classValidator

import typings.classValidator.validationArgumentsMod.ValidationArguments
import typings.classValidator.validationOptionsMod.ValidationOptions
import typings.classValidator.validatorConstraintInterfaceMod.ValidatorConstraintInterface
import typings.std.PropertyDecorator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object validateByMod {
  
  @JSImport("class-validator/types/decorator/common/ValidateBy", "ValidateBy")
  @js.native
  def ValidateBy(options: ValidateByOptions): PropertyDecorator = js.native
  @JSImport("class-validator/types/decorator/common/ValidateBy", "ValidateBy")
  @js.native
  def ValidateBy(options: ValidateByOptions, validationOptions: ValidationOptions): PropertyDecorator = js.native
  
  @JSImport("class-validator/types/decorator/common/ValidateBy", "buildMessage")
  @js.native
  def buildMessage(impl: js.Function2[/* eachPrefix */ String, /* args */ js.UndefOr[ValidationArguments], String]): js.Function1[/* validationArguments */ js.UndefOr[ValidationArguments], String] = js.native
  @JSImport("class-validator/types/decorator/common/ValidateBy", "buildMessage")
  @js.native
  def buildMessage(
    impl: js.Function2[/* eachPrefix */ String, /* args */ js.UndefOr[ValidationArguments], String],
    validationOptions: ValidationOptions
  ): js.Function1[/* validationArguments */ js.UndefOr[ValidationArguments], String] = js.native
  
  @js.native
  trait ValidateByOptions extends StObject {
    
    var async: js.UndefOr[Boolean] = js.native
    
    var constraints: js.UndefOr[js.Array[_]] = js.native
    
    var name: String = js.native
    
    var validator: ValidatorConstraintInterface | js.Function = js.native
  }
  object ValidateByOptions {
    
    @scala.inline
    def apply(name: String, validator: ValidatorConstraintInterface | js.Function): ValidateByOptions = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], validator = validator.asInstanceOf[js.Any])
      __obj.asInstanceOf[ValidateByOptions]
    }
    
    @scala.inline
    implicit class ValidateByOptionsMutableBuilder[Self <: ValidateByOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAsync(value: Boolean): Self = StObject.set(x, "async", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAsyncUndefined: Self = StObject.set(x, "async", js.undefined)
      
      @scala.inline
      def setConstraints(value: js.Array[_]): Self = StObject.set(x, "constraints", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setConstraintsUndefined: Self = StObject.set(x, "constraints", js.undefined)
      
      @scala.inline
      def setConstraintsVarargs(value: js.Any*): Self = StObject.set(x, "constraints", js.Array(value :_*))
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValidator(value: ValidatorConstraintInterface | js.Function): Self = StObject.set(x, "validator", value.asInstanceOf[js.Any])
    }
  }
}
