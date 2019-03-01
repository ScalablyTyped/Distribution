package typings
package chromeDashAppsLib.chromeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object webViewRequestNs {
  type DeclarativeWebRequestConditionsList = chromeDashAppsLib.chromeDashAppsLibStrings.declarativeContentDOTPageStateMatcher
  /**
    * Fired when a message is sent via **declarativeWebRequest.SendMessageToExtension**
    * from an action of the declarative web request API.
    */
  type OnMessageEvent = chromeDashAppsLib.chromeNs.eventsNs.Event[js.Function1[/* details */ OnMessageEventDetails, scala.Unit]]
  /** Supported conditions */
  type OnRequestConditions = RequestMatcher
  /**
    * Description of a declarative rule for handling events.
    * With correct types for the onRequest event.
    */
  type OnRequestRule = chromeDashAppsLib.chromeNs.eventsNs.Rule[OnRequestConditions, OnRequestActions]
}
