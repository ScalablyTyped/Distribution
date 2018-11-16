package typings
package baidumapDashWebDashSdkLib.BMapNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("BMap.CopyrightControl")
@js.native
class CopyrightControl () extends Control {
  def this(opts: CopyrightControlOptions) = this()
  def addCopyright(copyright: Copyright): scala.Unit = js.native
  def getCopyright(id: scala.Double): Copyright = js.native
  def getCopyrightCollection(): js.Array[Copyright] = js.native
  def removeCopyright(id: scala.Double): scala.Unit = js.native
}

