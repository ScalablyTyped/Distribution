package typings.classValidator

import typings.classValidator.typesDecoratorValidationOptionsMod.ValidationOptions
import typings.std.PropertyDecorator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesDecoratorStringIsStrongPasswordMod {
  
  @JSImport("class-validator/types/decorator/string/IsStrongPassword", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("class-validator/types/decorator/string/IsStrongPassword", "IS_STRONG_PASSWORD")
  @js.native
  val IS_STRONG_PASSWORD: /* "isStrongPassword" */ String = js.native
  
  inline def IsStrongPassword_(): PropertyDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("IsStrongPassword")().asInstanceOf[PropertyDecorator]
  inline def IsStrongPassword_(options: Unit, validationOptions: ValidationOptions): PropertyDecorator = (^.asInstanceOf[js.Dynamic].applyDynamic("IsStrongPassword")(options.asInstanceOf[js.Any], validationOptions.asInstanceOf[js.Any])).asInstanceOf[PropertyDecorator]
  inline def IsStrongPassword_(options: IsStrongPasswordOptions): PropertyDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("IsStrongPassword")(options.asInstanceOf[js.Any]).asInstanceOf[PropertyDecorator]
  inline def IsStrongPassword_(options: IsStrongPasswordOptions, validationOptions: ValidationOptions): PropertyDecorator = (^.asInstanceOf[js.Dynamic].applyDynamic("IsStrongPassword")(options.asInstanceOf[js.Any], validationOptions.asInstanceOf[js.Any])).asInstanceOf[PropertyDecorator]
  
  inline def isStrongPassword(value: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isStrongPassword")(value.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  inline def isStrongPassword(value: Any, options: IsStrongPasswordOptions): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isStrongPassword")(value.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  /* Inlined std.Pick<validator.validator.default.StrongPasswordOptions, 'minLength' | 'minLowercase' | 'minUppercase' | 'minNumbers' | 'minSymbols'> */
  trait IsStrongPasswordOptions extends StObject {
    
    var minLength: js.UndefOr[Double] = js.undefined
    
    var minLowercase: js.UndefOr[Double] = js.undefined
    
    var minNumbers: js.UndefOr[Double] = js.undefined
    
    var minSymbols: js.UndefOr[Double] = js.undefined
    
    var minUppercase: js.UndefOr[Double] = js.undefined
  }
  object IsStrongPasswordOptions {
    
    inline def apply(): IsStrongPasswordOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IsStrongPasswordOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IsStrongPasswordOptions] (val x: Self) extends AnyVal {
      
      inline def setMinLength(value: Double): Self = StObject.set(x, "minLength", value.asInstanceOf[js.Any])
      
      inline def setMinLengthUndefined: Self = StObject.set(x, "minLength", js.undefined)
      
      inline def setMinLowercase(value: Double): Self = StObject.set(x, "minLowercase", value.asInstanceOf[js.Any])
      
      inline def setMinLowercaseUndefined: Self = StObject.set(x, "minLowercase", js.undefined)
      
      inline def setMinNumbers(value: Double): Self = StObject.set(x, "minNumbers", value.asInstanceOf[js.Any])
      
      inline def setMinNumbersUndefined: Self = StObject.set(x, "minNumbers", js.undefined)
      
      inline def setMinSymbols(value: Double): Self = StObject.set(x, "minSymbols", value.asInstanceOf[js.Any])
      
      inline def setMinSymbolsUndefined: Self = StObject.set(x, "minSymbols", js.undefined)
      
      inline def setMinUppercase(value: Double): Self = StObject.set(x, "minUppercase", value.asInstanceOf[js.Any])
      
      inline def setMinUppercaseUndefined: Self = StObject.set(x, "minUppercase", js.undefined)
    }
  }
}
