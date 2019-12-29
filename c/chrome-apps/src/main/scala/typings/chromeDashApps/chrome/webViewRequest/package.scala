package typings.chromeDashApps.chrome

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object webViewRequest {
  import typings.chromeDashApps.chrome.events.Event
  import typings.chromeDashApps.chrome.events.Rule
  import typings.chromeDashApps.chromeDashAppsStrings.declarativeContentDotPageStateMatcher

  type DeclarativeWebRequestConditionsList = declarativeContentDotPageStateMatcher
  /**
    * Fired when a message is sent via **declarativeWebRequest.SendMessageToExtension**
    * from an action of the declarative web request API.
    */
  type OnMessageEvent = Event[js.Function1[/* details */ OnMessageEventDetails, Unit]]
  /** Supported conditions */
  type OnRequestConditions = RequestMatcher
  /**
    * Description of a declarative rule for handling events.
    * With correct types for the onRequest event.
    */
  type OnRequestRule = Rule[OnRequestConditions, OnRequestActions]
}
