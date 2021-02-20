package typings.classValidator

import typings.classValidator.validationOptionsMod.ValidationOptions
import typings.std.PropertyDecorator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object isNumberMod {
  
  @JSImport("class-validator/types/decorator/typechecker/IsNumber", "IS_NUMBER")
  @js.native
  val IS_NUMBER: /* "isNumber" */ String = js.native
  
  @JSImport("class-validator/types/decorator/typechecker/IsNumber", "IsNumber")
  @js.native
  def IsNumber_(): PropertyDecorator = js.native
  @JSImport("class-validator/types/decorator/typechecker/IsNumber", "IsNumber")
  @js.native
  def IsNumber_(options: js.UndefOr[scala.Nothing], validationOptions: ValidationOptions): PropertyDecorator = js.native
  @JSImport("class-validator/types/decorator/typechecker/IsNumber", "IsNumber")
  @js.native
  def IsNumber_(options: IsNumberOptions): PropertyDecorator = js.native
  @JSImport("class-validator/types/decorator/typechecker/IsNumber", "IsNumber")
  @js.native
  def IsNumber_(options: IsNumberOptions, validationOptions: ValidationOptions): PropertyDecorator = js.native
  
  @JSImport("class-validator/types/decorator/typechecker/IsNumber", "isNumber")
  @js.native
  def isNumber(value: js.Any): Boolean = js.native
  @JSImport("class-validator/types/decorator/typechecker/IsNumber", "isNumber")
  @js.native
  def isNumber(value: js.Any, options: IsNumberOptions): Boolean = js.native
  
  @js.native
  trait IsNumberOptions extends StObject {
    
    var allowInfinity: js.UndefOr[Boolean] = js.native
    
    var allowNaN: js.UndefOr[Boolean] = js.native
    
    var maxDecimalPlaces: js.UndefOr[Double] = js.native
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
