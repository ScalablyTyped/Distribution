package typings.babylonjs.global.BABYLON

import typings.babylonjs.BABYLON.INativeXRFrame
import typings.babylonjs.XRAnchor
import typings.babylonjs.XRHitTestResult
import typings.babylonjs.XRHitTestSource
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

@JSGlobal("BABYLON.NativeXRFrame")
@js.native
open class NativeXRFrame protected ()
  extends StObject
     with typings.babylonjs.BABYLON.NativeXRFrame {
  def this(_nativeImpl: INativeXRFrame) = this()
  
  /* CompleteClass */
  var createAnchor: (js.UndefOr[
    js.Function2[/* pose */ XRRigidTransform, /* space */ XRSpace, js.UndefOr[js.Promise[XRAnchor]]]
  ]) & (js.UndefOr[
    js.Function2[/* pose */ XRRigidTransform, /* space */ XRSpace, js.Promise[XRAnchor]]
  ]) = js.native
  
  /* CompleteClass */
  override def getHitTestResults(hitTestSource: XRHitTestSource): js.Array[XRHitTestResult] = js.native
  
  /* CompleteClass */
  override def getHitTestResultsForTransientInput(hitTestSource: XRTransientInputHitTestSource): js.Array[XRTransientInputHitTestResult] = js.native
  
  // Hand tracking
  /* CompleteClass */
  var getJointPose: (js.UndefOr[
    js.Function2[/* joint */ XRJointSpace, /* baseSpace */ XRSpace, js.UndefOr[XRJointPose]]
  ]) & (js.UndefOr[js.Function2[/* joint */ XRJointSpace, /* baseSpace */ XRSpace, XRJointPose]]) = js.native
  
  /* CompleteClass */
  override def getLightEstimate(xrLightProbe: XRLightProbe): XRLightEstimate = js.native
  
  /**
    * Provides the pose of space relative to baseSpace as an XRPose, at the time represented by
    * the XRFrame.
    *
    * @param space
    * @param baseSpace
    */
  /* CompleteClass */
  override def getPose(space: XRSpace, baseSpace: XRSpace): js.UndefOr[XRPose] = js.native
  
  /**
    * Provides the pose of the viewer relative to referenceSpace as an XRViewerPose, at the
    * XRFrame's time.
    *
    * @param referenceSpace
    */
  /* CompleteClass */
  override def getViewerPose(referenceSpace: XRReferenceSpace): js.UndefOr[XRViewerPose] = js.native
  
  /* CompleteClass */
  override val session: XRSession = js.native
}
