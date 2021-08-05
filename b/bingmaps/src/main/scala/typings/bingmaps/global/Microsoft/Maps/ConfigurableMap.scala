package typings.bingmaps.global.Microsoft.Maps

import typings.bingmaps.Microsoft.Maps.IDictionary
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Microsoft.Maps.ConfigurableMap")
@js.native
class ConfigurableMap ()
  extends StObject
     with typings.bingmaps.Microsoft.Maps.ConfigurableMap
/* static members */
object ConfigurableMap {
  
  @JSGlobal("Microsoft.Maps.ConfigurableMap")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * A static function that loads a map using a JSON configuraiton file.
    * @param element The parent element of the map as a CSS selector string or HTMLElement.
    * @param configFileUrl The Url to download the JSON configuration file from. This should JSON file should contain a IConfigurableMapOptions object.
    * @param withCredentials Creates the config file request with the setwithcredentials property.
    * @param requestHeaders Set of headers that need to be added to config file request.
    * @param callback Callback that is triggered when the map loads successfully.
    * @param errorCallback Callback that is triggered when an error occurs when loading the map.
    */
  inline def createFromConfig(element: String, configFileUrl: String, withCredentials: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("createFromConfig")(element.asInstanceOf[js.Any], configFileUrl.asInstanceOf[js.Any], withCredentials.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def createFromConfig(
    element: String,
    configFileUrl: String,
    withCredentials: Boolean,
    requestHeaders: Unit,
    callback: js.Function1[/* map */ typings.bingmaps.Microsoft.Maps.Map, Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("createFromConfig")(element.asInstanceOf[js.Any], configFileUrl.asInstanceOf[js.Any], withCredentials.asInstanceOf[js.Any], requestHeaders.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def createFromConfig(
    element: String,
    configFileUrl: String,
    withCredentials: Boolean,
    requestHeaders: Unit,
    callback: js.Function1[/* map */ typings.bingmaps.Microsoft.Maps.Map, Unit],
    errorCallback: js.Function1[/* errorMsg */ String, Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("createFromConfig")(element.asInstanceOf[js.Any], configFileUrl.asInstanceOf[js.Any], withCredentials.asInstanceOf[js.Any], requestHeaders.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], errorCallback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def createFromConfig(
    element: String,
    configFileUrl: String,
    withCredentials: Boolean,
    requestHeaders: Unit,
    callback: Unit,
    errorCallback: js.Function1[/* errorMsg */ String, Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("createFromConfig")(element.asInstanceOf[js.Any], configFileUrl.asInstanceOf[js.Any], withCredentials.asInstanceOf[js.Any], requestHeaders.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], errorCallback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def createFromConfig(
    element: String,
    configFileUrl: String,
    withCredentials: Boolean,
    requestHeaders: IDictionary[String]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("createFromConfig")(element.asInstanceOf[js.Any], configFileUrl.asInstanceOf[js.Any], withCredentials.asInstanceOf[js.Any], requestHeaders.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def createFromConfig(
    element: String,
    configFileUrl: String,
    withCredentials: Boolean,
    requestHeaders: IDictionary[String],
    callback: js.Function1[/* map */ typings.bingmaps.Microsoft.Maps.Map, Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("createFromConfig")(element.asInstanceOf[js.Any], configFileUrl.asInstanceOf[js.Any], withCredentials.asInstanceOf[js.Any], requestHeaders.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def createFromConfig(
    element: String,
    configFileUrl: String,
    withCredentials: Boolean,
    requestHeaders: IDictionary[String],
    callback: js.Function1[/* map */ typings.bingmaps.Microsoft.Maps.Map, Unit],
    errorCallback: js.Function1[/* errorMsg */ String, Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("createFromConfig")(element.asInstanceOf[js.Any], configFileUrl.asInstanceOf[js.Any], withCredentials.asInstanceOf[js.Any], requestHeaders.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], errorCallback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def createFromConfig(
    element: String,
    configFileUrl: String,
    withCredentials: Boolean,
    requestHeaders: IDictionary[String],
    callback: Unit,
    errorCallback: js.Function1[/* errorMsg */ String, Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("createFromConfig")(element.asInstanceOf[js.Any], configFileUrl.asInstanceOf[js.Any], withCredentials.asInstanceOf[js.Any], requestHeaders.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], errorCallback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def createFromConfig(element: HTMLElement, configFileUrl: String, withCredentials: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("createFromConfig")(element.asInstanceOf[js.Any], configFileUrl.asInstanceOf[js.Any], withCredentials.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def createFromConfig(
    element: HTMLElement,
    configFileUrl: String,
    withCredentials: Boolean,
    requestHeaders: Unit,
    callback: js.Function1[/* map */ typings.bingmaps.Microsoft.Maps.Map, Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("createFromConfig")(element.asInstanceOf[js.Any], configFileUrl.asInstanceOf[js.Any], withCredentials.asInstanceOf[js.Any], requestHeaders.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def createFromConfig(
    element: HTMLElement,
    configFileUrl: String,
    withCredentials: Boolean,
    requestHeaders: Unit,
    callback: js.Function1[/* map */ typings.bingmaps.Microsoft.Maps.Map, Unit],
    errorCallback: js.Function1[/* errorMsg */ String, Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("createFromConfig")(element.asInstanceOf[js.Any], configFileUrl.asInstanceOf[js.Any], withCredentials.asInstanceOf[js.Any], requestHeaders.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], errorCallback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def createFromConfig(
    element: HTMLElement,
    configFileUrl: String,
    withCredentials: Boolean,
    requestHeaders: Unit,
    callback: Unit,
    errorCallback: js.Function1[/* errorMsg */ String, Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("createFromConfig")(element.asInstanceOf[js.Any], configFileUrl.asInstanceOf[js.Any], withCredentials.asInstanceOf[js.Any], requestHeaders.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], errorCallback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def createFromConfig(
    element: HTMLElement,
    configFileUrl: String,
    withCredentials: Boolean,
    requestHeaders: IDictionary[String]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("createFromConfig")(element.asInstanceOf[js.Any], configFileUrl.asInstanceOf[js.Any], withCredentials.asInstanceOf[js.Any], requestHeaders.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def createFromConfig(
    element: HTMLElement,
    configFileUrl: String,
    withCredentials: Boolean,
    requestHeaders: IDictionary[String],
    callback: js.Function1[/* map */ typings.bingmaps.Microsoft.Maps.Map, Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("createFromConfig")(element.asInstanceOf[js.Any], configFileUrl.asInstanceOf[js.Any], withCredentials.asInstanceOf[js.Any], requestHeaders.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def createFromConfig(
    element: HTMLElement,
    configFileUrl: String,
    withCredentials: Boolean,
    requestHeaders: IDictionary[String],
    callback: js.Function1[/* map */ typings.bingmaps.Microsoft.Maps.Map, Unit],
    errorCallback: js.Function1[/* errorMsg */ String, Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("createFromConfig")(element.asInstanceOf[js.Any], configFileUrl.asInstanceOf[js.Any], withCredentials.asInstanceOf[js.Any], requestHeaders.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], errorCallback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def createFromConfig(
    element: HTMLElement,
    configFileUrl: String,
    withCredentials: Boolean,
    requestHeaders: IDictionary[String],
    callback: Unit,
    errorCallback: js.Function1[/* errorMsg */ String, Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("createFromConfig")(element.asInstanceOf[js.Any], configFileUrl.asInstanceOf[js.Any], withCredentials.asInstanceOf[js.Any], requestHeaders.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], errorCallback.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
