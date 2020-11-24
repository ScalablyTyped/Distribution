package typings.babylonjs.BABYLON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IFresnelParametersCreationOptions extends js.Object {
  
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
  implicit class IFresnelParametersCreationOptionsOps[Self <: IFresnelParametersCreationOptions] (val x: Self) extends AnyVal {
    
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
    def deleteBias: Self = this.set("bias", js.undefined)
    
    @scala.inline
    def setIsEnabled(value: Boolean): Self = this.set("isEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsEnabled: Self = this.set("isEnabled", js.undefined)
    
    @scala.inline
    def setLeftColor(value: Color3): Self = this.set("leftColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLeftColor: Self = this.set("leftColor", js.undefined)
    
    @scala.inline
    def setPower(value: Double): Self = this.set("power", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePower: Self = this.set("power", js.undefined)
    
    @scala.inline
    def setRightColor(value: Color3): Self = this.set("rightColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRightColor: Self = this.set("rightColor", js.undefined)
  }
}
