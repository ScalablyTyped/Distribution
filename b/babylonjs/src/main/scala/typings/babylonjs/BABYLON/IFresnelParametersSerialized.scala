package typings.babylonjs.BABYLON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IFresnelParametersSerialized extends js.Object {
  
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
  implicit class IFresnelParametersSerializedOps[Self <: IFresnelParametersSerialized] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setBias(value: Double): Self = this.set("bias", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsEnabled(value: Boolean): Self = this.set("isEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLeftColorVarargs(value: Double*): Self = this.set("leftColor", js.Array(value :_*))
    
    @scala.inline
    def setLeftColor(value: js.Array[Double]): Self = this.set("leftColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRightColorVarargs(value: Double*): Self = this.set("rightColor", js.Array(value :_*))
    
    @scala.inline
    def setRightColor(value: js.Array[Double]): Self = this.set("rightColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPower(value: Double): Self = this.set("power", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePower: Self = this.set("power", js.undefined)
  }
}
