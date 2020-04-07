package typings.babylonjs

import typings.std.DOMPointInit
import typings.std.DOMPointReadOnly
import typings.std.Float32Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("XRRigidTransform")
@js.native
class XRRigidTransform protected () extends js.Object {
  def this(matrix: DOMPointInit) = this()
  def this(matrix: Float32Array) = this()
  def this(matrix: DOMPointInit, direction: DOMPointInit) = this()
  def this(matrix: Float32Array, direction: DOMPointInit) = this()
  var inverse: XRRigidTransform = js.native
  var matrix: Float32Array = js.native
  var orientation: DOMPointReadOnly = js.native
  var position: DOMPointReadOnly = js.native
}

