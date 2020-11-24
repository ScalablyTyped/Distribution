package typings.babylonjs.anon

import typings.babylonjs.BABYLON.ISkeletonViewerDisplayOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<babylonjs.BABYLON.ISkeletonViewerOptions> */
@js.native
trait PartialISkeletonViewerOptComputeBonesUsingShaders extends js.Object {
  
  var computeBonesUsingShaders: js.UndefOr[Boolean] = js.native
  
  var displayMode: js.UndefOr[Double] = js.native
  
  var displayOptions: js.UndefOr[ISkeletonViewerDisplayOptions] = js.native
  
  var pauseAnimations: js.UndefOr[Boolean] = js.native
  
  var returnToRest: js.UndefOr[Boolean] = js.native
  
  var useAllBones: js.UndefOr[Boolean] = js.native
}
object PartialISkeletonViewerOptComputeBonesUsingShaders {
  
  @scala.inline
  def apply(): PartialISkeletonViewerOptComputeBonesUsingShaders = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialISkeletonViewerOptComputeBonesUsingShaders]
  }
  
  @scala.inline
  implicit class PartialISkeletonViewerOptComputeBonesUsingShadersOps[Self <: PartialISkeletonViewerOptComputeBonesUsingShaders] (val x: Self) extends AnyVal {
    
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
    def setComputeBonesUsingShaders(value: Boolean): Self = this.set("computeBonesUsingShaders", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteComputeBonesUsingShaders: Self = this.set("computeBonesUsingShaders", js.undefined)
    
    @scala.inline
    def setDisplayMode(value: Double): Self = this.set("displayMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisplayMode: Self = this.set("displayMode", js.undefined)
    
    @scala.inline
    def setDisplayOptions(value: ISkeletonViewerDisplayOptions): Self = this.set("displayOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisplayOptions: Self = this.set("displayOptions", js.undefined)
    
    @scala.inline
    def setPauseAnimations(value: Boolean): Self = this.set("pauseAnimations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePauseAnimations: Self = this.set("pauseAnimations", js.undefined)
    
    @scala.inline
    def setReturnToRest(value: Boolean): Self = this.set("returnToRest", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReturnToRest: Self = this.set("returnToRest", js.undefined)
    
    @scala.inline
    def setUseAllBones(value: Boolean): Self = this.set("useAllBones", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUseAllBones: Self = this.set("useAllBones", js.undefined)
  }
}
