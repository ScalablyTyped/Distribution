package typings.chromeApps.anon

import typings.chromeApps.chrome.ToStringLiteral
import typings.chromeApps.chromeAppsStrings.AUTHENTICATION_REQUIRED
import typings.chromeApps.chromeAppsStrings.DISABLED
import typings.chromeApps.chromeAppsStrings.INITIALIZING
import typings.chromeApps.chromeAppsStrings.RUNNING
import typings.chromeApps.chromeAppsStrings.TEMPORARY_UNAVAILABLE
import typings.chromeApps.chromeAppsStrings.authentication_required_
import typings.chromeApps.chromeAppsStrings.disabled__
import typings.chromeApps.chromeAppsStrings.initializing_
import typings.chromeApps.chromeAppsStrings.running_
import typings.chromeApps.chromeAppsStrings.temporary_unavailable_
import typings.std.Exclude
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait State extends js.Object {
  var description: String = js.native
  var state: ToStringLiteral[
    AUTHENTICATIONREQUIRED, 
    /* keyof chrome-apps.anon.AUTHENTICATIONREQUIRED */ INITIALIZING | RUNNING | AUTHENTICATION_REQUIRED | TEMPORARY_UNAVAILABLE | DISABLED, 
    Exclude[
      /* keyof chrome-apps.anon.AUTHENTICATIONREQUIRED */ INITIALIZING | RUNNING | AUTHENTICATION_REQUIRED | TEMPORARY_UNAVAILABLE | DISABLED, 
      temporary_unavailable_ | authentication_required_ | disabled__ | initializing_ | running_
    ]
  ] = js.native
}

object State {
  @scala.inline
  def apply(
    description: String,
    state: ToStringLiteral[
      AUTHENTICATIONREQUIRED, 
      /* keyof chrome-apps.anon.AUTHENTICATIONREQUIRED */ INITIALIZING | RUNNING | AUTHENTICATION_REQUIRED | TEMPORARY_UNAVAILABLE | DISABLED, 
      Exclude[
        /* keyof chrome-apps.anon.AUTHENTICATIONREQUIRED */ INITIALIZING | RUNNING | AUTHENTICATION_REQUIRED | TEMPORARY_UNAVAILABLE | DISABLED, 
        temporary_unavailable_ | authentication_required_ | disabled__ | initializing_ | running_
      ]
    ]
  ): State = {
    val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any])
    __obj.asInstanceOf[State]
  }
  @scala.inline
  implicit class StateOps[Self <: State] (val x: Self) extends AnyVal {
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
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    @scala.inline
    def setState(
      value: ToStringLiteral[
          AUTHENTICATIONREQUIRED, 
          /* keyof chrome-apps.anon.AUTHENTICATIONREQUIRED */ INITIALIZING | RUNNING | AUTHENTICATION_REQUIRED | TEMPORARY_UNAVAILABLE | DISABLED, 
          Exclude[
            /* keyof chrome-apps.anon.AUTHENTICATIONREQUIRED */ INITIALIZING | RUNNING | AUTHENTICATION_REQUIRED | TEMPORARY_UNAVAILABLE | DISABLED, 
            temporary_unavailable_ | authentication_required_ | disabled__ | initializing_ | running_
          ]
        ]
    ): Self = this.set("state", value.asInstanceOf[js.Any])
  }
  
}

