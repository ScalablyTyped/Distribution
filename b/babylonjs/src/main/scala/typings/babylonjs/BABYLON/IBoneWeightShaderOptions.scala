package typings.babylonjs.BABYLON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IBoneWeightShaderOptions extends js.Object {
  
  /** Colors for Uninfluenced bones */
  var colorBase: js.UndefOr[Color3] = js.native
  
  /** Color for 0.75-1 Weight Influence */
  var colorFull: js.UndefOr[Color3] = js.native
  
  /** Color for 0.5-0.75 Weight Influence */
  var colorHalf: js.UndefOr[Color3] = js.native
  
  /** Color for 0.25-0.5 Weight Influence */
  var colorQuarter: js.UndefOr[Color3] = js.native
  
  /** Colors for 0.0-0.25 Weight bones */
  var colorZero: js.UndefOr[Color3] = js.native
  
  /** Skeleton to Map */
  var skeleton: Skeleton = js.native
  
  /** Color for Zero Weight Influence */
  var targetBoneIndex: js.UndefOr[Double] = js.native
}
object IBoneWeightShaderOptions {
  
  @scala.inline
  def apply(skeleton: Skeleton): IBoneWeightShaderOptions = {
    val __obj = js.Dynamic.literal(skeleton = skeleton.asInstanceOf[js.Any])
    __obj.asInstanceOf[IBoneWeightShaderOptions]
  }
  
  @scala.inline
  implicit class IBoneWeightShaderOptionsOps[Self <: IBoneWeightShaderOptions] (val x: Self) extends AnyVal {
    
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
    def setSkeleton(value: Skeleton): Self = this.set("skeleton", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColorBase(value: Color3): Self = this.set("colorBase", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColorBase: Self = this.set("colorBase", js.undefined)
    
    @scala.inline
    def setColorFull(value: Color3): Self = this.set("colorFull", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColorFull: Self = this.set("colorFull", js.undefined)
    
    @scala.inline
    def setColorHalf(value: Color3): Self = this.set("colorHalf", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColorHalf: Self = this.set("colorHalf", js.undefined)
    
    @scala.inline
    def setColorQuarter(value: Color3): Self = this.set("colorQuarter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColorQuarter: Self = this.set("colorQuarter", js.undefined)
    
    @scala.inline
    def setColorZero(value: Color3): Self = this.set("colorZero", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColorZero: Self = this.set("colorZero", js.undefined)
    
    @scala.inline
    def setTargetBoneIndex(value: Double): Self = this.set("targetBoneIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTargetBoneIndex: Self = this.set("targetBoneIndex", js.undefined)
  }
}
