package typings.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ISkeletonViewerOptions extends StObject {
  
  /** Flag to toggle if the Viewer should use the CPU for animations or not? */
  var computeBonesUsingShaders: Boolean = js.native
  
  /** public Display Mode of the Viewer */
  var displayMode: Double = js.native
  
  /** Flag to toggle if the Viewer should use the CPU for animations or not? */
  var displayOptions: ISkeletonViewerDisplayOptions = js.native
  
  /** Should the system pause animations before building the Viewer? */
  var pauseAnimations: Boolean = js.native
  
  /** Should the system return the skeleton to rest before building? */
  var returnToRest: Boolean = js.native
  
  /** Flag ignore non weighted bones */
  var useAllBones: Boolean = js.native
}
object ISkeletonViewerOptions {
  
  @scala.inline
  def apply(
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
  implicit class ISkeletonViewerOptionsMutableBuilder[Self <: ISkeletonViewerOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setComputeBonesUsingShaders(value: Boolean): Self = StObject.set(x, "computeBonesUsingShaders", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisplayMode(value: Double): Self = StObject.set(x, "displayMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisplayOptions(value: ISkeletonViewerDisplayOptions): Self = StObject.set(x, "displayOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPauseAnimations(value: Boolean): Self = StObject.set(x, "pauseAnimations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReturnToRest(value: Boolean): Self = StObject.set(x, "returnToRest", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUseAllBones(value: Boolean): Self = StObject.set(x, "useAllBones", value.asInstanceOf[js.Any])
  }
}
