package typings.babylonjs

import typings.babylonjs.mathColorMod.Color3
import typings.babylonjs.typesMod.DeepImmutable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object fresnelParametersMod {
  
  @JSImport("babylonjs/Materials/fresnelParameters", "FresnelParameters")
  @js.native
  /**
    * Creates a new FresnelParameters object.
    *
    * @param options provide your own settings to optionally to override defaults
    */
  class FresnelParameters () extends StObject {
    def this(options: IFresnelParametersCreationOptions) = this()
    
    var _isEnabled: js.Any = js.native
    
    /**
      * Define bias applied to computed fresnel term
      */
    var bias: Double = js.native
    
    /**
      * Determines equality between FresnelParameters objects
      * @param otherFresnelParameters defines the second operand
      * @returns true if the power, bias, leftColor, rightColor and isEnabled values are equal to the given ones
      */
    def equals(otherFresnelParameters: DeepImmutable[FresnelParameters]): Boolean = js.native
    
    /**
      * Define if the fresnel effect is enable or not.
      */
    def isEnabled: Boolean = js.native
    def isEnabled_=(value: Boolean): Unit = js.native
    
    /**
      * Define the color used on edges (grazing angle)
      */
    var leftColor: Color3 = js.native
    
    /**
      * Defined the power exponent applied to fresnel term
      */
    var power: Double = js.native
    
    /**
      * Define the color used on center
      */
    var rightColor: Color3 = js.native
    
    /**
      * Serializes the current fresnel parameters to a JSON representation.
      * @return the JSON serialization
      */
    def serialize(): IFresnelParametersSerialized = js.native
  }
  /* static members */
  object FresnelParameters {
    
    /**
      * Parse a JSON object and deserialize it to a new Fresnel parameter object.
      * @param parsedFresnelParameters Define the JSON representation
      * @returns the parsed parameters
      */
    @JSImport("babylonjs/Materials/fresnelParameters", "FresnelParameters.Parse")
    @js.native
    def Parse(parsedFresnelParameters: IFresnelParametersSerialized): FresnelParameters = js.native
  }
  
  @js.native
  trait IFresnelParametersCreationOptions extends StObject {
    
    /**
      * Define bias applied to computed fresnel term
      */
    var bias: js.UndefOr[Double] = js.native
    
    /**
      * Define if the fresnel effect is enable or not.
      */
    var isEnabled: js.UndefOr[Boolean] = js.native
    
    /**
      * Define the color used on edges (grazing angle)
      */
    var leftColor: js.UndefOr[Color3] = js.native
    
    /**
      * Defined the power exponent applied to fresnel term
      */
    var power: js.UndefOr[Double] = js.native
    
    /**
      * Define the color used on center
      */
    var rightColor: js.UndefOr[Color3] = js.native
  }
  object IFresnelParametersCreationOptions {
    
    @scala.inline
    def apply(): IFresnelParametersCreationOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IFresnelParametersCreationOptions]
    }
    
    @scala.inline
    implicit class IFresnelParametersCreationOptionsMutableBuilder[Self <: IFresnelParametersCreationOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBias(value: Double): Self = StObject.set(x, "bias", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBiasUndefined: Self = StObject.set(x, "bias", js.undefined)
      
      @scala.inline
      def setIsEnabled(value: Boolean): Self = StObject.set(x, "isEnabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsEnabledUndefined: Self = StObject.set(x, "isEnabled", js.undefined)
      
      @scala.inline
      def setLeftColor(value: Color3): Self = StObject.set(x, "leftColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLeftColorUndefined: Self = StObject.set(x, "leftColor", js.undefined)
      
      @scala.inline
      def setPower(value: Double): Self = StObject.set(x, "power", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPowerUndefined: Self = StObject.set(x, "power", js.undefined)
      
      @scala.inline
      def setRightColor(value: Color3): Self = StObject.set(x, "rightColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRightColorUndefined: Self = StObject.set(x, "rightColor", js.undefined)
    }
  }
  
  @js.native
  trait IFresnelParametersSerialized extends StObject {
    
    /**
      * Define bias applied to computed fresnel term
      */
    var bias: Double = js.native
    
    /**
      * Define if the fresnel effect is enable or not.
      */
    var isEnabled: Boolean = js.native
    
    /**
      * Define the color used on edges (grazing angle) [as an array]
      */
    var leftColor: js.Array[Double] = js.native
    
    /**
      * Defined the power exponent applied to fresnel term
      */
    var power: js.UndefOr[Double] = js.native
    
    /**
      * Define the color used on center [as an array]
      */
    var rightColor: js.Array[Double] = js.native
  }
  object IFresnelParametersSerialized {
    
    @scala.inline
    def apply(bias: Double, isEnabled: Boolean, leftColor: js.Array[Double], rightColor: js.Array[Double]): IFresnelParametersSerialized = {
      val __obj = js.Dynamic.literal(bias = bias.asInstanceOf[js.Any], isEnabled = isEnabled.asInstanceOf[js.Any], leftColor = leftColor.asInstanceOf[js.Any], rightColor = rightColor.asInstanceOf[js.Any])
      __obj.asInstanceOf[IFresnelParametersSerialized]
    }
    
    @scala.inline
    implicit class IFresnelParametersSerializedMutableBuilder[Self <: IFresnelParametersSerialized] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBias(value: Double): Self = StObject.set(x, "bias", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsEnabled(value: Boolean): Self = StObject.set(x, "isEnabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLeftColor(value: js.Array[Double]): Self = StObject.set(x, "leftColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLeftColorVarargs(value: Double*): Self = StObject.set(x, "leftColor", js.Array(value :_*))
      
      @scala.inline
      def setPower(value: Double): Self = StObject.set(x, "power", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPowerUndefined: Self = StObject.set(x, "power", js.undefined)
      
      @scala.inline
      def setRightColor(value: js.Array[Double]): Self = StObject.set(x, "rightColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRightColorVarargs(value: Double*): Self = StObject.set(x, "rightColor", js.Array(value :_*))
    }
  }
}
