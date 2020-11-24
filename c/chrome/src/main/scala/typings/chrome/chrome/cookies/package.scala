package typings.chrome.chrome

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object cookies {
  
  type CookieChangedEvent = typings.chrome.chrome.events.Event[
    js.Function1[/* changeInfo */ typings.chrome.chrome.cookies.CookieChangeInfo, scala.Unit]
  ]
}
