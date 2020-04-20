package typings.chromeApps.chrome.displaySource

import typings.chromeApps.AnonCONNECTED
import typings.chromeApps.chrome.ToStringLiteral
import typings.chromeApps.chrome.integer
import typings.chromeApps.chromeAppsStrings.CONNECTED
import typings.chromeApps.chromeAppsStrings.CONNECTING
import typings.chromeApps.chromeAppsStrings.Connected_
import typings.chromeApps.chromeAppsStrings.Connecting_
import typings.chromeApps.chromeAppsStrings.DISCONNECTED
import typings.chromeApps.chromeAppsStrings.Disconnected_
import typings.std.Exclude
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SinkInfo extends js.Object {
  /** Id of the sink. It is guaranteed to be unique during the browser session. */
  var id: integer
  /** Human readable name of the sink. */
  var name: String
  /**
    * State of the sink.
    * @see SinkState
    */
  var state: ToStringLiteral[
    AnonCONNECTED, 
    CONNECTED | CONNECTING | DISCONNECTED, 
    Exclude[CONNECTED | CONNECTING | DISCONNECTED, Connected_ | Connecting_ | Disconnected_]
  ]
}

object SinkInfo {
  @scala.inline
  def apply(
    id: integer,
    name: String,
    state: ToStringLiteral[
      AnonCONNECTED, 
      CONNECTED | CONNECTING | DISCONNECTED, 
      Exclude[CONNECTED | CONNECTING | DISCONNECTED, Connected_ | Connecting_ | Disconnected_]
    ]
  ): SinkInfo = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any])
    __obj.asInstanceOf[SinkInfo]
  }
}

