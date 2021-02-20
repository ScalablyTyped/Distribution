package typings.babylonjs

import typings.babylonjs.anon.DetectedPlanes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait XRFrame extends StObject {
  
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
  implicit class XRFrameMutableBuilder[Self <: XRFrame] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCreateAnchor(value: (/* pose */ XRRigidTransform, /* space */ XRSpace) => js.Promise[XRAnchor]): Self = StObject.set(x, "createAnchor", js.Any.fromFunction2(value))
    
    @scala.inline
    def setCreateAnchorUndefined: Self = StObject.set(x, "createAnchor", js.undefined)
    
    @scala.inline
    def setFeaturePointCloud(value: js.Array[Double]): Self = StObject.set(x, "featurePointCloud", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFeaturePointCloudUndefined: Self = StObject.set(x, "featurePointCloud", js.undefined)
    
    @scala.inline
    def setFeaturePointCloudVarargs(value: Double*): Self = StObject.set(x, "featurePointCloud", js.Array(value :_*))
    
    @scala.inline
    def setGetHitTestResults(value: XRHitTestSource => js.Array[XRHitTestResult]): Self = StObject.set(x, "getHitTestResults", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetHitTestResultsForTransientInput(value: XRTransientInputHitTestSource => js.Array[XRTransientInputHitTestResult]): Self = StObject.set(x, "getHitTestResultsForTransientInput", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetJointPose(value: (/* joint */ XRJointSpace, /* baseSpace */ XRSpace) => XRJointPose): Self = StObject.set(x, "getJointPose", js.Any.fromFunction2(value))
    
    @scala.inline
    def setGetJointPoseUndefined: Self = StObject.set(x, "getJointPose", js.undefined)
    
    @scala.inline
    def setGetPose(value: (XRSpace, XRSpace) => js.UndefOr[XRPose]): Self = StObject.set(x, "getPose", js.Any.fromFunction2(value))
    
    @scala.inline
    def setGetViewerPose(value: XRReferenceSpace => js.UndefOr[XRViewerPose]): Self = StObject.set(x, "getViewerPose", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSession(value: XRSession): Self = StObject.set(x, "session", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTrackedAnchors(value: XRAnchorSet): Self = StObject.set(x, "trackedAnchors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTrackedAnchorsUndefined: Self = StObject.set(x, "trackedAnchors", js.undefined)
    
    @scala.inline
    def setWorldInformation(value: DetectedPlanes): Self = StObject.set(x, "worldInformation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWorldInformationUndefined: Self = StObject.set(x, "worldInformation", js.undefined)
  }
}
