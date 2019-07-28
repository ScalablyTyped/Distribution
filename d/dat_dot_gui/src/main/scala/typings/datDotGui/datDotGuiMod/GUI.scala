package typings.datDotGui.datDotGuiMod

import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("dat.gui", "GUI")
@js.native
class GUI () extends js.Object {
  def this(option: GUIParams) = this()
  var __controllers: js.Array[GUIController] = js.native
  var __folders: js.Array[GUI] = js.native
  val autoPlace: Boolean = js.native
  var closed: Boolean = js.native
  var domElement: HTMLElement = js.native
  val load: js.Object = js.native
  var name: String = js.native
  // gui properties in dat/gui/GUI.js
  val parent: GUI = js.native
  var preset: String = js.native
  val scrollable: Boolean = js.native
  var useLocalStorage: Boolean = js.native
  var width: Double = js.native
  def add(target: js.Object, propName: String): GUIController = js.native
  def add(target: js.Object, propName: String, items: js.Array[Double | String]): GUIController = js.native
  def add(target: js.Object, propName: String, items: js.Object): GUIController = js.native
  def add(target: js.Object, propName: String, min: Double): GUIController = js.native
  def add(target: js.Object, propName: String, min: Double, max: Double): GUIController = js.native
  def add(target: js.Object, propName: String, min: Double, max: Double, step: Double): GUIController = js.native
  def add(target: js.Object, propName: String, status: Boolean): GUIController = js.native
  def addColor(target: js.Object, propName: String): GUIController = js.native
  def addFolder(propName: String): GUI = js.native
  def close(): Unit = js.native
  def destroy(): Unit = js.native
  def getRoot(): GUI = js.native
  def getSaveObject(): js.Object = js.native
  def hide(): Unit = js.native
  def listen(controller: GUIController): Unit = js.native
  def open(): Unit = js.native
  def remember(target: js.Object, additionalTargets: js.Object*): Unit = js.native
  def remove(controller: GUIController): Unit = js.native
  def removeFolder(subFolder: GUI): Unit = js.native
  def revert(gui: GUI): Unit = js.native
  def save(): Unit = js.native
  def saveAs(presetName: String): Unit = js.native
  def show(): Unit = js.native
  def updateDisplay(): Unit = js.native
}

