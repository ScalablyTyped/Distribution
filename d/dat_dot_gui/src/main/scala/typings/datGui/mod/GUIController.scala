package typings.datGui.mod

import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("dat.gui", "GUIController")
@js.native
class GUIController protected () extends js.Object {
  def this(`object`: js.Object, property: String) = this()
  
  var domElement: HTMLElement = js.native
  
  // FunctionController
  def fire(): GUIController = js.native
  
  def getValue(): js.Any = js.native
  
  def isModified(): Boolean = js.native
  
  def listen(): GUIController = js.native
  
  def max(n: Double): GUIController = js.native
  
  // NumberController
  def min(n: Double): GUIController = js.native
  
  def name(name: String): GUIController = js.native
  
  var `object`: js.Object = js.native
  
  def onChange(fnc: js.Function1[/* value */ js.UndefOr[js.Any], Unit]): GUIController = js.native
  
  def onFinishChange(fnc: js.Function1[/* value */ js.UndefOr[js.Any], Unit]): GUIController = js.native
  
  def options(option: js.Any): GUIController = js.native
  
  var property: String = js.native
  
  def remove(): GUIController = js.native
  
  def setValue(value: js.Any): GUIController = js.native
  
  def step(n: Double): GUIController = js.native
  
  def updateDisplay(): GUIController = js.native
}
