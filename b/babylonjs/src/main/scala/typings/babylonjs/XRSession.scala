package typings.babylonjs

import typings.babylonjs.anon.PlaneDetectionState
import typings.std.AddEventListenerOptions
import typings.std.EventListenerOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait XRSession extends StObject {
  
  def addEventListener(`type`: XREventType, listener: XREventHandler): Unit = js.native
  def addEventListener(`type`: XREventType, listener: XREventHandler, options: Boolean): Unit = js.native
  def addEventListener(`type`: XREventType, listener: XREventHandler, options: AddEventListenerOptions): Unit = js.native
  
  /**
    * Removes a callback from the animation frame painting callback from
    * XRSession's set of animation frame rendering callbacks, given the
    * identifying handle returned by a previous call to requestAnimationFrame().
    */
  def cancelAnimationFrame(handle: Double): Unit = js.native
  
  /**
    * Provided when the optional 'dom-overlay' feature is requested.
    */
  val domOverlayState: js.UndefOr[XRDOMOverlayState] = js.native
  
  /**
    * Ends the WebXR session. Returns a promise which resolves when the
    * session has been shut down.
    */
  def end(): js.Promise[Unit] = js.native
  
  val frameRate: js.UndefOr[Double] = js.native
  
  // image tracking
  var getTrackedImageScores: js.UndefOr[js.Function0[js.Promise[js.Array[XRImageTrackingScore]]]] = js.native
  
  /**
    * Returns a list of this session's XRInputSources, each representing an input device
    * used to control the camera and/or scene.
    */
  val inputSources: js.Array[XRInputSource] = js.native
  
  def onend(callback: Any): Unit = js.native
  @JSName("onend")
  var onend_Original: XREventHandler = js.native
  
  def oneyetrackingend(callback: Any): Unit = js.native
  @JSName("oneyetrackingend")
  var oneyetrackingend_Original: XREventHandler = js.native
  
  def oneyetrackingstart(callback: Any): Unit = js.native
  @JSName("oneyetrackingstart")
  var oneyetrackingstart_Original: XREventHandler = js.native
  
  def oninputsourceschange(callback: Any): Unit = js.native
  @JSName("oninputsourceschange")
  var oninputsourceschange_Original: XREventHandler = js.native
  
  def onselect(callback: Any): Unit = js.native
  @JSName("onselect")
  var onselect_Original: XREventHandler = js.native
  
  def onselectend(callback: Any): Unit = js.native
  @JSName("onselectend")
  var onselectend_Original: XREventHandler = js.native
  
  def onselectstart(callback: Any): Unit = js.native
  @JSName("onselectstart")
  var onselectstart_Original: XREventHandler = js.native
  
  def onsqueeze(callback: Any): Unit = js.native
  @JSName("onsqueeze")
  var onsqueeze_Original: XREventHandler = js.native
  
  def onsqueezeend(callback: Any): Unit = js.native
  @JSName("onsqueezeend")
  var onsqueezeend_Original: XREventHandler = js.native
  
  def onsqueezestart(callback: Any): Unit = js.native
  @JSName("onsqueezestart")
  var onsqueezestart_Original: XREventHandler = js.native
  
  def onvisibilitychange(callback: Any): Unit = js.native
  @JSName("onvisibilitychange")
  var onvisibilitychange_Original: XREventHandler = js.native
  
  /**
    * Indicates the XRReflectionFormat most closely supported by the underlying XR device
    */
  val preferredReflectionFormat: js.UndefOr[XRReflectionFormat] = js.native
  
  def removeEventListener(`type`: XREventType, listener: XREventHandler): Unit = js.native
  def removeEventListener(`type`: XREventType, listener: XREventHandler, options: Boolean): Unit = js.native
  def removeEventListener(`type`: XREventType, listener: XREventHandler, options: EventListenerOptions): Unit = js.native
  
  /**
    * object which contains options affecting how the imagery is rendered.
    * This includes things such as the near and far clipping planes
    */
  val renderState: XRRenderState = js.native
  
  /**
    * Schedules the specified method to be called the next time the user agent
    * is working on rendering an animation frame for the WebXR device. Returns an
    * integer value which can be used to identify the request for the purposes of
    * canceling the callback using cancelAnimationFrame(). This method is comparable
    * to the Window.requestAnimationFrame() method.
    */
  def requestAnimationFrame(callback: XRFrameRequestCallback): Double = js.native
  
  // legacy AR hit test
  var requestHitTest: js.UndefOr[
    js.Function2[
      /* ray */ XRRay, 
      /* referenceSpace */ XRReferenceSpace, 
      js.Promise[js.Array[XRHitResult]]
    ]
  ] = js.native
  
  // hit test
  var requestHitTestSource: js.UndefOr[js.Function1[/* options */ XRHitTestOptionsInit, js.Promise[XRHitTestSource]]] = js.native
  
  var requestHitTestSourceForTransientInput: js.UndefOr[
    js.Function1[
      /* options */ XRTransientInputHitTestOptionsInit, 
      js.Promise[XRTransientInputHitTestSource]
    ]
  ] = js.native
  
  /**
    * The XRSession interface is extended with the ability to create new XRLightProbe instances.
    * XRLightProbe instances have a session object, which is the XRSession that created this XRLightProbe.
    *
    * Can reject with with a "NotSupportedError" DOMException
    */
  def requestLightProbe(): js.Promise[XRLightProbe] = js.native
  def requestLightProbe(options: XRLightProbeInit): js.Promise[XRLightProbe] = js.native
  
  def requestReferenceSpace(`type`: XRBoundedReferenceSpaceType): js.Promise[XRBoundedReferenceSpace] = js.native
  /**
    * Requests that a new XRReferenceSpace of the specified type be created.
    * Returns a promise which resolves with the XRReferenceSpace or
    * XRBoundedReferenceSpace which was requested, or throws a NotSupportedError if
    * the requested space type isn't supported by the device.
    */
  def requestReferenceSpace(`type`: XRReferenceSpaceType): js.Promise[XRReferenceSpace] = js.native
  
  val supportedFrameRates: js.UndefOr[js.typedarray.Float32Array] = js.native
  
  def trySetFeaturePointCloudEnabled(enabled: Boolean): Boolean = js.native
  
  def trySetMeshDetectorEnabled(enabled: Boolean): Boolean = js.native
  
  def trySetPreferredMeshDetectorOptions(preferredOptions: XRGeometryDetectorOptions): Boolean = js.native
  
  def trySetPreferredPlaneDetectorOptions(preferredOptions: XRGeometryDetectorOptions): Boolean = js.native
  
  def updateRenderState(state: XRRenderStateInit): Unit = js.native
  
  def updateTargetFrameRate(rate: Double): js.Promise[Unit] = js.native
  
  // legacy plane detection
  var updateWorldTrackingState: js.UndefOr[js.Function1[/* options */ PlaneDetectionState, Unit]] = js.native
  
  val visibilityState: XRVisibilityState = js.native
}
