package typings
package datDotGuiLib.datDotGuiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("dat.gui", "GUI")
@js.native
class GUI () extends js.Object {
  def this(option: GUIParams) = this()
  var __controllers: js.Array[GUIController] = js.native
  var __folders: js.Array[GUI] = js.native
  val autoPlace: scala.Boolean = js.native
  var closed: scala.Boolean = js.native
  var domElement: stdLib.HTMLElement = js.native
  val load: js.Object = js.native
  var name: java.lang.String = js.native
  // gui properties in dat/gui/GUI.js
  val parent: GUI = js.native
  var preset: java.lang.String = js.native
  val scrollable: scala.Boolean = js.native
  var useLocalStorage: scala.Boolean = js.native
  var width: scala.Double = js.native
  def add(target: js.Object, propName: java.lang.String): GUIController = js.native
  def add(target: js.Object, propName: java.lang.String, items: js.Array[java.lang.String | scala.Double]): GUIController = js.native
  def add(target: js.Object, propName: java.lang.String, items: js.Object): GUIController = js.native
  def add(target: js.Object, propName: java.lang.String, min: scala.Double): GUIController = js.native
  def add(target: js.Object, propName: java.lang.String, min: scala.Double, max: scala.Double): GUIController = js.native
  def add(
    target: js.Object,
    propName: java.lang.String,
    min: scala.Double,
    max: scala.Double,
    step: scala.Double
  ): GUIController = js.native
  def add(target: js.Object, propName: java.lang.String, status: scala.Boolean): GUIController = js.native
  def addColor(target: js.Object, propName: java.lang.String): GUIController = js.native
  def addFolder(propName: java.lang.String): GUI = js.native
  def close(): scala.Unit = js.native
  def destroy(): scala.Unit = js.native
  def getRoot(): GUI = js.native
  def getSaveObject(): js.Object = js.native
  def listen(controller: GUIController): scala.Unit = js.native
  def open(): scala.Unit = js.native
  def remember(target: js.Object, additionalTargets: js.Object*): scala.Unit = js.native
  def remove(controller: GUIController): scala.Unit = js.native
  def removeFolder(subFolder: GUI): scala.Unit = js.native
  def revert(gui: GUI): scala.Unit = js.native
  def save(): scala.Unit = js.native
  def saveAs(presetName: java.lang.String): scala.Unit = js.native
  def updateDisplay(): scala.Unit = js.native
}

