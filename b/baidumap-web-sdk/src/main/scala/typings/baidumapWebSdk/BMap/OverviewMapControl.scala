package typings.baidumapWebSdk.BMap

import typings.baidumapWebSdk.AnonIsOpen
import typings.baidumapWebSdk.AnonTarget
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("BMap.OverviewMapControl")
@js.native
class OverviewMapControl protected () extends Control {
  def this(opts: OverviewMapControlOptions) = this()
  def changeView(): Unit = js.native
  def getSize(): Size = js.native
  def onviewchanged(event: AnonIsOpen): Unit = js.native
  def onviewchanging(event: AnonTarget): Unit = js.native
  def setSize(size: Size): Unit = js.native
}

