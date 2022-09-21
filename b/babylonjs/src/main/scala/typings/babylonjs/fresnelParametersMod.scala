package typings.babylonjs

import typings.babylonjs.mathColorMod.Color3
import typings.babylonjs.typesMod.DeepImmutable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object fresnelParametersMod {
  
  @JSImport("babylonjs/Materials/fresnelParameters", "FresnelParameters")
  @js.native
  /**
    * Creates a new FresnelParameters object.
    *
    * @param options provide your own settings to optionally to override defaults
    */
  open class FresnelParameters () extends StObject {
    def this(options: IFresnelParametersCreationOptions) = this()
    
    /* private */ var _isEnabled: Any = js.native
    
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
      * @returns the JSON serialization
      */
    def serialize(): IFresnelParametersSerialized = js.native
  }
  /* static members */
  object FresnelParameters {
    
    @JSImport("babylonjs/Materials/fresnelParameters", "FresnelParameters")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Parse a JSON object and deserialize it to a new Fresnel parameter object.
      * @param parsedFresnelParameters Define the JSON representation
      * @returns the parsed parameters
      */
    inline def Parse(parsedFresnelParameters: IFresnelParametersSerialized): FresnelParameters = ^.asInstanceOf[js.Dynamic].applyDynamic("Parse")(parsedFresnelParameters.asInstanceOf[js.Any]).asInstanceOf[FresnelParameters]
  }
  
  trait IFresnelParametersCreationOptions extends StObject {
    
    /**
      * Define bias applied to computed fresnel term
      */
    var bias: js.UndefOr[Double] = js.undefined
    
    /**
      * Define if the fresnel effect is enable or not.
      */
    var isEnabled: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Define the color used on edges (grazing angle)
      */
    var leftColor: js.UndefOr[Color3] = js.undefined
    
    /**
      * Defined the power exponent applied to fresnel term
      */
    var power: js.UndefOr[Double] = js.undefined
    
    /**
      * Define the color used on center
      */
    var rightColor: js.UndefOr[Color3] = js.undefined
  }
  object IFresnelParametersCreationOptions {
    
    inline def apply(): IFresnelParametersCreationOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IFresnelParametersCreationOptions]
    }
    
    extension [Self <: IFresnelParametersCreationOptions](x: Self) {
      
      inline def setBias(value: Double): Self = StObject.set(x, "bias", value.asInstanceOf[js.Any])
      
      inline def setBiasUndefined: Self = StObject.set(x, "bias", js.undefined)
      
      inline def setIsEnabled(value: Boolean): Self = StObject.set(x, "isEnabled", value.asInstanceOf[js.Any])
      
      inline def setIsEnabledUndefined: Self = StObject.set(x, "isEnabled", js.undefined)
      
      inline def setLeftColor(value: Color3): Self = StObject.set(x, "leftColor", value.asInstanceOf[js.Any])
      
      inline def setLeftColorUndefined: Self = StObject.set(x, "leftColor", js.undefined)
      
      inline def setPower(value: Double): Self = StObject.set(x, "power", value.asInstanceOf[js.Any])
      
      inline def setPowerUndefined: Self = StObject.set(x, "power", js.undefined)
      
      inline def setRightColor(value: Color3): Self = StObject.set(x, "rightColor", value.asInstanceOf[js.Any])
      
      inline def setRightColorUndefined: Self = StObject.set(x, "rightColor", js.undefined)
    }
  }
  
  trait IFresnelParametersSerialized extends StObject {
    
    /**
      * Define bias applied to computed fresnel term
      */
    var bias: Double
    
    /**
      * Define if the fresnel effect is enable or not.
      */
    var isEnabled: Boolean
    
    /**
      * Define the color used on edges (grazing angle) [as an array]
      */
    var leftColor: js.Array[Double]
    
    /**
      * Defined the power exponent applied to fresnel term
      */
    var power: js.UndefOr[Double] = js.undefined
    
    /**
      * Define the color used on center [as an array]
      */
    var rightColor: js.Array[Double]
  }
  object IFresnelParametersSerialized {
    
    inline def apply(bias: Double, isEnabled: Boolean, leftColor: js.Array[Double], rightColor: js.Array[Double]): IFresnelParametersSerialized = {
      val __obj = js.Dynamic.literal(bias = bias.asInstanceOf[js.Any], isEnabled = isEnabled.asInstanceOf[js.Any], leftColor = leftColor.asInstanceOf[js.Any], rightColor = rightColor.asInstanceOf[js.Any])
      __obj.asInstanceOf[IFresnelParametersSerialized]
    }
    
    extension [Self <: IFresnelParametersSerialized](x: Self) {
      
      inline def setBias(value: Double): Self = StObject.set(x, "bias", value.asInstanceOf[js.Any])
      
      inline def setIsEnabled(value: Boolean): Self = StObject.set(x, "isEnabled", value.asInstanceOf[js.Any])
      
      inline def setLeftColor(value: js.Array[Double]): Self = StObject.set(x, "leftColor", value.asInstanceOf[js.Any])
      
      inline def setLeftColorVarargs(value: Double*): Self = StObject.set(x, "leftColor", js.Array(value*))
      
      inline def setPower(value: Double): Self = StObject.set(x, "power", value.asInstanceOf[js.Any])
      
      inline def setPowerUndefined: Self = StObject.set(x, "power", js.undefined)
      
      inline def setRightColor(value: js.Array[Double]): Self = StObject.set(x, "rightColor", value.asInstanceOf[js.Any])
      
      inline def setRightColorVarargs(value: Double*): Self = StObject.set(x, "rightColor", js.Array(value*))
    }
  }
}
