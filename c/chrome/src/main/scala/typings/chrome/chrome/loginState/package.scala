package typings.chrome.chrome

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object loginState {
  type SessionStateChangedEvent = typings.chrome.chrome.events.Event[
    js.Function1[/* sessionState */ typings.chrome.chrome.loginState.SessionState, scala.Unit]
  ]
}
