package typings.chromeApps

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/////////////////
// AppView Tag //
/////////////////
/**
  * Use the appview tag to embed other Chrome Apps within your Chrome App.
  * The appview runs in a separate process from your app,
  * it doesn't inherit the same permissions and is only allowed
  * to interact with your app through asynchronous APIs.
  * Not all apps can be embedded; apps have to explicitly allow themselves to be embedded.
  * @since Chrome 43.
  * @requires Permissions: 'appview'
  * @see[Documentation]{@link https://developer.chrome.com/apps/tags/appview}
  */
@js.native
trait HTMLAppViewElement extends HTMLElement {
  
  /**
    * Requests another app to be embedded.
    * @param app The extension id of the app to be embedded.
    * @param [data] Optional developer specified data that the app to be embedded can use when making an embedding decision.
    * @param [callback] Optional callback when the embedding request is completed. Will provide the result.
    */
  def connect(app: String): Unit = js.native
  def connect(app: String, data: js.UndefOr[scala.Nothing], callback: js.Function1[/* success */ Boolean, Unit]): Unit = js.native
  def connect(app: String, data: js.Any): Unit = js.native
  def connect(app: String, data: js.Any, callback: js.Function1[/* success */ Boolean, Unit]): Unit = js.native
}
