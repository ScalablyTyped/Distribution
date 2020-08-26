package typings.azureMobileServicesClient.Microsoft.WindowsAzure

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
  def register(platform: String, pushChannel: String): Unit = js.native
  def register(
    platform: String,
    pushChannel: String,
    templates: js.UndefOr[scala.Nothing],
    secondaryTiles: js.UndefOr[scala.Nothing],
    callback: js.Function2[/* error */ js.Any, /* results */ js.Any, Unit]
  ): Unit = js.native
  def register(
    platform: String,
    pushChannel: String,
    templates: js.UndefOr[scala.Nothing],
    secondaryTiles: js.Any
  ): Unit = js.native
  def register(
    platform: String,
    pushChannel: String,
    templates: js.UndefOr[scala.Nothing],
    secondaryTiles: js.Any,
    callback: js.Function2[/* error */ js.Any, /* results */ js.Any, Unit]
  ): Unit = js.native
  def register(platform: String, pushChannel: String, templates: js.Any): Unit = js.native
  def register(
    platform: String,
    pushChannel: String,
    templates: js.Any,
    secondaryTiles: js.UndefOr[scala.Nothing],
    callback: js.Function2[/* error */ js.Any, /* results */ js.Any, Unit]
  ): Unit = js.native
  def register(platform: String, pushChannel: String, templates: js.Any, secondaryTiles: js.Any): Unit = js.native
  def register(
    platform: String,
    pushChannel: String,
    templates: js.Any,
    secondaryTiles: js.Any,
    callback: js.Function2[/* error */ js.Any, /* results */ js.Any, Unit]
  ): Unit = js.native
  /**
    * Invokes the specified custom api and returns a response object.
    *
    * @param pushChannel The push channel identifier or URI.
    * @param callback Optional callback accepting (error, results) parameters.
    */
  def unregister(pushChannel: String): Unit = js.native
  def unregister(pushChannel: String, callback: js.Function2[/* error */ js.Any, /* results */ js.Any, Unit]): Unit = js.native
}

