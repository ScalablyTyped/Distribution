package typings.bumblebeeHotword.mod

import typings.std.AnalyserNode
import typings.std.HTMLCanvasElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("bumblebee-hotword", "SpectrumAnalyser")
@js.native
class SpectrumAnalyser protected () extends js.Object {
  def this(analyser: AnalyserNode, canvas: HTMLCanvasElement) = this()
  
  def draw(): Unit = js.native
  
  def setBackgroundColor(bgColor: String): Unit = js.native
  
  def setColors(linecolor: String, bgcolor: String): Unit = js.native
  
  def setLineColor(linecolor: String): Unit = js.native
  
  def setMuted(muted: Boolean): Unit = js.native
  
  def start(): Unit = js.native
  
  def stop(): Unit = js.native
}
