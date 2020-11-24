package typings.babylonjs

import typings.babylonjs.anon.DetectedPlanes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait XRFrame extends js.Object {
  
  var createAnchor: js.UndefOr[
    js.Function2[/* pose */ XRRigidTransform, /* space */ XRSpace, js.Promise[XRAnchor]]
  ] = js.native
  
  var featurePointCloud: js.UndefOr[js.Array[Double]] = js.native
  
  // AR
  def getHitTestResults(hitTestSource: XRHitTestSource): js.Array[XRHitTestResult] = js.native
  
  def getHitTestResultsForTransientInput(hitTestSource: XRTransientInputHitTestSource): js.Array[XRTransientInputHitTestResult] = js.native
  
  // Hand tracking
  var getJointPose: js.UndefOr[js.Function2[/* joint */ XRJointSpace, /* baseSpace */ XRSpace, XRJointPose]] = js.native
  
  def getPose(space: XRSpace, baseSpace: XRSpace): js.UndefOr[XRPose] = js.native
  
  def getViewerPose(referenceSpace: XRReferenceSpace): js.UndefOr[XRViewerPose] = js.native
  
  val session: XRSession = js.native
  
  // Anchors
  var trackedAnchors: js.UndefOr[XRAnchorSet] = js.native
  
  // Planes
  var worldInformation: js.UndefOr[DetectedPlanes] = js.native
}
object XRFrame {
  
  @scala.inline
  def apply(
    getHitTestResults: XRHitTestSource => js.Array[XRHitTestResult],
    getHitTestResultsForTransientInput: XRTransientInputHitTestSource => js.Array[XRTransientInputHitTestResult],
    getPose: (XRSpace, XRSpace) => js.UndefOr[XRPose],
    getViewerPose: XRReferenceSpace => js.UndefOr[XRViewerPose],
    session: XRSession
  ): XRFrame = {
    val __obj = js.Dynamic.literal(getHitTestResults = js.Any.fromFunction1(getHitTestResults), getHitTestResultsForTransientInput = js.Any.fromFunction1(getHitTestResultsForTransientInput), getPose = js.Any.fromFunction2(getPose), getViewerPose = js.Any.fromFunction1(getViewerPose), session = session.asInstanceOf[js.Any])
    __obj.asInstanceOf[XRFrame]
  }
  
  @scala.inline
  implicit class XRFrameOps[Self <: XRFrame] (val x: Self) extends AnyVal {
    
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
    def setGetHitTestResults(value: XRHitTestSource => js.Array[XRHitTestResult]): Self = this.set("getHitTestResults", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetHitTestResultsForTransientInput(value: XRTransientInputHitTestSource => js.Array[XRTransientInputHitTestResult]): Self = this.set("getHitTestResultsForTransientInput", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetPose(value: (XRSpace, XRSpace) => js.UndefOr[XRPose]): Self = this.set("getPose", js.Any.fromFunction2(value))
    
    @scala.inline
    def setGetViewerPose(value: XRReferenceSpace => js.UndefOr[XRViewerPose]): Self = this.set("getViewerPose", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSession(value: XRSession): Self = this.set("session", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreateAnchor(value: (/* pose */ XRRigidTransform, /* space */ XRSpace) => js.Promise[XRAnchor]): Self = this.set("createAnchor", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteCreateAnchor: Self = this.set("createAnchor", js.undefined)
    
    @scala.inline
    def setFeaturePointCloudVarargs(value: Double*): Self = this.set("featurePointCloud", js.Array(value :_*))
    
    @scala.inline
    def setFeaturePointCloud(value: js.Array[Double]): Self = this.set("featurePointCloud", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFeaturePointCloud: Self = this.set("featurePointCloud", js.undefined)
    
    @scala.inline
    def setGetJointPose(value: (/* joint */ XRJointSpace, /* baseSpace */ XRSpace) => XRJointPose): Self = this.set("getJointPose", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteGetJointPose: Self = this.set("getJointPose", js.undefined)
    
    @scala.inline
    def setTrackedAnchors(value: XRAnchorSet): Self = this.set("trackedAnchors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTrackedAnchors: Self = this.set("trackedAnchors", js.undefined)
    
    @scala.inline
    def setWorldInformation(value: DetectedPlanes): Self = this.set("worldInformation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWorldInformation: Self = this.set("worldInformation", js.undefined)
  }
}
