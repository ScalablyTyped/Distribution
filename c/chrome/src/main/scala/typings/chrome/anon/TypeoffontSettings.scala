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
  
  def clearDefaultFixedFontSize(details: js.Object): js.Promise[Unit] = js.native
  def clearDefaultFixedFontSize(details: js.Object, callback: js.Function): Unit = js.native
  
  def clearDefaultFontSize(): js.Promise[Unit] = js.native
  def clearDefaultFontSize(callback: js.Function): Unit = js.native
  def clearDefaultFontSize(details: js.Object): js.Promise[Unit] = js.native
  def clearDefaultFontSize(details: js.Object, callback: js.Function): Unit = js.native
  
  def clearFont(details: FontDetails): js.Promise[Unit] = js.native
  def clearFont(details: FontDetails, callback: js.Function): Unit = js.native
  
  def clearMinimumFontSize(): js.Promise[Unit] = js.native
  def clearMinimumFontSize(callback: js.Function): Unit = js.native
  def clearMinimumFontSize(details: js.Object): js.Promise[Unit] = js.native
  def clearMinimumFontSize(details: js.Object, callback: js.Function): Unit = js.native
  
  def getDefaultFixedFontSize(): js.Promise[FontSizeDetails] = js.native
  def getDefaultFixedFontSize(callback: js.Function1[/* details */ FontSizeDetails, Unit]): Unit = js.native
  def getDefaultFixedFontSize(details: js.Object): js.Promise[FontSizeDetails] = js.native
  def getDefaultFixedFontSize(details: js.Object, callback: js.Function1[/* details */ FontSizeDetails, Unit]): Unit = js.native
  
  def getDefaultFontSize(): js.Promise[FontSizeDetails] = js.native
  def getDefaultFontSize(callback: js.Function1[/* options */ FontSizeDetails, Unit]): Unit = js.native
  def getDefaultFontSize(details: js.Object): js.Promise[FontSizeDetails] = js.native
  def getDefaultFontSize(details: js.Object, callback: js.Function1[/* options */ FontSizeDetails, Unit]): Unit = js.native
  
  def getFont(details: FontDetails): js.Promise[FontDetailsResult] = js.native
  def getFont(details: FontDetails, callback: js.Function1[/* details */ FontDetailsResult, Unit]): Unit = js.native
  
  def getFontList(): js.Promise[js.Array[FontName]] = js.native
  def getFontList(callback: js.Function1[/* results */ js.Array[FontName], Unit]): Unit = js.native
  
  def getMinimumFontSize(): js.Promise[FontSizeDetails] = js.native
  def getMinimumFontSize(callback: js.Function1[/* options */ FontSizeDetails, Unit]): Unit = js.native
  def getMinimumFontSize(details: js.Object): js.Promise[FontSizeDetails] = js.native
  def getMinimumFontSize(details: js.Object, callback: js.Function1[/* options */ FontSizeDetails, Unit]): Unit = js.native
  
  var onDefaultFixedFontSizeChanged: DefaultFixedFontSizeChangedEvent = js.native
  
  var onDefaultFontSizeChanged: DefaultFontSizeChangedEvent = js.native
  
  var onFontChanged: FontChangedEvent = js.native
  
  var onMinimumFontSizeChanged: MinimumFontSizeChangedEvent = js.native
  
  def setDefaultFixedFontSize(details: SetFontSizeDetails): js.Promise[Unit] = js.native
  def setDefaultFixedFontSize(details: SetFontSizeDetails, callback: js.Function): Unit = js.native
  
  def setDefaultFontSize(details: DefaultFontSizeDetails): js.Promise[Unit] = js.native
  def setDefaultFontSize(details: DefaultFontSizeDetails, callback: js.Function): Unit = js.native
  
  def setFont(details: SetFontDetails): js.Promise[Unit] = js.native
  def setFont(details: SetFontDetails, callback: js.Function): Unit = js.native
  
  def setMinimumFontSize(details: SetFontSizeDetails): js.Promise[Unit] = js.native
  def setMinimumFontSize(details: SetFontSizeDetails, callback: js.Function): Unit = js.native
}
