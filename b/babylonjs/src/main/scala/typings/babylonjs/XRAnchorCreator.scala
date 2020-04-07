package typings.babylonjs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait XRAnchorCreator extends js.Object {
  // AR Anchors
  def createAnchor(pose: XRPose, referenceSpace: XRReferenceSpace): js.Promise[XRAnchor] = js.native
  def createAnchor(pose: XRRigidTransform, referenceSpace: XRReferenceSpace): js.Promise[XRAnchor] = js.native
}

