package typings
package azureDashMobileDashServicesDashClientLib.MicrosoftNs.WindowsAzureNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Push extends js.Object {
  /**
    * Register a push channel with the Mobile Apps backend to start receiving notifications.
    *
    * @param platform The device platform being used - wns, gcm or apns.
    * @param pushChannel The push channel identifier or URI.
    * @param templates An object containing template definitions. Template objects should contain body, headers and tags properties.
    * @param secondaryTiles An object containing template definitions to be used with secondary tiles when using WNS.
    * @param callback Optional callback accepting (error, results) parameters.
    */
  def register(platform: java.lang.String, pushChannel: java.lang.String): scala.Unit = js.native
  def register(platform: java.lang.String, pushChannel: java.lang.String, templates: js.Any): scala.Unit = js.native
  def register(
    platform: java.lang.String,
    pushChannel: java.lang.String,
    templates: js.Any,
    secondaryTiles: js.Any
  ): scala.Unit = js.native
  def register(
    platform: java.lang.String,
    pushChannel: java.lang.String,
    templates: js.Any,
    secondaryTiles: js.Any,
    callback: js.Function2[/* error */ js.Any, /* results */ js.Any, scala.Unit]
  ): scala.Unit = js.native
  /**
    * Invokes the specified custom api and returns a response object.
    *
    * @param pushChannel The push channel identifier or URI.
    * @param callback Optional callback accepting (error, results) parameters.
    */
  def unregister(pushChannel: java.lang.String): scala.Unit = js.native
  def unregister(
    pushChannel: java.lang.String,
    callback: js.Function2[/* error */ js.Any, /* results */ js.Any, scala.Unit]
  ): scala.Unit = js.native
}

