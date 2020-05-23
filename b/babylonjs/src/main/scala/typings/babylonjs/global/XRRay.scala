package typings.babylonjs.global

import typings.std.DOMPointInit
import typings.std.DOMPointReadOnly
import typings.std.Float32Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// Experimental(er) features
@JSGlobal("XRRay")
@js.native
class XRRay protected ()
  extends typings.babylonjs.XRRay {
  def this(transformOrOrigin: typings.babylonjs.XRRigidTransform) = this()
  def this(transformOrOrigin: DOMPointInit) = this()
  def this(transformOrOrigin: typings.babylonjs.XRRigidTransform, direction: DOMPointInit) = this()
  def this(transformOrOrigin: DOMPointInit, direction: DOMPointInit) = this()
  /* CompleteClass */
  override var direction: DOMPointReadOnly = js.native
  /* CompleteClass */
  override var matrix: Float32Array = js.native
  /* CompleteClass */
  override var origin: DOMPointReadOnly = js.native
}

