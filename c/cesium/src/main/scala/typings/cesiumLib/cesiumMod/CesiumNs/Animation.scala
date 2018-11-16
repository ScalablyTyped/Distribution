package typings
package cesiumLib.cesiumMod.CesiumNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait Animation extends js.Object {
  val container: stdLib.Element
  val viewModel: AnimationViewModel
  def applyThemeChanges(): scala.Unit
  def destroy(): scala.Unit
  def isDestroyed(): scala.Boolean
  def resize(): scala.Unit
}

