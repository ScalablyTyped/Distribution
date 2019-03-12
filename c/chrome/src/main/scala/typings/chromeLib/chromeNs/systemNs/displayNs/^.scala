package typings
package chromeLib.chromeNs.systemNs.displayNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("chrome.system.display")
@js.native
object ^ extends js.Object {
  val DisplayPosition: chromeLib.Anon_BOTTOM = js.native
  val MirrorMode: chromeLib.Anon_MIXED = js.native
  val onDisplayChanged: chromeLib.chromeNs.eventsNs.Event[js.Function0[scala.Unit]] = js.native
  def clearTouchCalibration(id: java.lang.String): scala.Unit = js.native
  def completeCustomTouchCalibration(pairs: TouchCalibrationPairs, bounds: Bounds): scala.Unit = js.native
  def enableUnifiedDesktop(enabled: scala.Boolean): scala.Unit = js.native
  def getDisplayLayout(callback: js.Function1[/* layouts */ js.Array[DisplayLayout], scala.Unit]): scala.Unit = js.native
  def getInfo(callback: js.Function1[/* info */ js.Array[DisplayInfo], scala.Unit]): scala.Unit = js.native
  def getInfo(flags: DisplayInfoFlags, callback: js.Function1[/* info */ js.Array[DisplayInfo], scala.Unit]): scala.Unit = js.native
  def overscanCalibrationAdjust(id: java.lang.String, delta: Insets): scala.Unit = js.native
  def overscanCalibrationComplete(id: java.lang.String): scala.Unit = js.native
  def overscanCalibrationReset(id: java.lang.String): scala.Unit = js.native
  def overscanCalibrationStart(id: java.lang.String): scala.Unit = js.native
  def setDisplayLayout(layouts: js.Array[DisplayLayout]): scala.Unit = js.native
  def setDisplayLayout(layouts: js.Array[DisplayLayout], callback: js.Function0[scala.Unit]): scala.Unit = js.native
  def setDisplayProperties(id: java.lang.String, info: DisplayPropertiesInfo): scala.Unit = js.native
  def setDisplayProperties(id: java.lang.String, info: DisplayPropertiesInfo, callback: js.Function0[scala.Unit]): scala.Unit = js.native
  def setMirrorMode(info: MirrorModeInfoMixed, callback: js.Function0[scala.Unit]): scala.Unit = js.native
  def setMirrorMode(info: MirrorModeInfo, callback: js.Function0[scala.Unit]): scala.Unit = js.native
  def showNativeTouchCalibration(id: java.lang.String, callback: js.Function1[/* success */ scala.Boolean, scala.Unit]): scala.Unit = js.native
  def startCustomTouchCalibration(id: java.lang.String): scala.Unit = js.native
}

