package typings.babylonjs.global

import typings.std.DOMPointInit
import typings.std.DOMPointReadOnly
import typings.std.Float32Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("XRRigidTransform")
@js.native
class XRRigidTransform protected ()
  extends typings.babylonjs.XRRigidTransform {
  def this(matrix: DOMPointInit) = this()
  def this(matrix: Float32Array) = this()
  def this(matrix: DOMPointInit, direction: DOMPointInit) = this()
  def this(matrix: Float32Array, direction: DOMPointInit) = this()
  /* CompleteClass */
  override var inverse: typings.babylonjs.XRRigidTransform = js.native
  /* CompleteClass */
  override var matrix: Float32Array = js.native
  /* CompleteClass */
  override var orientation: DOMPointReadOnly = js.native
  /* CompleteClass */
  override var position: DOMPointReadOnly = js.native
}

