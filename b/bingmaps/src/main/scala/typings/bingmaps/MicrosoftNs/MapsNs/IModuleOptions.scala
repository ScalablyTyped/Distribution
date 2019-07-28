package typings.bingmaps.MicrosoftNs.MapsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IModuleOptions extends js.Object {
  /** 
    * @deprecated
    * A callback function that is fired after the module has loaded.
    * It is recommended that the Bing Maps key be set as a URL parameter of the Bing Maps script reference.
    */
  var callback: js.UndefOr[js.Function0[Unit]] = js.undefined
  /** A Bing Maps key that is used with the module when the module is loaded without a map. */
  var credentials: js.UndefOr[String] = js.undefined
  /** A function that is called if there is an error loading the module. */
  var errorCallback: js.UndefOr[js.Function0[Unit]] = js.undefined
}

object IModuleOptions {
  @scala.inline
  def apply(callback: () => Unit = null, credentials: String = null, errorCallback: () => Unit = null): IModuleOptions = {
    val __obj = js.Dynamic.literal()
    if (callback != null) __obj.updateDynamic("callback")(js.Any.fromFunction0(callback))
    if (credentials != null) __obj.updateDynamic("credentials")(credentials)
    if (errorCallback != null) __obj.updateDynamic("errorCallback")(js.Any.fromFunction0(errorCallback))
    __obj.asInstanceOf[IModuleOptions]
  }
}

