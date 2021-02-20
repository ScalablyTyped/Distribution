package typings.chromeApps

import typings.std.History
import typings.std.Location
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/////////////////////////
// WEB APIs & Warnings //
/////////////////////////
/**
  * Only warnings since:
  *  1. It's not possible as of now to override or remove something from *Window* or *Document*.
  *  2. It may also cause other unforseen consequences if it's removed (and if it was possible).
  * @see[Disallowed]
  */
/**
  * Chrome app - Web APIs
  * @see[Docs]{@link https://developer.chrome.com/apps/api_other}
  */
@js.native
trait ChromeWindow extends StObject {
  
  ///
  /// Other APIs
  ///
  var AudioContext: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof AudioContext */ js.Any = js.native
  
  ///
  /// Disabled Web Features
  /// https://developer.chrome.com/apps/app_deprecated
  ///
  /**
    * ❗ alert is not available in packaged apps. ❗
    * Work-around: Use a custom lightbox / popup.
    */
  def alert(): Unit = js.native
  def alert(message: js.Any): Unit = js.native
  
  /**
    * ❗ confirm is not available in packaged apps. ❗
    * Work-around: Use a custom lightbox / popup.
    */
  def confirm(): Boolean = js.native
  def confirm(message: String): Boolean = js.native
  
  /**
    * ❗ window.history is not available in packaged apps. ❗
    * Links open up with the system web browser.
    */
  val history: History = js.native
  
  /**
    * ❗ window.localStorage is not available in packaged apps. Use chrome.storage.local instead. ❗
    */
  // localStorage: typeof localStorage;
  /**
    * ❗ window.location is not available in packaged apps. ❗
    * Links open up with the system web browser.
    */
  var location: Location = js.native
}
