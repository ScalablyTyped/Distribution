package typings
package chromeLib.chromeNs.fontSettingsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("chrome.fontSettings")
@js.native
object ^ extends js.Object {
  var onDefaultFixedFontSizeChanged: DefaultFixedFontSizeChangedEvent = js.native
  var onDefaultFontSizeChanged: DefaultFontSizeChangedEvent = js.native
  var onFontChanged: FontChangedEvent = js.native
  var onMinimumFontSizeChanged: MinimumFontSizeChangedEvent = js.native
  def clearDefaultFixedFontSize(details: js.Object): scala.Unit = js.native
  def clearDefaultFixedFontSize(details: js.Object, callback: js.Function): scala.Unit = js.native
  def clearDefaultFontSize(): scala.Unit = js.native
  def clearDefaultFontSize(details: js.Object): scala.Unit = js.native
  def clearDefaultFontSize(details: js.Object, callback: js.Function): scala.Unit = js.native
  def clearFont(details: FontDetails): scala.Unit = js.native
  def clearFont(details: FontDetails, callback: js.Function): scala.Unit = js.native
  def clearMinimumFontSize(): scala.Unit = js.native
  def clearMinimumFontSize(details: js.Object): scala.Unit = js.native
  def clearMinimumFontSize(details: js.Object, callback: js.Function): scala.Unit = js.native
  def getDefaultFixedFontSize(): scala.Unit = js.native
  def getDefaultFixedFontSize(details: js.Object): scala.Unit = js.native
  def getDefaultFixedFontSize(details: js.Object, callback: js.Function1[/* details */ FontSizeDetails, scala.Unit]): scala.Unit = js.native
  def getDefaultFontSize(): scala.Unit = js.native
  def getDefaultFontSize(details: js.Object): scala.Unit = js.native
  def getDefaultFontSize(details: js.Object, callback: js.Function1[/* options */ FontSizeDetails, scala.Unit]): scala.Unit = js.native
  def getFont(details: FontDetails): scala.Unit = js.native
  def getFont(details: FontDetails, callback: js.Function1[/* details */ FontDetailsResult, scala.Unit]): scala.Unit = js.native
  def getFontList(callback: js.Function1[/* results */ js.Array[FontName], scala.Unit]): scala.Unit = js.native
  def getMinimumFontSize(): scala.Unit = js.native
  def getMinimumFontSize(details: FontSizeDetails): scala.Unit = js.native
  def getMinimumFontSize(details: FontSizeDetails, callback: js.Function1[/* options */ FontSizeDetails, scala.Unit]): scala.Unit = js.native
  def setDefaultFixedFontSize(details: SetFontSizeDetails): scala.Unit = js.native
  def setDefaultFixedFontSize(details: SetFontSizeDetails, callback: js.Function): scala.Unit = js.native
  def setDefaultFontSize(details: DefaultFontSizeDetails): scala.Unit = js.native
  def setDefaultFontSize(details: DefaultFontSizeDetails, callback: js.Function): scala.Unit = js.native
  def setFont(details: SetFontDetails): scala.Unit = js.native
  def setFont(details: SetFontDetails, callback: js.Function): scala.Unit = js.native
  def setMinimumFontSize(details: SetFontSizeDetails): scala.Unit = js.native
  def setMinimumFontSize(details: SetFontSizeDetails, callback: js.Function): scala.Unit = js.native
}

