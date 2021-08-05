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
  
  inline def clearDefaultFixedFontSize(details: js.Object): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("clearDefaultFixedFontSize")(details.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def clearDefaultFixedFontSize(details: js.Object, callback: js.Function): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("clearDefaultFixedFontSize")(details.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def clearDefaultFontSize(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("clearDefaultFontSize")().asInstanceOf[Unit]
  inline def clearDefaultFontSize(details: js.Object): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("clearDefaultFontSize")(details.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def clearDefaultFontSize(details: js.Object, callback: js.Function): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("clearDefaultFontSize")(details.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def clearDefaultFontSize(details: Unit, callback: js.Function): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("clearDefaultFontSize")(details.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def clearFont(details: FontDetails): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("clearFont")(details.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def clearFont(details: FontDetails, callback: js.Function): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("clearFont")(details.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def clearMinimumFontSize(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("clearMinimumFontSize")().asInstanceOf[Unit]
  inline def clearMinimumFontSize(details: js.Object): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("clearMinimumFontSize")(details.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def clearMinimumFontSize(details: js.Object, callback: js.Function): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("clearMinimumFontSize")(details.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def clearMinimumFontSize(details: Unit, callback: js.Function): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("clearMinimumFontSize")(details.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def getDefaultFixedFontSize(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("getDefaultFixedFontSize")().asInstanceOf[Unit]
  inline def getDefaultFixedFontSize(details: js.Object): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("getDefaultFixedFontSize")(details.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def getDefaultFixedFontSize(details: js.Object, callback: js.Function1[/* details */ FontSizeDetails, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("getDefaultFixedFontSize")(details.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def getDefaultFixedFontSize(details: Unit, callback: js.Function1[/* details */ FontSizeDetails, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("getDefaultFixedFontSize")(details.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def getDefaultFontSize(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("getDefaultFontSize")().asInstanceOf[Unit]
  inline def getDefaultFontSize(details: js.Object): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("getDefaultFontSize")(details.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def getDefaultFontSize(details: js.Object, callback: js.Function1[/* options */ FontSizeDetails, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("getDefaultFontSize")(details.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def getDefaultFontSize(details: Unit, callback: js.Function1[/* options */ FontSizeDetails, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("getDefaultFontSize")(details.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def getFont(details: FontDetails): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("getFont")(details.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def getFont(details: FontDetails, callback: js.Function1[/* details */ FontDetailsResult, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("getFont")(details.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def getFontList(callback: js.Function1[/* results */ js.Array[FontName], Unit]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("getFontList")(callback.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def getMinimumFontSize(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("getMinimumFontSize")().asInstanceOf[Unit]
  inline def getMinimumFontSize(details: Unit, callback: js.Function1[/* options */ FontSizeDetails, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("getMinimumFontSize")(details.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def getMinimumFontSize(details: FontSizeDetails): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("getMinimumFontSize")(details.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def getMinimumFontSize(details: FontSizeDetails, callback: js.Function1[/* options */ FontSizeDetails, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("getMinimumFontSize")(details.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @JSGlobal("chrome.fontSettings.onDefaultFixedFontSizeChanged")
  @js.native
  def onDefaultFixedFontSizeChanged: DefaultFixedFontSizeChangedEvent = js.native
  inline def onDefaultFixedFontSizeChanged_=(x: DefaultFixedFontSizeChangedEvent): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onDefaultFixedFontSizeChanged")(x.asInstanceOf[js.Any])
  
  @JSGlobal("chrome.fontSettings.onDefaultFontSizeChanged")
  @js.native
  def onDefaultFontSizeChanged: DefaultFontSizeChangedEvent = js.native
  inline def onDefaultFontSizeChanged_=(x: DefaultFontSizeChangedEvent): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onDefaultFontSizeChanged")(x.asInstanceOf[js.Any])
  
  @JSGlobal("chrome.fontSettings.onFontChanged")
  @js.native
  def onFontChanged: FontChangedEvent = js.native
  inline def onFontChanged_=(x: FontChangedEvent): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onFontChanged")(x.asInstanceOf[js.Any])
  
  @JSGlobal("chrome.fontSettings.onMinimumFontSizeChanged")
  @js.native
  def onMinimumFontSizeChanged: MinimumFontSizeChangedEvent = js.native
  inline def onMinimumFontSizeChanged_=(x: MinimumFontSizeChangedEvent): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onMinimumFontSizeChanged")(x.asInstanceOf[js.Any])
  
  inline def setDefaultFixedFontSize(details: SetFontSizeDetails): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setDefaultFixedFontSize")(details.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def setDefaultFixedFontSize(details: SetFontSizeDetails, callback: js.Function): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setDefaultFixedFontSize")(details.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def setDefaultFontSize(details: DefaultFontSizeDetails): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setDefaultFontSize")(details.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def setDefaultFontSize(details: DefaultFontSizeDetails, callback: js.Function): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setDefaultFontSize")(details.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def setFont(details: SetFontDetails): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setFont")(details.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def setFont(details: SetFontDetails, callback: js.Function): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setFont")(details.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def setMinimumFontSize(details: SetFontSizeDetails): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setMinimumFontSize")(details.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def setMinimumFontSize(details: SetFontSizeDetails, callback: js.Function): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setMinimumFontSize")(details.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
