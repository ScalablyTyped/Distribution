package typings.babylonjs.anon

import typings.babylonjs.debugIskeletonviewerMod.ISkeletonViewerDisplayOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<babylonjs.babylonjs/Debug/ISkeletonViewer.ISkeletonViewerOptions> */
trait PartialISkeletonViewerOpt extends StObject {
  
  var computeBonesUsingShaders: js.UndefOr[Boolean] = js.undefined
  
  var displayMode: js.UndefOr[Double] = js.undefined
  
  var displayOptions: js.UndefOr[ISkeletonViewerDisplayOptions] = js.undefined
  
  var pauseAnimations: js.UndefOr[Boolean] = js.undefined
  
  var returnToRest: js.UndefOr[Boolean] = js.undefined
  
  var useAllBones: js.UndefOr[Boolean] = js.undefined
}
object PartialISkeletonViewerOpt {
  
  inline def apply(): PartialISkeletonViewerOpt = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialISkeletonViewerOpt]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PartialISkeletonViewerOpt] (val x: Self) extends AnyVal {
    
    inline def setComputeBonesUsingShaders(value: Boolean): Self = StObject.set(x, "computeBonesUsingShaders", value.asInstanceOf[js.Any])
    
    inline def setComputeBonesUsingShadersUndefined: Self = StObject.set(x, "computeBonesUsingShaders", js.undefined)
    
    inline def setDisplayMode(value: Double): Self = StObject.set(x, "displayMode", value.asInstanceOf[js.Any])
    
    inline def setDisplayModeUndefined: Self = StObject.set(x, "displayMode", js.undefined)
    
    inline def setDisplayOptions(value: ISkeletonViewerDisplayOptions): Self = StObject.set(x, "displayOptions", value.asInstanceOf[js.Any])
    
    inline def setDisplayOptionsUndefined: Self = StObject.set(x, "displayOptions", js.undefined)
    
    inline def setPauseAnimations(value: Boolean): Self = StObject.set(x, "pauseAnimations", value.asInstanceOf[js.Any])
    
    inline def setPauseAnimationsUndefined: Self = StObject.set(x, "pauseAnimations", js.undefined)
    
    inline def setReturnToRest(value: Boolean): Self = StObject.set(x, "returnToRest", value.asInstanceOf[js.Any])
    
    inline def setReturnToRestUndefined: Self = StObject.set(x, "returnToRest", js.undefined)
    
    inline def setUseAllBones(value: Boolean): Self = StObject.set(x, "useAllBones", value.asInstanceOf[js.Any])
    
    inline def setUseAllBonesUndefined: Self = StObject.set(x, "useAllBones", js.undefined)
  }
}
