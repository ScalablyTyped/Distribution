package typings.babylonjs

import typings.babylonjs.anon.PlaneDetectionState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait XRSession extends XRAnchorCreator {
  var addEventListener: js.Function = js.native
  var inputSources: js.Array[XRInputSource] = js.native
  var removeEventListener: js.Function = js.native
  var renderState: XRRenderState = js.native
  var requestAnimationFrame: js.Function = js.native
  def end(): js.Promise[Unit] = js.native
  // AR hit test
  def requestHitTest(ray: XRRay, referenceSpace: XRReferenceSpace): js.Promise[js.Array[XRHitResult]] = js.native
  def requestReferenceSpace(`type`: XRReferenceSpaceType): js.Promise[XRReferenceSpace] = js.native
  def updateRenderState(XRRenderStateInit: XRRenderState): js.Promise[Unit] = js.native
  def updateWorldTrackingState(options: PlaneDetectionState): Unit = js.native
}

