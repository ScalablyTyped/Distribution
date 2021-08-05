package typings.classValidator

import typings.classValidator.validationArgumentsMod.ValidationArguments
import typings.classValidator.validationOptionsMod.ValidationOptions
import typings.classValidator.validatorConstraintInterfaceMod.ValidatorConstraintInterface
import typings.std.PropertyDecorator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object validateByMod {
  
  @JSImport("class-validator/types/decorator/common/ValidateBy", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def ValidateBy(options: ValidateByOptions): PropertyDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("ValidateBy")(options.asInstanceOf[js.Any]).asInstanceOf[PropertyDecorator]
  inline def ValidateBy(options: ValidateByOptions, validationOptions: ValidationOptions): PropertyDecorator = (^.asInstanceOf[js.Dynamic].applyDynamic("ValidateBy")(options.asInstanceOf[js.Any], validationOptions.asInstanceOf[js.Any])).asInstanceOf[PropertyDecorator]
  
  inline def buildMessage(impl: js.Function2[/* eachPrefix */ String, /* args */ js.UndefOr[ValidationArguments], String]): js.Function1[/* validationArguments */ js.UndefOr[ValidationArguments], String] = ^.asInstanceOf[js.Dynamic].applyDynamic("buildMessage")(impl.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* validationArguments */ js.UndefOr[ValidationArguments], String]]
  inline def buildMessage(
    impl: js.Function2[/* eachPrefix */ String, /* args */ js.UndefOr[ValidationArguments], String],
    validationOptions: ValidationOptions
  ): js.Function1[/* validationArguments */ js.UndefOr[ValidationArguments], String] = (^.asInstanceOf[js.Dynamic].applyDynamic("buildMessage")(impl.asInstanceOf[js.Any], validationOptions.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* validationArguments */ js.UndefOr[ValidationArguments], String]]
  
  trait ValidateByOptions extends StObject {
    
    var async: js.UndefOr[Boolean] = js.undefined
    
    var constraints: js.UndefOr[js.Array[js.Any]] = js.undefined
    
    var name: String
    
    var validator: ValidatorConstraintInterface | js.Function
  }
  object ValidateByOptions {
    
    inline def apply(name: String, validator: ValidatorConstraintInterface | js.Function): ValidateByOptions = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], validator = validator.asInstanceOf[js.Any])
      __obj.asInstanceOf[ValidateByOptions]
    }
    
    extension [Self <: ValidateByOptions](x: Self) {
      
      inline def setAsync(value: Boolean): Self = StObject.set(x, "async", value.asInstanceOf[js.Any])
      
      inline def setAsyncUndefined: Self = StObject.set(x, "async", js.undefined)
      
      inline def setConstraints(value: js.Array[js.Any]): Self = StObject.set(x, "constraints", value.asInstanceOf[js.Any])
      
      inline def setConstraintsUndefined: Self = StObject.set(x, "constraints", js.undefined)
      
      inline def setConstraintsVarargs(value: js.Any*): Self = StObject.set(x, "constraints", js.Array(value :_*))
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setValidator(value: ValidatorConstraintInterface | js.Function): Self = StObject.set(x, "validator", value.asInstanceOf[js.Any])
    }
  }
}
