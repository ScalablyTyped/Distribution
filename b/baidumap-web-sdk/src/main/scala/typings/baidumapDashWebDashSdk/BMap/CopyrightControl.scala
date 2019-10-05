package typings.baidumapDashWebDashSdk.BMap

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("BMap.CopyrightControl")
@js.native
class CopyrightControl () extends Control {
  def this(opts: CopyrightControlOptions) = this()
  def addCopyright(copyright: Copyright): Unit = js.native
  def getCopyright(id: Double): Copyright = js.native
  def getCopyrightCollection(): js.Array[Copyright] = js.native
  def removeCopyright(id: Double): Unit = js.native
}

