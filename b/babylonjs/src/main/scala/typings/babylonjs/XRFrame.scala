package typings.babylonjs

import typings.babylonjs.anon.DetectedPlanes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait XRFrame extends js.Object {
  var session: XRSession
  // Anchors
  var trackedAnchors: js.UndefOr[XRAnchorSet] = js.undefined
  // Planes
  var worldInformation: DetectedPlanes
  def getPose(space: XRSpace, baseSpace: XRSpace): js.UndefOr[XRPose]
  def getViewerPose(referenceSpace: XRReferenceSpace): js.UndefOr[XRViewerPose]
}

object XRFrame {
  @scala.inline
  def apply(
    getPose: (XRSpace, XRSpace) => js.UndefOr[XRPose],
    getViewerPose: XRReferenceSpace => js.UndefOr[XRViewerPose],
    session: XRSession,
    worldInformation: DetectedPlanes,
    trackedAnchors: XRAnchorSet = null
  ): XRFrame = {
    val __obj = js.Dynamic.literal(getPose = js.Any.fromFunction2(getPose), getViewerPose = js.Any.fromFunction1(getViewerPose), session = session.asInstanceOf[js.Any], worldInformation = worldInformation.asInstanceOf[js.Any])
    if (trackedAnchors != null) __obj.updateDynamic("trackedAnchors")(trackedAnchors.asInstanceOf[js.Any])
    __obj.asInstanceOf[XRFrame]
  }
}

