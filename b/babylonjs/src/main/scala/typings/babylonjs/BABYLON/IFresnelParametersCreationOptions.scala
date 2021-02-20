package typings.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
