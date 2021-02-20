package typings.babylonjs.anon

import typings.babylonjs.BABYLON.ISkeletonViewerDisplayOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<babylonjs.BABYLON.ISkeletonViewerOptions> */
@js.native
trait PartialISkeletonViewerOptComputeBonesUsingShaders extends StObject {
  
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
  implicit class PartialISkeletonViewerOptComputeBonesUsingShadersMutableBuilder[Self <: PartialISkeletonViewerOptComputeBonesUsingShaders] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setComputeBonesUsingShaders(value: Boolean): Self = StObject.set(x, "computeBonesUsingShaders", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setComputeBonesUsingShadersUndefined: Self = StObject.set(x, "computeBonesUsingShaders", js.undefined)
    
    @scala.inline
    def setDisplayMode(value: Double): Self = StObject.set(x, "displayMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisplayModeUndefined: Self = StObject.set(x, "displayMode", js.undefined)
    
    @scala.inline
    def setDisplayOptions(value: ISkeletonViewerDisplayOptions): Self = StObject.set(x, "displayOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisplayOptionsUndefined: Self = StObject.set(x, "displayOptions", js.undefined)
    
    @scala.inline
    def setPauseAnimations(value: Boolean): Self = StObject.set(x, "pauseAnimations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPauseAnimationsUndefined: Self = StObject.set(x, "pauseAnimations", js.undefined)
    
    @scala.inline
    def setReturnToRest(value: Boolean): Self = StObject.set(x, "returnToRest", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReturnToRestUndefined: Self = StObject.set(x, "returnToRest", js.undefined)
    
    @scala.inline
    def setUseAllBones(value: Boolean): Self = StObject.set(x, "useAllBones", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUseAllBonesUndefined: Self = StObject.set(x, "useAllBones", js.undefined)
  }
}
