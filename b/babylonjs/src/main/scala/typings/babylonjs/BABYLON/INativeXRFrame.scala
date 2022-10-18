package typings.babylonjs.BABYLON

import typings.babylonjs.XRAnchor
import typings.babylonjs.XRFrame
import typings.babylonjs.XRHitTestResult
import typings.babylonjs.XRHitTestSource
import typings.babylonjs.XRImageTrackingResult
import typings.babylonjs.XRJointPose
import typings.babylonjs.XRJointSpace
import typings.babylonjs.XRLightEstimate
import typings.babylonjs.XRLightProbe
import typings.babylonjs.XRPose
import typings.babylonjs.XRReferenceSpace
import typings.babylonjs.XRRigidTransform
import typings.babylonjs.XRSession
import typings.babylonjs.XRSpace
import typings.babylonjs.XRTransientInputHitTestResult
import typings.babylonjs.XRTransientInputHitTestSource
import typings.babylonjs.XRViewerPose
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** @internal */
trait INativeXRFrame
  extends StObject
     with XRFrame {
  
  var _imageTrackingResults: js.UndefOr[js.Array[XRImageTrackingResult]] = js.undefined
  
  def getPoseData(
    space: XRSpace,
    baseSpace: XRReferenceSpace,
    vectorBuffer: js.typedarray.ArrayBuffer,
    matrixBuffer: js.typedarray.ArrayBuffer
  ): XRPose
}
object INativeXRFrame {
  
  inline def apply(
    createAnchor: (js.UndefOr[
      js.Function2[/* pose */ XRRigidTransform, /* space */ XRSpace, js.UndefOr[js.Promise[XRAnchor]]]
    ]) & (js.UndefOr[
      js.Function2[/* pose */ XRRigidTransform, /* space */ XRSpace, js.Promise[XRAnchor]]
    ]),
    getHitTestResults: XRHitTestSource => js.Array[XRHitTestResult],
    getHitTestResultsForTransientInput: XRTransientInputHitTestSource => js.Array[XRTransientInputHitTestResult],
    getJointPose: (js.UndefOr[
      js.Function2[/* joint */ XRJointSpace, /* baseSpace */ XRSpace, js.UndefOr[XRJointPose]]
    ]) & (js.UndefOr[js.Function2[/* joint */ XRJointSpace, /* baseSpace */ XRSpace, XRJointPose]]),
    getLightEstimate: XRLightProbe => XRLightEstimate,
    getPose: (XRSpace, XRSpace) => js.UndefOr[XRPose],
    getPoseData: (XRSpace, XRReferenceSpace, js.typedarray.ArrayBuffer, js.typedarray.ArrayBuffer) => XRPose,
    getViewerPose: XRReferenceSpace => js.UndefOr[XRViewerPose],
    session: XRSession
  ): INativeXRFrame = {
    val __obj = js.Dynamic.literal(createAnchor = createAnchor.asInstanceOf[js.Any], getHitTestResults = js.Any.fromFunction1(getHitTestResults), getHitTestResultsForTransientInput = js.Any.fromFunction1(getHitTestResultsForTransientInput), getJointPose = getJointPose.asInstanceOf[js.Any], getLightEstimate = js.Any.fromFunction1(getLightEstimate), getPose = js.Any.fromFunction2(getPose), getPoseData = js.Any.fromFunction4(getPoseData), getViewerPose = js.Any.fromFunction1(getViewerPose), session = session.asInstanceOf[js.Any])
    __obj.asInstanceOf[INativeXRFrame]
  }
  
  extension [Self <: INativeXRFrame](x: Self) {
    
    inline def setGetPoseData(value: (XRSpace, XRReferenceSpace, js.typedarray.ArrayBuffer, js.typedarray.ArrayBuffer) => XRPose): Self = StObject.set(x, "getPoseData", js.Any.fromFunction4(value))
    
    inline def set_imageTrackingResults(value: js.Array[XRImageTrackingResult]): Self = StObject.set(x, "_imageTrackingResults", value.asInstanceOf[js.Any])
    
    inline def set_imageTrackingResultsUndefined: Self = StObject.set(x, "_imageTrackingResults", js.undefined)
    
    inline def set_imageTrackingResultsVarargs(value: XRImageTrackingResult*): Self = StObject.set(x, "_imageTrackingResults", js.Array(value*))
  }
}
