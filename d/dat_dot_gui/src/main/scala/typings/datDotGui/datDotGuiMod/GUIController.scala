package typings.datDotGui.datDotGuiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("dat.gui", "GUIController")
@js.native
class GUIController () extends js.Object {
  def destroy(): Unit = js.native
  // FunctionController
  def fire(): GUIController = js.native
  def getValue(): js.Any = js.native
  def isModified(): Boolean = js.native
  def listen(): GUIController = js.native
  def max(n: Double): GUIController = js.native
  // NumberController
  def min(n: Double): GUIController = js.native
  def name(s: String): GUIController = js.native
  // Controller
  def onChange(): GUIController = js.native
  def onChange(value: js.Any): GUIController = js.native
  def onFinishChange(): GUIController = js.native
  def onFinishChange(value: js.Any): GUIController = js.native
  // augmentController in dat/gui/GUI.js
  def options(option: js.Any): GUIController = js.native
  def remove(): GUIController = js.native
  def setValue(value: js.Any): GUIController = js.native
  def step(n: Double): GUIController = js.native
  def updateDisplay(): GUIController = js.native
}

