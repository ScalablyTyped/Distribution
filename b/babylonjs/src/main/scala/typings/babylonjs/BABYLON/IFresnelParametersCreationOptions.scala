package typings.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
