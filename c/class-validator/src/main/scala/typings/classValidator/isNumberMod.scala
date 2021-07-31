package typings.classValidator

import typings.classValidator.validationOptionsMod.ValidationOptions
import typings.std.PropertyDecorator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object isNumberMod {
  
  @JSImport("class-validator/types/decorator/typechecker/IsNumber", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("class-validator/types/decorator/typechecker/IsNumber", "IS_NUMBER")
  @js.native
  val IS_NUMBER: /* "isNumber" */ String = js.native
  
  @scala.inline
  def IsNumber_(): PropertyDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("IsNumber")().asInstanceOf[PropertyDecorator]
  @scala.inline
  def IsNumber_(options: Unit, validationOptions: ValidationOptions): PropertyDecorator = (^.asInstanceOf[js.Dynamic].applyDynamic("IsNumber")(options.asInstanceOf[js.Any], validationOptions.asInstanceOf[js.Any])).asInstanceOf[PropertyDecorator]
  @scala.inline
  def IsNumber_(options: IsNumberOptions): PropertyDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("IsNumber")(options.asInstanceOf[js.Any]).asInstanceOf[PropertyDecorator]
  @scala.inline
  def IsNumber_(options: IsNumberOptions, validationOptions: ValidationOptions): PropertyDecorator = (^.asInstanceOf[js.Dynamic].applyDynamic("IsNumber")(options.asInstanceOf[js.Any], validationOptions.asInstanceOf[js.Any])).asInstanceOf[PropertyDecorator]
  
  @scala.inline
  def isNumber(value: js.Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isNumber")(value.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  @scala.inline
  def isNumber(value: js.Any, options: IsNumberOptions): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isNumber")(value.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  trait IsNumberOptions extends StObject {
    
    var allowInfinity: js.UndefOr[Boolean] = js.undefined
    
    var allowNaN: js.UndefOr[Boolean] = js.undefined
    
    var maxDecimalPlaces: js.UndefOr[Double] = js.undefined
  }
  object IsNumberOptions {
    
    @scala.inline
    def apply(): IsNumberOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IsNumberOptions]
    }
    
    @scala.inline
    implicit class IsNumberOptionsMutableBuilder[Self <: IsNumberOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAllowInfinity(value: Boolean): Self = StObject.set(x, "allowInfinity", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAllowInfinityUndefined: Self = StObject.set(x, "allowInfinity", js.undefined)
      
      @scala.inline
      def setAllowNaN(value: Boolean): Self = StObject.set(x, "allowNaN", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAllowNaNUndefined: Self = StObject.set(x, "allowNaN", js.undefined)
      
      @scala.inline
      def setMaxDecimalPlaces(value: Double): Self = StObject.set(x, "maxDecimalPlaces", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxDecimalPlacesUndefined: Self = StObject.set(x, "maxDecimalPlaces", js.undefined)
    }
  }
}
