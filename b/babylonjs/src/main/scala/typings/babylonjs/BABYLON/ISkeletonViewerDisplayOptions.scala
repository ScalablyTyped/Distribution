package typings.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ISkeletonViewerDisplayOptions extends StObject {
  
  /** Length of each local axis */
  var localAxesSize: js.UndefOr[Double] = js.undefined
  
  /** How far down to start tapering the bone spurs */
  var midStep: js.UndefOr[Double] = js.undefined
  
  /** How big is the midStep? */
  var midStepFactor: js.UndefOr[Double] = js.undefined
  
  /** Whether to show local axes or not  */
  var showLocalAxes: js.UndefOr[Boolean] = js.undefined
  
  /** Base for the Sphere Size */
  var sphereBaseSize: js.UndefOr[Double] = js.undefined
  
  /** Ratio for the Sphere Size */
  var sphereFactor: js.UndefOr[Double] = js.undefined
  
  /** The ratio of the sphere to the longest bone in units */
  var sphereScaleUnit: js.UndefOr[Double] = js.undefined
  
  /** Whether a spur should attach its far end to the child bone position */
  var spurFollowsChild: js.UndefOr[Boolean] = js.undefined
}
object ISkeletonViewerDisplayOptions {
  
  inline def apply(): ISkeletonViewerDisplayOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ISkeletonViewerDisplayOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ISkeletonViewerDisplayOptions] (val x: Self) extends AnyVal {
    
    inline def setLocalAxesSize(value: Double): Self = StObject.set(x, "localAxesSize", value.asInstanceOf[js.Any])
    
    inline def setLocalAxesSizeUndefined: Self = StObject.set(x, "localAxesSize", js.undefined)
    
    inline def setMidStep(value: Double): Self = StObject.set(x, "midStep", value.asInstanceOf[js.Any])
    
    inline def setMidStepFactor(value: Double): Self = StObject.set(x, "midStepFactor", value.asInstanceOf[js.Any])
    
    inline def setMidStepFactorUndefined: Self = StObject.set(x, "midStepFactor", js.undefined)
    
    inline def setMidStepUndefined: Self = StObject.set(x, "midStep", js.undefined)
    
    inline def setShowLocalAxes(value: Boolean): Self = StObject.set(x, "showLocalAxes", value.asInstanceOf[js.Any])
    
    inline def setShowLocalAxesUndefined: Self = StObject.set(x, "showLocalAxes", js.undefined)
    
    inline def setSphereBaseSize(value: Double): Self = StObject.set(x, "sphereBaseSize", value.asInstanceOf[js.Any])
    
    inline def setSphereBaseSizeUndefined: Self = StObject.set(x, "sphereBaseSize", js.undefined)
    
    inline def setSphereFactor(value: Double): Self = StObject.set(x, "sphereFactor", value.asInstanceOf[js.Any])
    
    inline def setSphereFactorUndefined: Self = StObject.set(x, "sphereFactor", js.undefined)
    
    inline def setSphereScaleUnit(value: Double): Self = StObject.set(x, "sphereScaleUnit", value.asInstanceOf[js.Any])
    
    inline def setSphereScaleUnitUndefined: Self = StObject.set(x, "sphereScaleUnit", js.undefined)
    
    inline def setSpurFollowsChild(value: Boolean): Self = StObject.set(x, "spurFollowsChild", value.asInstanceOf[js.Any])
    
    inline def setSpurFollowsChildUndefined: Self = StObject.set(x, "spurFollowsChild", js.undefined)
  }
}
