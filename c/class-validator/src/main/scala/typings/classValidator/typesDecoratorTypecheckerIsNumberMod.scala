package typings.classValidator

import typings.classValidator.typesDecoratorValidationOptionsMod.ValidationOptions
import typings.std.PropertyDecorator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesDecoratorTypecheckerIsNumberMod {
  
  @JSImport("class-validator/types/decorator/typechecker/IsNumber", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("class-validator/types/decorator/typechecker/IsNumber", "IS_NUMBER")
  @js.native
  val IS_NUMBER: /* "isNumber" */ String = js.native
  
  inline def IsNumber_(): PropertyDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("IsNumber")().asInstanceOf[PropertyDecorator]
  inline def IsNumber_(options: Unit, validationOptions: ValidationOptions): PropertyDecorator = (^.asInstanceOf[js.Dynamic].applyDynamic("IsNumber")(options.asInstanceOf[js.Any], validationOptions.asInstanceOf[js.Any])).asInstanceOf[PropertyDecorator]
  inline def IsNumber_(options: IsNumberOptions): PropertyDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("IsNumber")(options.asInstanceOf[js.Any]).asInstanceOf[PropertyDecorator]
  inline def IsNumber_(options: IsNumberOptions, validationOptions: ValidationOptions): PropertyDecorator = (^.asInstanceOf[js.Dynamic].applyDynamic("IsNumber")(options.asInstanceOf[js.Any], validationOptions.asInstanceOf[js.Any])).asInstanceOf[PropertyDecorator]
  
  inline def isNumber(value: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isNumber")(value.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  inline def isNumber(value: Any, options: IsNumberOptions): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isNumber")(value.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  trait IsNumberOptions extends StObject {
    
    var allowInfinity: js.UndefOr[Boolean] = js.undefined
    
    var allowNaN: js.UndefOr[Boolean] = js.undefined
    
    var maxDecimalPlaces: js.UndefOr[Double] = js.undefined
  }
  object IsNumberOptions {
    
    inline def apply(): IsNumberOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IsNumberOptions]
    }
    
    extension [Self <: IsNumberOptions](x: Self) {
      
      inline def setAllowInfinity(value: Boolean): Self = StObject.set(x, "allowInfinity", value.asInstanceOf[js.Any])
      
      inline def setAllowInfinityUndefined: Self = StObject.set(x, "allowInfinity", js.undefined)
      
      inline def setAllowNaN(value: Boolean): Self = StObject.set(x, "allowNaN", value.asInstanceOf[js.Any])
      
      inline def setAllowNaNUndefined: Self = StObject.set(x, "allowNaN", js.undefined)
      
      inline def setMaxDecimalPlaces(value: Double): Self = StObject.set(x, "maxDecimalPlaces", value.asInstanceOf[js.Any])
      
      inline def setMaxDecimalPlacesUndefined: Self = StObject.set(x, "maxDecimalPlaces", js.undefined)
    }
  }
}
