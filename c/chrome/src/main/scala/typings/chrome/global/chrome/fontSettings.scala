package typings.chrome.global.chrome

import typings.chrome.chrome.fontSettings.DefaultFixedFontSizeChangedEvent
import typings.chrome.chrome.fontSettings.DefaultFontSizeChangedEvent
import typings.chrome.chrome.fontSettings.DefaultFontSizeDetails
import typings.chrome.chrome.fontSettings.FontChangedEvent
import typings.chrome.chrome.fontSettings.FontDetails
import typings.chrome.chrome.fontSettings.FontDetailsResult
import typings.chrome.chrome.fontSettings.FontName
import typings.chrome.chrome.fontSettings.FontSizeDetails
import typings.chrome.chrome.fontSettings.MinimumFontSizeChangedEvent
import typings.chrome.chrome.fontSettings.SetFontDetails
import typings.chrome.chrome.fontSettings.SetFontSizeDetails
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

////////////////////
// Font Settings
////////////////////
/**
  * Use the chrome.fontSettings API to manage Chrome's font settings.
  * Availability: Since Chrome 22.
  * Permissions:  "fontSettings"
  */
object fontSettings {
  
  @JSGlobal("chrome.fontSettings")
  @js.native
  val ^ : js.Any = js.native
  
  @JSGlobal("chrome.fontSettings.clearDefaultFixedFontSize")
  @js.native
  def clearDefaultFixedFontSize(details: js.Object): Unit = js.native
  @JSGlobal("chrome.fontSettings.clearDefaultFixedFontSize")
  @js.native
  def clearDefaultFixedFontSize(details: js.Object, callback: js.Function): Unit = js.native
  
  @JSGlobal("chrome.fontSettings.clearDefaultFontSize")
  @js.native
  def clearDefaultFontSize(): Unit = js.native
  @JSGlobal("chrome.fontSettings.clearDefaultFontSize")
  @js.native
  def clearDefaultFontSize(details: js.UndefOr[scala.Nothing], callback: js.Function): Unit = js.native
  @JSGlobal("chrome.fontSettings.clearDefaultFontSize")
  @js.native
  def clearDefaultFontSize(details: js.Object): Unit = js.native
  @JSGlobal("chrome.fontSettings.clearDefaultFontSize")
  @js.native
  def clearDefaultFontSize(details: js.Object, callback: js.Function): Unit = js.native
  
  @JSGlobal("chrome.fontSettings.clearFont")
  @js.native
  def clearFont(details: FontDetails): Unit = js.native
  @JSGlobal("chrome.fontSettings.clearFont")
  @js.native
  def clearFont(details: FontDetails, callback: js.Function): Unit = js.native
  
  @JSGlobal("chrome.fontSettings.clearMinimumFontSize")
  @js.native
  def clearMinimumFontSize(): Unit = js.native
  @JSGlobal("chrome.fontSettings.clearMinimumFontSize")
  @js.native
  def clearMinimumFontSize(details: js.UndefOr[scala.Nothing], callback: js.Function): Unit = js.native
  @JSGlobal("chrome.fontSettings.clearMinimumFontSize")
  @js.native
  def clearMinimumFontSize(details: js.Object): Unit = js.native
  @JSGlobal("chrome.fontSettings.clearMinimumFontSize")
  @js.native
  def clearMinimumFontSize(details: js.Object, callback: js.Function): Unit = js.native
  
  @JSGlobal("chrome.fontSettings.getDefaultFixedFontSize")
  @js.native
  def getDefaultFixedFontSize(): Unit = js.native
  @JSGlobal("chrome.fontSettings.getDefaultFixedFontSize")
  @js.native
  def getDefaultFixedFontSize(details: js.UndefOr[scala.Nothing], callback: js.Function1[/* details */ FontSizeDetails, Unit]): Unit = js.native
  @JSGlobal("chrome.fontSettings.getDefaultFixedFontSize")
  @js.native
  def getDefaultFixedFontSize(details: js.Object): Unit = js.native
  @JSGlobal("chrome.fontSettings.getDefaultFixedFontSize")
  @js.native
  def getDefaultFixedFontSize(details: js.Object, callback: js.Function1[/* details */ FontSizeDetails, Unit]): Unit = js.native
  
  @JSGlobal("chrome.fontSettings.getDefaultFontSize")
  @js.native
  def getDefaultFontSize(): Unit = js.native
  @JSGlobal("chrome.fontSettings.getDefaultFontSize")
  @js.native
  def getDefaultFontSize(details: js.UndefOr[scala.Nothing], callback: js.Function1[/* options */ FontSizeDetails, Unit]): Unit = js.native
  @JSGlobal("chrome.fontSettings.getDefaultFontSize")
  @js.native
  def getDefaultFontSize(details: js.Object): Unit = js.native
  @JSGlobal("chrome.fontSettings.getDefaultFontSize")
  @js.native
  def getDefaultFontSize(details: js.Object, callback: js.Function1[/* options */ FontSizeDetails, Unit]): Unit = js.native
  
  @JSGlobal("chrome.fontSettings.getFont")
  @js.native
  def getFont(details: FontDetails): Unit = js.native
  @JSGlobal("chrome.fontSettings.getFont")
  @js.native
  def getFont(details: FontDetails, callback: js.Function1[/* details */ FontDetailsResult, Unit]): Unit = js.native
  
  @JSGlobal("chrome.fontSettings.getFontList")
  @js.native
  def getFontList(callback: js.Function1[/* results */ js.Array[FontName], Unit]): Unit = js.native
  
  @JSGlobal("chrome.fontSettings.getMinimumFontSize")
  @js.native
  def getMinimumFontSize(): Unit = js.native
  @JSGlobal("chrome.fontSettings.getMinimumFontSize")
  @js.native
  def getMinimumFontSize(details: js.UndefOr[scala.Nothing], callback: js.Function1[/* options */ FontSizeDetails, Unit]): Unit = js.native
  @JSGlobal("chrome.fontSettings.getMinimumFontSize")
  @js.native
  def getMinimumFontSize(details: FontSizeDetails): Unit = js.native
  @JSGlobal("chrome.fontSettings.getMinimumFontSize")
  @js.native
  def getMinimumFontSize(details: FontSizeDetails, callback: js.Function1[/* options */ FontSizeDetails, Unit]): Unit = js.native
  
  @JSGlobal("chrome.fontSettings.onDefaultFixedFontSizeChanged")
  @js.native
  def onDefaultFixedFontSizeChanged: DefaultFixedFontSizeChangedEvent = js.native
  @scala.inline
  def onDefaultFixedFontSizeChanged_=(x: DefaultFixedFontSizeChangedEvent): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onDefaultFixedFontSizeChanged")(x.asInstanceOf[js.Any])
  
  @JSGlobal("chrome.fontSettings.onDefaultFontSizeChanged")
  @js.native
  def onDefaultFontSizeChanged: DefaultFontSizeChangedEvent = js.native
  @scala.inline
  def onDefaultFontSizeChanged_=(x: DefaultFontSizeChangedEvent): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onDefaultFontSizeChanged")(x.asInstanceOf[js.Any])
  
  @JSGlobal("chrome.fontSettings.onFontChanged")
  @js.native
  def onFontChanged: FontChangedEvent = js.native
  @scala.inline
  def onFontChanged_=(x: FontChangedEvent): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onFontChanged")(x.asInstanceOf[js.Any])
  
  @JSGlobal("chrome.fontSettings.onMinimumFontSizeChanged")
  @js.native
  def onMinimumFontSizeChanged: MinimumFontSizeChangedEvent = js.native
  @scala.inline
  def onMinimumFontSizeChanged_=(x: MinimumFontSizeChangedEvent): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onMinimumFontSizeChanged")(x.asInstanceOf[js.Any])
  
  @JSGlobal("chrome.fontSettings.setDefaultFixedFontSize")
  @js.native
  def setDefaultFixedFontSize(details: SetFontSizeDetails): Unit = js.native
  @JSGlobal("chrome.fontSettings.setDefaultFixedFontSize")
  @js.native
  def setDefaultFixedFontSize(details: SetFontSizeDetails, callback: js.Function): Unit = js.native
  
  @JSGlobal("chrome.fontSettings.setDefaultFontSize")
  @js.native
  def setDefaultFontSize(details: DefaultFontSizeDetails): Unit = js.native
  @JSGlobal("chrome.fontSettings.setDefaultFontSize")
  @js.native
  def setDefaultFontSize(details: DefaultFontSizeDetails, callback: js.Function): Unit = js.native
  
  @JSGlobal("chrome.fontSettings.setFont")
  @js.native
  def setFont(details: SetFontDetails): Unit = js.native
  @JSGlobal("chrome.fontSettings.setFont")
  @js.native
  def setFont(details: SetFontDetails, callback: js.Function): Unit = js.native
  
  @JSGlobal("chrome.fontSettings.setMinimumFontSize")
  @js.native
  def setMinimumFontSize(details: SetFontSizeDetails): Unit = js.native
  @JSGlobal("chrome.fontSettings.setMinimumFontSize")
  @js.native
  def setMinimumFontSize(details: SetFontSizeDetails, callback: js.Function): Unit = js.native
}
