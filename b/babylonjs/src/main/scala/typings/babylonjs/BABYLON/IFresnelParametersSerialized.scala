package typings.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
