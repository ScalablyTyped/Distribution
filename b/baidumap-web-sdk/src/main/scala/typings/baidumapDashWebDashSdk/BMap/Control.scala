package typings.baidumapDashWebDashSdk.BMap

import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("BMap.Control")
@js.native
class Control () extends js.Object {
  var defaultAnchor: ControlAnchor = js.native
  var defaultOffset: Size = js.native
  def getAnchor(): ControlAnchor = js.native
  def getOffset(): Size = js.native
  def hide(): Unit = js.native
  def initialize(map: Map): HTMLElement = js.native
  def isVisible(): Boolean = js.native
  def setAnchor(anchor: ControlAnchor): Unit = js.native
  def setOffset(offset: Size): Unit = js.native
  def show(): Unit = js.native
}

