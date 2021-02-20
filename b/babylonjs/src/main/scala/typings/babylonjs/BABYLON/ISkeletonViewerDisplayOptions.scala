package typings.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ISkeletonViewerDisplayOptions extends StObject {
  
  /** Length of each local axis */
  var localAxesSize: js.UndefOr[Double] = js.native
  
  /** How far down to start tapering the bone spurs */
  var midStep: js.UndefOr[Double] = js.native
  
  /** How big is the midStep? */
  var midStepFactor: js.UndefOr[Double] = js.native
  
  /** Whether to show local axes or not  */
  var showLocalAxes: js.UndefOr[Boolean] = js.native
  
  /** Base for the Sphere Size */
  var sphereBaseSize: js.UndefOr[Double] = js.native
  
  /** Ratio for the Sphere Size */
  var sphereFactor: js.UndefOr[Double] = js.native
  
  /** The ratio of the sphere to the longest bone in units */
  var sphereScaleUnit: js.UndefOr[Double] = js.native
  
  /** Whether a spur should attach its far end to the child bone position */
  var spurFollowsChild: js.UndefOr[Boolean] = js.native
}
object ISkeletonViewerDisplayOptions {
  
  @scala.inline
  def apply(): ISkeletonViewerDisplayOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ISkeletonViewerDisplayOptions]
  }
  
  @scala.inline
  implicit class ISkeletonViewerDisplayOptionsMutableBuilder[Self <: ISkeletonViewerDisplayOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLocalAxesSize(value: Double): Self = StObject.set(x, "localAxesSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocalAxesSizeUndefined: Self = StObject.set(x, "localAxesSize", js.undefined)
    
    @scala.inline
    def setMidStep(value: Double): Self = StObject.set(x, "midStep", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMidStepFactor(value: Double): Self = StObject.set(x, "midStepFactor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMidStepFactorUndefined: Self = StObject.set(x, "midStepFactor", js.undefined)
    
    @scala.inline
    def setMidStepUndefined: Self = StObject.set(x, "midStep", js.undefined)
    
    @scala.inline
    def setShowLocalAxes(value: Boolean): Self = StObject.set(x, "showLocalAxes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowLocalAxesUndefined: Self = StObject.set(x, "showLocalAxes", js.undefined)
    
    @scala.inline
    def setSphereBaseSize(value: Double): Self = StObject.set(x, "sphereBaseSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSphereBaseSizeUndefined: Self = StObject.set(x, "sphereBaseSize", js.undefined)
    
    @scala.inline
    def setSphereFactor(value: Double): Self = StObject.set(x, "sphereFactor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSphereFactorUndefined: Self = StObject.set(x, "sphereFactor", js.undefined)
    
    @scala.inline
    def setSphereScaleUnit(value: Double): Self = StObject.set(x, "sphereScaleUnit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSphereScaleUnitUndefined: Self = StObject.set(x, "sphereScaleUnit", js.undefined)
    
    @scala.inline
    def setSpurFollowsChild(value: Boolean): Self = StObject.set(x, "spurFollowsChild", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSpurFollowsChildUndefined: Self = StObject.set(x, "spurFollowsChild", js.undefined)
  }
}
