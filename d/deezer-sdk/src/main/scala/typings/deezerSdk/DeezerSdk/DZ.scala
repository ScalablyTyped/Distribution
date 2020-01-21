package typings.deezerSdk.DeezerSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * See: {@link https://developers.deezer.com/sdk/javascript | Introduction}
  */
@js.native
trait DZ extends js.Object {
  /**
    * See: {@link https://developers.deezer.com/sdk/javascript/events-subscribe | Subscribe to an event}
    */
  val Event: typings.deezerSdk.DeezerSdk.Event = js.native
  /**
    * Allows you to load and play tracks from your page.
    *
    * Before using the player, you must define PlayerOptions when initializing init(InitOptions).
    *
    * The Deezer web player requires Flash (for stream encryption purposes), the minimum required version
    * is Flash Player 10.1. On mobile, the player will automatically fall back to 30-second previews.
    *
    * See:\
    * {@link https://developers.deezer.com/sdk/javascript/player | Initialize a player}\
    * {@link https://developers.deezer.com/sdk/javascript/loadtracks | Load tracks to a player}
    */
  val player: Player = js.native
  /**
    * Make calls to the Deezer API.
    *
    * See:\
    * {@link https://developers.deezer.com/sdk/javascript/api | DZ.api}\
    * {@link https://developers.deezer.com/api | API}
    */
  def api(path: String, callback: js.Function1[/* response */ js.Any, Unit]): Unit = js.native
  def api(path: String, method: HttpMethod, callback: js.Function1[/* response */ js.Any, Unit]): Unit = js.native
  def api(
    path: String,
    method: HttpMethod,
    data: js.Any,
    callback: js.Function1[/* response */ js.Any, Unit]
  ): Unit = js.native
  /**
    * Determine if a user is logged in and connected to your app.
    *
    * See: {@link https://developers.deezer.com/sdk/javascript/getloginstatus | DZ.getLoginStatus}
    */
  def getLoginStatus(callback: js.Function1[/* loginStatus */ LoginStatus, Unit]): Unit = js.native
  /**
    * Initialize the JavaScript SDK in your page.
    *
    * See: {@link https://developers.deezer.com/sdk/javascript/init | DZ.init}
    */
  def init(options: InitOptions): Unit = js.native
  /**
    * Prompt the user to connect on Deezer, and to authorize you application.
    *
    * The DZ.login method opens up a modal window. Since most browsers block pop-up windows unless they
    * are initiated from a user event, we advise you to call DZ.login from a JavaScript onclick event.
    *
    * See: {@link https://developers.deezer.com/sdk/javascript/login | DZ.login}
    */
  def login(callback: js.Function1[/* response */ LoginResponse, Unit]): Unit = js.native
  /**
    * Destroy the current user session.
    *
    * See: {@link https://developers.deezer.com/sdk/javascript/logout | DZ.logout}
    */
  def logout(): Unit = js.native
  def logout(callback: js.Function0[Unit]): Unit = js.native
  /**
    * Allows you to interact with the DZ.player object.
    *
    * To interact with the player, it needs to be loaded first otherwise you'll get an error message.
    * Once the player is loaded, the DZ.ready method is executed and you can use it to perform your
    * player actions.
    *
    * The DZ.ready methods accepts a function as argument that will be executed as soon as the
    * DZ.player object is loaded.
    *
    * Another way to make sure that the player is loaded before interacting with it is to use the
    * onload option when initializing the player with the DZ.init method.
    *
    * See: {@link https://developers.deezer.com/sdk/javascript/ready | DZ.ready}
    */
  def ready(callback: js.Function1[/* sdkOptions */ SdkOptions, Unit]): Unit = js.native
}

