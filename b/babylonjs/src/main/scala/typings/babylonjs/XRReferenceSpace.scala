package typings.babylonjs

import typings.std.EventTarget
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait XRReferenceSpace extends EventTarget {
  var onreset: js.Any = js.native
  def getOffsetReferenceSpace(originOffset: XRRigidTransform): XRReferenceSpace = js.native
}

