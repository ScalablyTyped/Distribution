package typings.babylonjs

import typings.std.DOMPointInit
import typings.std.DOMPointReadOnly
import typings.std.Float32Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// Experimental(er) features
@JSGlobal("XRRay")
@js.native
class XRRay protected () extends js.Object {
  def this(transformOrOrigin: XRRigidTransform) = this()
  def this(transformOrOrigin: DOMPointInit) = this()
  def this(transformOrOrigin: XRRigidTransform, direction: DOMPointInit) = this()
  def this(transformOrOrigin: DOMPointInit, direction: DOMPointInit) = this()
  var direction: DOMPointReadOnly = js.native
  var matrix: Float32Array = js.native
  var origin: DOMPointReadOnly = js.native
}

