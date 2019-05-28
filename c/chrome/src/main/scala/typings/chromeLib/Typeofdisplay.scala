package typings
package chromeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Typeofdisplay extends js.Object {
  val DisplayPosition: Anon_BOTTOM = js.native
  val MirrorMode: Anon_MIXED = js.native
  val onDisplayChanged: chromeLib.chromeNs.eventsNs.Event[js.Function0[scala.Unit]] = js.native
  def clearTouchCalibration(id: java.lang.String): scala.Unit = js.native
  def completeCustomTouchCalibration(
    pairs: chromeLib.chromeNs.systemNs.displayNs.TouchCalibrationPairs,
    bounds: chromeLib.chromeNs.systemNs.displayNs.Bounds
  ): scala.Unit = js.native
  def enableUnifiedDesktop(enabled: scala.Boolean): scala.Unit = js.native
  def getDisplayLayout(
    callback: js.Function1[
      /* layouts */ js.Array[chromeLib.chromeNs.systemNs.displayNs.DisplayLayout], 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def getInfo(
    callback: js.Function1[/* info */ js.Array[chromeLib.chromeNs.systemNs.displayNs.DisplayInfo], scala.Unit]
  ): scala.Unit = js.native
  def getInfo(
    flags: chromeLib.chromeNs.systemNs.displayNs.DisplayInfoFlags,
    callback: js.Function1[/* info */ js.Array[chromeLib.chromeNs.systemNs.displayNs.DisplayInfo], scala.Unit]
  ): scala.Unit = js.native
  def overscanCalibrationAdjust(id: java.lang.String, delta: chromeLib.chromeNs.systemNs.displayNs.Insets): scala.Unit = js.native
  def overscanCalibrationComplete(id: java.lang.String): scala.Unit = js.native
  def overscanCalibrationReset(id: java.lang.String): scala.Unit = js.native
  def overscanCalibrationStart(id: java.lang.String): scala.Unit = js.native
  def setDisplayLayout(layouts: js.Array[chromeLib.chromeNs.systemNs.displayNs.DisplayLayout]): scala.Unit = js.native
  def setDisplayLayout(
    layouts: js.Array[chromeLib.chromeNs.systemNs.displayNs.DisplayLayout],
    callback: js.Function0[scala.Unit]
  ): scala.Unit = js.native
  def setDisplayProperties(id: java.lang.String, info: chromeLib.chromeNs.systemNs.displayNs.DisplayPropertiesInfo): scala.Unit = js.native
  def setDisplayProperties(
    id: java.lang.String,
    info: chromeLib.chromeNs.systemNs.displayNs.DisplayPropertiesInfo,
    callback: js.Function0[scala.Unit]
  ): scala.Unit = js.native
  def setMirrorMode(
    info: chromeLib.chromeNs.systemNs.displayNs.MirrorModeInfoMixed,
    callback: js.Function0[scala.Unit]
  ): scala.Unit = js.native
  def setMirrorMode(info: chromeLib.chromeNs.systemNs.displayNs.MirrorModeInfo, callback: js.Function0[scala.Unit]): scala.Unit = js.native
  def showNativeTouchCalibration(id: java.lang.String, callback: js.Function1[/* success */ scala.Boolean, scala.Unit]): scala.Unit = js.native
  def startCustomTouchCalibration(id: java.lang.String): scala.Unit = js.native
}

