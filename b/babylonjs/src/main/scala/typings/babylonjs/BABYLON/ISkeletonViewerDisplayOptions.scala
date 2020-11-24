package typings.babylonjs.BABYLON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ISkeletonViewerDisplayOptions extends js.Object {
  
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
  implicit class ISkeletonViewerDisplayOptionsOps[Self <: ISkeletonViewerDisplayOptions] (val x: Self) extends AnyVal {
    
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
    def setLocalAxesSize(value: Double): Self = this.set("localAxesSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLocalAxesSize: Self = this.set("localAxesSize", js.undefined)
    
    @scala.inline
    def setMidStep(value: Double): Self = this.set("midStep", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMidStep: Self = this.set("midStep", js.undefined)
    
    @scala.inline
    def setMidStepFactor(value: Double): Self = this.set("midStepFactor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMidStepFactor: Self = this.set("midStepFactor", js.undefined)
    
    @scala.inline
    def setShowLocalAxes(value: Boolean): Self = this.set("showLocalAxes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowLocalAxes: Self = this.set("showLocalAxes", js.undefined)
    
    @scala.inline
    def setSphereBaseSize(value: Double): Self = this.set("sphereBaseSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSphereBaseSize: Self = this.set("sphereBaseSize", js.undefined)
    
    @scala.inline
    def setSphereFactor(value: Double): Self = this.set("sphereFactor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSphereFactor: Self = this.set("sphereFactor", js.undefined)
    
    @scala.inline
    def setSphereScaleUnit(value: Double): Self = this.set("sphereScaleUnit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSphereScaleUnit: Self = this.set("sphereScaleUnit", js.undefined)
    
    @scala.inline
    def setSpurFollowsChild(value: Boolean): Self = this.set("spurFollowsChild", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSpurFollowsChild: Self = this.set("spurFollowsChild", js.undefined)
  }
}
