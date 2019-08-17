package typings.chromeDashApps.chromeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object webViewRequestNs {
  import typings.chromeDashApps.chromeDashAppsStrings.declarativeContentDOTPageStateMatcher
  import typings.chromeDashApps.chromeNs.eventsNs.Rule

  type DeclarativeWebRequestConditionsList = declarativeContentDOTPageStateMatcher
  /**
    * Fired when a message is sent via **declarativeWebRequest.SendMessageToExtension**
    * from an action of the declarative web request API.
    */
  type OnMessageEvent = typings.chromeDashApps.chromeNs.eventsNs.Event[js.Function1[/* details */ OnMessageEventDetails, Unit]]
  /** Supported conditions */
  type OnRequestConditions = RequestMatcher
  /**
    * Description of a declarative rule for handling events.
    * With correct types for the onRequest event.
    */
  type OnRequestRule = Rule[OnRequestConditions, OnRequestActions]
}
