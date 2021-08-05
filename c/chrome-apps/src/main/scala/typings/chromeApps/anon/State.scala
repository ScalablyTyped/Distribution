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
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait State extends StObject {
  
  var description: String
  
  var state: ToStringLiteral[
    AUTHENTICATIONREQUIRED, 
    /* keyof chrome-apps.anon.AUTHENTICATIONREQUIRED */ INITIALIZING | RUNNING | AUTHENTICATION_REQUIRED | TEMPORARY_UNAVAILABLE | DISABLED, 
    Exclude[
      /* keyof chrome-apps.anon.AUTHENTICATIONREQUIRED */ INITIALIZING | RUNNING | AUTHENTICATION_REQUIRED | TEMPORARY_UNAVAILABLE | DISABLED, 
      temporary_unavailable_ | authentication_required_ | disabled__ | initializing_ | running_
    ]
  ]
}
object State {
  
  inline def apply(
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
  
  extension [Self <: State](x: Self) {
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setState(
      value: ToStringLiteral[
          AUTHENTICATIONREQUIRED, 
          /* keyof chrome-apps.anon.AUTHENTICATIONREQUIRED */ INITIALIZING | RUNNING | AUTHENTICATION_REQUIRED | TEMPORARY_UNAVAILABLE | DISABLED, 
          Exclude[
            /* keyof chrome-apps.anon.AUTHENTICATIONREQUIRED */ INITIALIZING | RUNNING | AUTHENTICATION_REQUIRED | TEMPORARY_UNAVAILABLE | DISABLED, 
            temporary_unavailable_ | authentication_required_ | disabled__ | initializing_ | running_
          ]
        ]
    ): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
  }
}
