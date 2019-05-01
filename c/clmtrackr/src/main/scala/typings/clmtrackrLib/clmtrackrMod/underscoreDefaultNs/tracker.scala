package typings
package clmtrackrLib.clmtrackrMod.underscoreDefaultNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait tracker extends js.Object {
  def draw(canvas: stdLib.HTMLCanvasElement): scala.Unit = js.native
  def getConvergence(): scala.Double = js.native
  def getCurrentParameters(): js.Array[scala.Double] = js.native
  def getCurrentPosition(): js.Array[clmtrackrLib.clmtrackrMod.IPosition] | clmtrackrLib.clmtrackrLibNumbers.`false` = js.native
  def getScore(): scala.Double = js.native
  def init(): scala.Unit = js.native
  def init(model: clmtrackrLib.Model): scala.Unit = js.native
  def reset(): scala.Unit = js.native
  def setResponseMode(
    `type`: clmtrackrLib.clmtrackrLibStrings.blend,
    list: js.Array[
      clmtrackrLib.clmtrackrLibStrings.raw | clmtrackrLib.clmtrackrLibStrings.sobel | clmtrackrLib.clmtrackrLibStrings.lbp
    ]
  ): scala.Unit = js.native
  def setResponseMode(
    `type`: clmtrackrLib.clmtrackrLibStrings.cycle,
    list: js.Array[
      clmtrackrLib.clmtrackrLibStrings.raw | clmtrackrLib.clmtrackrLibStrings.sobel | clmtrackrLib.clmtrackrLibStrings.lbp
    ]
  ): scala.Unit = js.native
  def setResponseMode(
    `type`: clmtrackrLib.clmtrackrLibStrings.single,
    list: js.Array[
      clmtrackrLib.clmtrackrLibStrings.raw | clmtrackrLib.clmtrackrLibStrings.sobel | clmtrackrLib.clmtrackrLibStrings.lbp
    ]
  ): scala.Unit = js.native
  def start(element: stdLib.HTMLCanvasElement): scala.Unit = js.native
  def start(element: stdLib.HTMLVideoElement): scala.Unit = js.native
  def track(element: stdLib.HTMLCanvasElement): js.Array[clmtrackrLib.clmtrackrMod.IPosition] | clmtrackrLib.clmtrackrLibNumbers.`false` = js.native
  def track(element: stdLib.HTMLVideoElement): js.Array[clmtrackrLib.clmtrackrMod.IPosition] | clmtrackrLib.clmtrackrLibNumbers.`false` = js.native
}

