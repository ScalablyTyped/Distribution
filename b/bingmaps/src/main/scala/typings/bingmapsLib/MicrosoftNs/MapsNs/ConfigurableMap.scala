package typings
package bingmapsLib.MicrosoftNs.MapsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Microsoft.Maps.ConfigurableMap")
@js.native
class ConfigurableMap () extends js.Object

/* static members */
@JSGlobal("Microsoft.Maps.ConfigurableMap")
@js.native
object ConfigurableMap extends js.Object {
  /**
    * A static function that loads a map using a JSON configuraiton file.
    * @param element The parent element of the map as a CSS selector string or HTMLElement.
    * @param configFileUrl The Url to download the JSON configuration file from. This should JSON file should contain a IConfigurableMapOptions object.
    * @param withCredentials Creates the config file request with the setwithcredentials property.
    * @param requestHeaders Set of headers that need to be added to config file request.
    * @param callback Callback that is triggered when the map loads successfully.
    * @param errorCallback Callback that is triggered when an error occurs when loading the map.
    */
  def createFromConfig(element: java.lang.String, configFileUrl: java.lang.String, withCredentials: scala.Boolean): scala.Unit = js.native
  def createFromConfig(
    element: java.lang.String,
    configFileUrl: java.lang.String,
    withCredentials: scala.Boolean,
    requestHeaders: bingmapsLib.MicrosoftNs.MapsNs.IDictionary[java.lang.String]
  ): scala.Unit = js.native
  def createFromConfig(
    element: java.lang.String,
    configFileUrl: java.lang.String,
    withCredentials: scala.Boolean,
    requestHeaders: bingmapsLib.MicrosoftNs.MapsNs.IDictionary[java.lang.String],
    callback: js.Function1[/* map */ bingmapsLib.MicrosoftNs.MapsNs.Map, scala.Unit]
  ): scala.Unit = js.native
  def createFromConfig(
    element: java.lang.String,
    configFileUrl: java.lang.String,
    withCredentials: scala.Boolean,
    requestHeaders: bingmapsLib.MicrosoftNs.MapsNs.IDictionary[java.lang.String],
    callback: js.Function1[/* map */ bingmapsLib.MicrosoftNs.MapsNs.Map, scala.Unit],
    errorCallback: js.Function1[/* errorMsg */ java.lang.String, scala.Unit]
  ): scala.Unit = js.native
  def createFromConfig(element: stdLib.HTMLElement, configFileUrl: java.lang.String, withCredentials: scala.Boolean): scala.Unit = js.native
  def createFromConfig(
    element: stdLib.HTMLElement,
    configFileUrl: java.lang.String,
    withCredentials: scala.Boolean,
    requestHeaders: bingmapsLib.MicrosoftNs.MapsNs.IDictionary[java.lang.String]
  ): scala.Unit = js.native
  def createFromConfig(
    element: stdLib.HTMLElement,
    configFileUrl: java.lang.String,
    withCredentials: scala.Boolean,
    requestHeaders: bingmapsLib.MicrosoftNs.MapsNs.IDictionary[java.lang.String],
    callback: js.Function1[/* map */ bingmapsLib.MicrosoftNs.MapsNs.Map, scala.Unit]
  ): scala.Unit = js.native
  def createFromConfig(
    element: stdLib.HTMLElement,
    configFileUrl: java.lang.String,
    withCredentials: scala.Boolean,
    requestHeaders: bingmapsLib.MicrosoftNs.MapsNs.IDictionary[java.lang.String],
    callback: js.Function1[/* map */ bingmapsLib.MicrosoftNs.MapsNs.Map, scala.Unit],
    errorCallback: js.Function1[/* errorMsg */ java.lang.String, scala.Unit]
  ): scala.Unit = js.native
}

