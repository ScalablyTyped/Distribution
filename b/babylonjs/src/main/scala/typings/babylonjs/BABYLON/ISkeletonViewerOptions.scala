package typings.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ISkeletonViewerOptions extends StObject {
  
  /** Flag to toggle if the Viewer should use the CPU for animations or not? */
  var computeBonesUsingShaders: Boolean
  
  /** public Display Mode of the Viewer */
  var displayMode: Double
  
  /** Flag to toggle if the Viewer should use the CPU for animations or not? */
  var displayOptions: ISkeletonViewerDisplayOptions
  
  /** Should the system pause animations before building the Viewer? */
  var pauseAnimations: Boolean
  
  /** Should the system return the skeleton to rest before building? */
  var returnToRest: Boolean
  
  /** Flag ignore non weighted bones */
  var useAllBones: Boolean
}
object ISkeletonViewerOptions {
  
  inline def apply(
    computeBonesUsingShaders: Boolean,
    displayMode: Double,
    displayOptions: ISkeletonViewerDisplayOptions,
    pauseAnimations: Boolean,
    returnToRest: Boolean,
    useAllBones: Boolean
  ): ISkeletonViewerOptions = {
    val __obj = js.Dynamic.literal(computeBonesUsingShaders = computeBonesUsingShaders.asInstanceOf[js.Any], displayMode = displayMode.asInstanceOf[js.Any], displayOptions = displayOptions.asInstanceOf[js.Any], pauseAnimations = pauseAnimations.asInstanceOf[js.Any], returnToRest = returnToRest.asInstanceOf[js.Any], useAllBones = useAllBones.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISkeletonViewerOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ISkeletonViewerOptions] (val x: Self) extends AnyVal {
    
    inline def setComputeBonesUsingShaders(value: Boolean): Self = StObject.set(x, "computeBonesUsingShaders", value.asInstanceOf[js.Any])
    
    inline def setDisplayMode(value: Double): Self = StObject.set(x, "displayMode", value.asInstanceOf[js.Any])
    
    inline def setDisplayOptions(value: ISkeletonViewerDisplayOptions): Self = StObject.set(x, "displayOptions", value.asInstanceOf[js.Any])
    
    inline def setPauseAnimations(value: Boolean): Self = StObject.set(x, "pauseAnimations", value.asInstanceOf[js.Any])
    
    inline def setReturnToRest(value: Boolean): Self = StObject.set(x, "returnToRest", value.asInstanceOf[js.Any])
    
    inline def setUseAllBones(value: Boolean): Self = StObject.set(x, "useAllBones", value.asInstanceOf[js.Any])
  }
}
