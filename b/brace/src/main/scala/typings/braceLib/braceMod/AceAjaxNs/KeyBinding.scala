package typings
package braceLib.braceMod.AceAjaxNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait KeyBinding extends js.Object {
  def addKeyboardHandler(kb: js.Any, pos: js.Any): scala.Unit
  def getKeyboardHandler(): js.Any
  def onCommandKey(e: js.Any, hashId: js.Any, keyCode: js.Any): scala.Unit
  def onTextInput(text: js.Any): scala.Unit
  def removeKeyboardHandler(kb: js.Any): scala.Boolean
  def setDefaultHandler(kb: js.Any): scala.Unit
  def setKeyboardHandler(kb: js.Any): scala.Unit
}

