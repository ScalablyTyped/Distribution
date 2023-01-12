package typings.babylonjs

import typings.std.DOMHighResTimeStamp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents a snapshot of the state of all of the tracked objects for an XRSession. Applications
  * can acquire an XRFrame by calling requestAnimationFrame() on an XRSession with an
  * XRFrameRequestCallback. When the callback is called it will be passed an XRFrame.
  * Events which need to communicate tracking state, such as the select event, will also provide an
  * XRFrame.
  *
  * ref: https://immersive-web.github.io/webxr/#xrframe-interface
  */
trait XRFrame extends StObject {
  
  var createAnchor: js.UndefOr[
    js.Function2[/* pose */ XRRigidTransform, /* space */ XRSpace, js.Promise[XRAnchor]]
  ] = js.undefined
  
  var detectedPlanes: js.UndefOr[XRPlaneSet] = js.undefined
  
  var featurePointCloud: js.UndefOr[js.Array[Double]] = js.undefined
  
  var fillJointRadii: js.UndefOr[
    js.Function2[
      /* jointSpaces */ js.Array[XRJointSpace], 
      /* radii */ js.typedarray.Float32Array, 
      Boolean
    ]
  ] = js.undefined
  
  var fillPoses: js.UndefOr[
    js.Function3[
      /* spaces */ js.Array[XRSpace], 
      /* baseSpace */ XRSpace, 
      /* transforms */ js.typedarray.Float32Array, 
      Boolean
    ]
  ] = js.undefined
  
  def getHitTestResults(hitTestSource: XRHitTestSource): js.Array[XRHitTestResult]
  
  def getHitTestResultsForTransientInput(hitTestSource: XRTransientInputHitTestSource): js.Array[XRTransientInputHitTestResult]
  
  // Image tracking
  var getImageTrackingResults: js.UndefOr[js.Function0[js.Array[XRImageTrackingResult]]] = js.undefined
  
  // Hand tracking
  var getJointPose: js.UndefOr[js.Function2[/* joint */ XRJointSpace, /* baseSpace */ XRSpace, XRJointPose]] = js.undefined
  
  def getLightEstimate(xrLightProbe: XRLightProbe): XRLightEstimate
  
  /**
    * Provides the pose of space relative to baseSpace as an XRPose, at the time represented by
    * the XRFrame.
    *
    * @param space
    * @param baseSpace
    */
  def getPose(space: XRSpace, baseSpace: XRSpace): js.UndefOr[XRPose]
  
  /**
    * Provides the pose of the viewer relative to referenceSpace as an XRViewerPose, at the
    * XRFrame's time.
    *
    * @param referenceSpace
    */
  def getViewerPose(referenceSpace: XRReferenceSpace): js.UndefOr[XRViewerPose]
  
  // BABYLON CHANGE - switched to optional
  val predictedDisplayTime: js.UndefOr[DOMHighResTimeStamp] = js.undefined
  
  val session: XRSession
  
  // Anchors
  var trackedAnchors: js.UndefOr[XRAnchorSet] = js.undefined
  
  // World geometries. DEPRECATED
  var worldInformation: js.UndefOr[XRWorldInformation] = js.undefined
}
object XRFrame {
  
  inline def apply(
    getHitTestResults: XRHitTestSource => js.Array[XRHitTestResult],
    getHitTestResultsForTransientInput: XRTransientInputHitTestSource => js.Array[XRTransientInputHitTestResult],
    getLightEstimate: XRLightProbe => XRLightEstimate,
    getPose: (XRSpace, XRSpace) => js.UndefOr[XRPose],
    getViewerPose: XRReferenceSpace => js.UndefOr[XRViewerPose],
    session: XRSession
  ): XRFrame = {
    val __obj = js.Dynamic.literal(getHitTestResults = js.Any.fromFunction1(getHitTestResults), getHitTestResultsForTransientInput = js.Any.fromFunction1(getHitTestResultsForTransientInput), getLightEstimate = js.Any.fromFunction1(getLightEstimate), getPose = js.Any.fromFunction2(getPose), getViewerPose = js.Any.fromFunction1(getViewerPose), session = session.asInstanceOf[js.Any])
    __obj.asInstanceOf[XRFrame]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: XRFrame] (val x: Self) extends AnyVal {
    
    inline def setCreateAnchor(value: (/* pose */ XRRigidTransform, /* space */ XRSpace) => js.Promise[XRAnchor]): Self = StObject.set(x, "createAnchor", js.Any.fromFunction2(value))
    
    inline def setCreateAnchorUndefined: Self = StObject.set(x, "createAnchor", js.undefined)
    
    inline def setDetectedPlanes(value: XRPlaneSet): Self = StObject.set(x, "detectedPlanes", value.asInstanceOf[js.Any])
    
    inline def setDetectedPlanesUndefined: Self = StObject.set(x, "detectedPlanes", js.undefined)
    
    inline def setFeaturePointCloud(value: js.Array[Double]): Self = StObject.set(x, "featurePointCloud", value.asInstanceOf[js.Any])
    
    inline def setFeaturePointCloudUndefined: Self = StObject.set(x, "featurePointCloud", js.undefined)
    
    inline def setFeaturePointCloudVarargs(value: Double*): Self = StObject.set(x, "featurePointCloud", js.Array(value*))
    
    inline def setFillJointRadii(
      value: (/* jointSpaces */ js.Array[XRJointSpace], /* radii */ js.typedarray.Float32Array) => Boolean
    ): Self = StObject.set(x, "fillJointRadii", js.Any.fromFunction2(value))
    
    inline def setFillJointRadiiUndefined: Self = StObject.set(x, "fillJointRadii", js.undefined)
    
    inline def setFillPoses(
      value: (/* spaces */ js.Array[XRSpace], /* baseSpace */ XRSpace, /* transforms */ js.typedarray.Float32Array) => Boolean
    ): Self = StObject.set(x, "fillPoses", js.Any.fromFunction3(value))
    
    inline def setFillPosesUndefined: Self = StObject.set(x, "fillPoses", js.undefined)
    
    inline def setGetHitTestResults(value: XRHitTestSource => js.Array[XRHitTestResult]): Self = StObject.set(x, "getHitTestResults", js.Any.fromFunction1(value))
    
    inline def setGetHitTestResultsForTransientInput(value: XRTransientInputHitTestSource => js.Array[XRTransientInputHitTestResult]): Self = StObject.set(x, "getHitTestResultsForTransientInput", js.Any.fromFunction1(value))
    
    inline def setGetImageTrackingResults(value: () => js.Array[XRImageTrackingResult]): Self = StObject.set(x, "getImageTrackingResults", js.Any.fromFunction0(value))
    
    inline def setGetImageTrackingResultsUndefined: Self = StObject.set(x, "getImageTrackingResults", js.undefined)
    
    inline def setGetJointPose(value: (/* joint */ XRJointSpace, /* baseSpace */ XRSpace) => XRJointPose): Self = StObject.set(x, "getJointPose", js.Any.fromFunction2(value))
    
    inline def setGetJointPoseUndefined: Self = StObject.set(x, "getJointPose", js.undefined)
    
    inline def setGetLightEstimate(value: XRLightProbe => XRLightEstimate): Self = StObject.set(x, "getLightEstimate", js.Any.fromFunction1(value))
    
    inline def setGetPose(value: (XRSpace, XRSpace) => js.UndefOr[XRPose]): Self = StObject.set(x, "getPose", js.Any.fromFunction2(value))
    
    inline def setGetViewerPose(value: XRReferenceSpace => js.UndefOr[XRViewerPose]): Self = StObject.set(x, "getViewerPose", js.Any.fromFunction1(value))
    
    inline def setPredictedDisplayTime(value: DOMHighResTimeStamp): Self = StObject.set(x, "predictedDisplayTime", value.asInstanceOf[js.Any])
    
    inline def setPredictedDisplayTimeUndefined: Self = StObject.set(x, "predictedDisplayTime", js.undefined)
    
    inline def setSession(value: XRSession): Self = StObject.set(x, "session", value.asInstanceOf[js.Any])
    
    inline def setTrackedAnchors(value: XRAnchorSet): Self = StObject.set(x, "trackedAnchors", value.asInstanceOf[js.Any])
    
    inline def setTrackedAnchorsUndefined: Self = StObject.set(x, "trackedAnchors", js.undefined)
    
    inline def setWorldInformation(value: XRWorldInformation): Self = StObject.set(x, "worldInformation", value.asInstanceOf[js.Any])
    
    inline def setWorldInformationUndefined: Self = StObject.set(x, "worldInformation", js.undefined)
  }
}
