package typings.chromeApps.chrome.displaySource

import typings.chromeApps.anon.CONNECTED
import typings.chromeApps.chrome.ToStringLiteral
import typings.chromeApps.chrome.integer
import typings.chromeApps.chromeAppsStrings.CONNECTING
import typings.chromeApps.chromeAppsStrings.Connected_
import typings.chromeApps.chromeAppsStrings.Connecting_
import typings.chromeApps.chromeAppsStrings.DISCONNECTED
import typings.chromeApps.chromeAppsStrings.Disconnected_
import typings.std.Exclude
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SinkInfo extends js.Object {
  /** Id of the sink. It is guaranteed to be unique during the browser session. */
  var id: integer = js.native
  /** Human readable name of the sink. */
  var name: String = js.native
  /**
    * State of the sink.
    * @see SinkState
    */
  var state: ToStringLiteral[
    CONNECTED, 
    /* keyof chrome-apps.anon.CONNECTED */ typings.chromeApps.chromeAppsStrings.CONNECTED | CONNECTING | DISCONNECTED, 
    Exclude[
      /* keyof chrome-apps.anon.CONNECTED */ typings.chromeApps.chromeAppsStrings.CONNECTED | CONNECTING | DISCONNECTED, 
      Connected_ | Connecting_ | Disconnected_
    ]
  ] = js.native
}

object SinkInfo {
  @scala.inline
  def apply(
    id: integer,
    name: String,
    state: ToStringLiteral[
      CONNECTED, 
      /* keyof chrome-apps.anon.CONNECTED */ typings.chromeApps.chromeAppsStrings.CONNECTED | CONNECTING | DISCONNECTED, 
      Exclude[
        /* keyof chrome-apps.anon.CONNECTED */ typings.chromeApps.chromeAppsStrings.CONNECTED | CONNECTING | DISCONNECTED, 
        Connected_ | Connecting_ | Disconnected_
      ]
    ]
  ): SinkInfo = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any])
    __obj.asInstanceOf[SinkInfo]
  }
  @scala.inline
  implicit class SinkInfoOps[Self <: SinkInfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setId(value: integer): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setState(
      value: ToStringLiteral[
          CONNECTED, 
          /* keyof chrome-apps.anon.CONNECTED */ typings.chromeApps.chromeAppsStrings.CONNECTED | CONNECTING | DISCONNECTED, 
          Exclude[
            /* keyof chrome-apps.anon.CONNECTED */ typings.chromeApps.chromeAppsStrings.CONNECTED | CONNECTING | DISCONNECTED, 
            Connected_ | Connecting_ | Disconnected_
          ]
        ]
    ): Self = this.set("state", value.asInstanceOf[js.Any])
  }
  
}

