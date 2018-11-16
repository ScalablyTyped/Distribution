package typings
package cesiumLib.cesiumMod.CesiumNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait InfoBox extends js.Object {
  var container: stdLib.Element
  var frame: stdLib.HTMLIFrameElement
  var viewModel: InfoBoxViewModel
  def destroy(): scala.Unit
  def isDestroyed(): scala.Boolean
}

