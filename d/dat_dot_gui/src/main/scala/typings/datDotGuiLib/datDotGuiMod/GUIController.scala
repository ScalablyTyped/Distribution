package typings
package datDotGuiLib.datDotGuiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("dat.gui", "GUIController")
@js.native
class GUIController () extends js.Object {
  def destroy(): scala.Unit = js.native
  // FunctionController
  def fire(): GUIController = js.native
  def getValue(): js.Any = js.native
  def isModified(): scala.Boolean = js.native
  def listen(): GUIController = js.native
  def max(n: scala.Double): GUIController = js.native
  // NumberController
  def min(n: scala.Double): GUIController = js.native
  def name(s: java.lang.String): GUIController = js.native
  // Controller
  def onChange(): GUIController = js.native
  // Controller
  def onChange(value: js.Any): GUIController = js.native
  def onFinishChange(): GUIController = js.native
  def onFinishChange(value: js.Any): GUIController = js.native
  // augmentController in dat/gui/GUI.js
  def options(option: js.Any): GUIController = js.native
  def remove(): GUIController = js.native
  def setValue(value: js.Any): GUIController = js.native
  def step(n: scala.Double): GUIController = js.native
  def updateDisplay(): GUIController = js.native
}

