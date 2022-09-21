package typings.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
