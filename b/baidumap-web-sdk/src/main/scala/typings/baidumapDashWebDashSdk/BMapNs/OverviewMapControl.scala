package typings.baidumapDashWebDashSdk.BMapNs

import typings.baidumapDashWebDashSdk.Anon_IsOpen
import typings.baidumapDashWebDashSdk.Anon_Target
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("BMap.OverviewMapControl")
@js.native
class OverviewMapControl protected () extends Control {
  def this(opts: OverviewMapControlOptions) = this()
  def changeView(): Unit = js.native
  def getSize(): Size = js.native
  def onviewchanged(event: Anon_IsOpen): Unit = js.native
  def onviewchanging(event: Anon_Target): Unit = js.native
  def setSize(size: Size): Unit = js.native
}

