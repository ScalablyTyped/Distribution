package typings.chrome.anon

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

@js.native
trait TypeoffontSettings extends StObject {
  
  def clearDefaultFixedFontSize(details: js.Object): Unit = js.native
  def clearDefaultFixedFontSize(details: js.Object, callback: js.Function): Unit = js.native
  @JSName("clearDefaultFixedFontSize")
  def clearDefaultFixedFontSize_Promise(details: js.Object): js.Promise[Unit] = js.native
  
  def clearDefaultFontSize(): Unit = js.native
  def clearDefaultFontSize(details: js.Object): Unit = js.native
  def clearDefaultFontSize(details: js.Object, callback: js.Function): Unit = js.native
  def clearDefaultFontSize(details: Unit, callback: js.Function): Unit = js.native
  @JSName("clearDefaultFontSize")
  def clearDefaultFontSize_Promise(): js.Promise[Unit] = js.native
  @JSName("clearDefaultFontSize")
  def clearDefaultFontSize_Promise(details: js.Object): js.Promise[Unit] = js.native
  
  def clearFont(details: FontDetails): Unit = js.native
  def clearFont(details: FontDetails, callback: js.Function): Unit = js.native
  @JSName("clearFont")
  def clearFont_Promise(details: FontDetails): js.Promise[Unit] = js.native
  
  def clearMinimumFontSize(): Unit = js.native
  def clearMinimumFontSize(details: js.Object): Unit = js.native
  def clearMinimumFontSize(details: js.Object, callback: js.Function): Unit = js.native
  def clearMinimumFontSize(details: Unit, callback: js.Function): Unit = js.native
  @JSName("clearMinimumFontSize")
  def clearMinimumFontSize_Promise(): js.Promise[Unit] = js.native
  @JSName("clearMinimumFontSize")
  def clearMinimumFontSize_Promise(details: js.Object): js.Promise[Unit] = js.native
  
  def getDefaultFixedFontSize(): Unit = js.native
  def getDefaultFixedFontSize(details: js.Object): Unit = js.native
  def getDefaultFixedFontSize(details: js.Object, callback: js.Function1[/* details */ FontSizeDetails, Unit]): Unit = js.native
  def getDefaultFixedFontSize(details: Unit, callback: js.Function1[/* details */ FontSizeDetails, Unit]): Unit = js.native
  @JSName("getDefaultFixedFontSize")
  def getDefaultFixedFontSize_Promise(): js.Promise[FontSizeDetails] = js.native
  @JSName("getDefaultFixedFontSize")
  def getDefaultFixedFontSize_Promise(details: js.Object): js.Promise[FontSizeDetails] = js.native
  
  def getDefaultFontSize(): Unit = js.native
  def getDefaultFontSize(details: js.Object): Unit = js.native
  def getDefaultFontSize(details: js.Object, callback: js.Function1[/* options */ FontSizeDetails, Unit]): Unit = js.native
  def getDefaultFontSize(details: Unit, callback: js.Function1[/* options */ FontSizeDetails, Unit]): Unit = js.native
  @JSName("getDefaultFontSize")
  def getDefaultFontSize_Promise(): js.Promise[FontSizeDetails] = js.native
  @JSName("getDefaultFontSize")
  def getDefaultFontSize_Promise(details: js.Object): js.Promise[FontSizeDetails] = js.native
  
  def getFont(details: FontDetails): Unit = js.native
  def getFont(details: FontDetails, callback: js.Function1[/* details */ FontDetailsResult, Unit]): Unit = js.native
  
  def getFontList(): Unit = js.native
  def getFontList(callback: js.Function1[/* results */ js.Array[FontName], Unit]): Unit = js.native
  @JSName("getFontList")
  def getFontList_Promise(): js.Promise[js.Array[FontName]] = js.native
  
  @JSName("getFont")
  def getFont_Promise(details: FontDetails): js.Promise[FontDetailsResult] = js.native
  
  def getMinimumFontSize(): Unit = js.native
  def getMinimumFontSize(details: js.Object): Unit = js.native
  def getMinimumFontSize(details: js.Object, callback: js.Function1[/* options */ FontSizeDetails, Unit]): Unit = js.native
  def getMinimumFontSize(details: Unit, callback: js.Function1[/* options */ FontSizeDetails, Unit]): Unit = js.native
  @JSName("getMinimumFontSize")
  def getMinimumFontSize_Promise(): js.Promise[FontSizeDetails] = js.native
  @JSName("getMinimumFontSize")
  def getMinimumFontSize_Promise(details: js.Object): js.Promise[FontSizeDetails] = js.native
  
  var onDefaultFixedFontSizeChanged: DefaultFixedFontSizeChangedEvent = js.native
  
  var onDefaultFontSizeChanged: DefaultFontSizeChangedEvent = js.native
  
  var onFontChanged: FontChangedEvent = js.native
  
  var onMinimumFontSizeChanged: MinimumFontSizeChangedEvent = js.native
  
  def setDefaultFixedFontSize(details: SetFontSizeDetails): Unit = js.native
  def setDefaultFixedFontSize(details: SetFontSizeDetails, callback: js.Function): Unit = js.native
  @JSName("setDefaultFixedFontSize")
  def setDefaultFixedFontSize_Promise(details: SetFontSizeDetails): js.Promise[Unit] = js.native
  
  def setDefaultFontSize(details: DefaultFontSizeDetails): Unit = js.native
  def setDefaultFontSize(details: DefaultFontSizeDetails, callback: js.Function): Unit = js.native
  @JSName("setDefaultFontSize")
  def setDefaultFontSize_Promise(details: DefaultFontSizeDetails): js.Promise[Unit] = js.native
  
  def setFont(details: SetFontDetails): Unit = js.native
  def setFont(details: SetFontDetails, callback: js.Function): Unit = js.native
  @JSName("setFont")
  def setFont_Promise(details: SetFontDetails): js.Promise[Unit] = js.native
  
  def setMinimumFontSize(details: SetFontSizeDetails): Unit = js.native
  def setMinimumFontSize(details: SetFontSizeDetails, callback: js.Function): Unit = js.native
  @JSName("setMinimumFontSize")
  def setMinimumFontSize_Promise(details: SetFontSizeDetails): js.Promise[Unit] = js.native
}
