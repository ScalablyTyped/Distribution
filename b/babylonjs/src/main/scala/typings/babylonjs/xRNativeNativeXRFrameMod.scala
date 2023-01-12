package typings.babylonjs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object xRNativeNativeXRFrameMod {
  
  @JSImport("babylonjs/XR/native/nativeXRFrame", "NativeXRFrame")
  @js.native
  open class NativeXRFrame protected ()
    extends StObject
       with XRFrame {
    def this(_nativeImpl: INativeXRFrame) = this()
    
    /* private */ var _nativeImpl: Any = js.native
    
    /* private */ val _xrPose: Any = js.native
    
    /* private */ val _xrPoseVectorData: Any = js.native
    
    /* private */ val _xrTransform: Any = js.native
    
    @JSName("detectedPlanes")
    def detectedPlanes_MNativeXRFrame: js.UndefOr[XRPlaneSet] = js.native
    
    @JSName("featurePointCloud")
    def featurePointCloud_MNativeXRFrame: js.UndefOr[js.Array[Double]] = js.native
    
    val getHitTestResults: Any = js.native
    /* CompleteClass */
    override def getHitTestResults(hitTestSource: XRHitTestSource): js.Array[XRHitTestResult] = js.native
    
    def getHitTestResultsForTransientInput(): scala.Nothing = js.native
    /* CompleteClass */
    override def getHitTestResultsForTransientInput(hitTestSource: XRTransientInputHitTestSource): js.Array[XRTransientInputHitTestResult] = js.native
    
    @JSName("getImageTrackingResults")
    def getImageTrackingResults_MNativeXRFrame(): js.Array[XRImageTrackingResult] = js.native
    
    def getLightEstimate(): scala.Nothing = js.native
    /* CompleteClass */
    override def getLightEstimate(xrLightProbe: XRLightProbe): XRLightEstimate = js.native
    
    def getPose(space: XRSpace, baseSpace: XRReferenceSpace): js.UndefOr[XRPose] = js.native
    /**
      * Provides the pose of space relative to baseSpace as an XRPose, at the time represented by
      * the XRFrame.
      *
      * @param space
      * @param baseSpace
      */
    /* CompleteClass */
    override def getPose(space: XRSpace, baseSpace: XRSpace): js.UndefOr[XRPose] = js.native
    
    val getViewerPose: Any = js.native
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
    @JSName("session")
    def session_MNativeXRFrame: XRSession = js.native
    
    @JSName("trackedAnchors")
    def trackedAnchors_MNativeXRFrame: js.UndefOr[XRAnchorSet] = js.native
    
    @JSName("worldInformation")
    def worldInformation_MNativeXRFrame: js.UndefOr[XRWorldInformation] = js.native
  }
  
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
      getHitTestResults: XRHitTestSource => js.Array[XRHitTestResult],
      getHitTestResultsForTransientInput: XRTransientInputHitTestSource => js.Array[XRTransientInputHitTestResult],
      getLightEstimate: XRLightProbe => XRLightEstimate,
      getPose: (XRSpace, XRSpace) => js.UndefOr[XRPose],
      getPoseData: (XRSpace, XRReferenceSpace, js.typedarray.ArrayBuffer, js.typedarray.ArrayBuffer) => XRPose,
      getViewerPose: XRReferenceSpace => js.UndefOr[XRViewerPose],
      session: XRSession
    ): INativeXRFrame = {
      val __obj = js.Dynamic.literal(getHitTestResults = js.Any.fromFunction1(getHitTestResults), getHitTestResultsForTransientInput = js.Any.fromFunction1(getHitTestResultsForTransientInput), getLightEstimate = js.Any.fromFunction1(getLightEstimate), getPose = js.Any.fromFunction2(getPose), getPoseData = js.Any.fromFunction4(getPoseData), getViewerPose = js.Any.fromFunction1(getViewerPose), session = session.asInstanceOf[js.Any])
      __obj.asInstanceOf[INativeXRFrame]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: INativeXRFrame] (val x: Self) extends AnyVal {
      
      inline def setGetPoseData(value: (XRSpace, XRReferenceSpace, js.typedarray.ArrayBuffer, js.typedarray.ArrayBuffer) => XRPose): Self = StObject.set(x, "getPoseData", js.Any.fromFunction4(value))
      
      inline def set_imageTrackingResults(value: js.Array[XRImageTrackingResult]): Self = StObject.set(x, "_imageTrackingResults", value.asInstanceOf[js.Any])
      
      inline def set_imageTrackingResultsUndefined: Self = StObject.set(x, "_imageTrackingResults", js.undefined)
      
      inline def set_imageTrackingResultsVarargs(value: XRImageTrackingResult*): Self = StObject.set(x, "_imageTrackingResults", js.Array(value*))
    }
  }
}
