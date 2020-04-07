package typings.babylonjs

import typings.babylonjs.babylonjsStrings.Horizontal
import typings.babylonjs.babylonjsStrings.Vertical
import typings.std.DOMPointReadOnly
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait XRPlane extends XRAnchorCreator {
  var lastChangedTime: Double = js.native
  var orientation: Horizontal | Vertical = js.native
  var planeSpace: XRSpace = js.native
  var polygon: js.Array[DOMPointReadOnly] = js.native
}

