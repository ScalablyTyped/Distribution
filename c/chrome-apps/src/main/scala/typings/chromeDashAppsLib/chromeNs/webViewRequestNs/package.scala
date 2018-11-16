package typings
package chromeDashAppsLib.chromeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object webViewRequestNs {
  type DeclarativeWebRequestActionsList = chromeDashAppsLib.chromeDashAppsLibStrings.declarativeWebRequestDOTAddRequestCookie | chromeDashAppsLib.chromeDashAppsLibStrings.declarativeWebRequestDOTAddResponseCookie | chromeDashAppsLib.chromeDashAppsLibStrings.declarativeWebRequestDOTAddResponseHeader | chromeDashAppsLib.chromeDashAppsLibStrings.declarativeWebRequestDOTCancelRequest | chromeDashAppsLib.chromeDashAppsLibStrings.declarativeWebRequestDOTEditRequestCookie | chromeDashAppsLib.chromeDashAppsLibStrings.declarativeWebRequestDOTEditResponseCookie | chromeDashAppsLib.chromeDashAppsLibStrings.declarativeWebRequestDOTRedirectRequest | chromeDashAppsLib.chromeDashAppsLibStrings.declarativeWebRequestDOTRedirectToTransparentImage | chromeDashAppsLib.chromeDashAppsLibStrings.declarativeWebRequestDOTRedirectToEmptyDocument | chromeDashAppsLib.chromeDashAppsLibStrings.declarativeWebRequestDOTRedirectByRegEx | chromeDashAppsLib.chromeDashAppsLibStrings.declarativeWebRequestDOTRemoveRequestCookie | chromeDashAppsLib.chromeDashAppsLibStrings.declarativeWebRequestDOTRemoveResponseCookie | chromeDashAppsLib.chromeDashAppsLibStrings.declarativeWebRequestDOTRemoveRequestHeader | chromeDashAppsLib.chromeDashAppsLibStrings.declarativeWebRequestDOTRemoveResponseHeader | chromeDashAppsLib.chromeDashAppsLibStrings.declarativeWebRequestDOTSetRequestHeader | chromeDashAppsLib.chromeDashAppsLibStrings.declarativeWebRequestDOTSendMessageToExtension | chromeDashAppsLib.chromeDashAppsLibStrings.declarativeWebRequestDOTIgnoreRules
  type DeclarativeWebRequestConditionsList = chromeDashAppsLib.chromeDashAppsLibStrings.declarativeContentDOTPageStateMatcher
  type DeclarativeWebRequestEventList = chromeDashAppsLib.chromeDashAppsLibStrings.declarativeContentDOTonBeforeRequest | chromeDashAppsLib.chromeDashAppsLibStrings.declarativeContentDOTonBeforeSendHeaders | chromeDashAppsLib.chromeDashAppsLibStrings.declarativeContentDOTonSendHeaders | chromeDashAppsLib.chromeDashAppsLibStrings.declarativeContentDOTonHeadersReceived | chromeDashAppsLib.chromeDashAppsLibStrings.declarativeContentDOTonAuthRequired | chromeDashAppsLib.chromeDashAppsLibStrings.declarativeContentDOTonResponseStarted | chromeDashAppsLib.chromeDashAppsLibStrings.declarativeContentDOTonBeforeRedirect | chromeDashAppsLib.chromeDashAppsLibStrings.declarativeContentDOTonCompleted | chromeDashAppsLib.chromeDashAppsLibStrings.declarativeContentDOTonErrorOccured | chromeDashAppsLib.chromeDashAppsLibStrings.declarativeContentDOTonRequest | chromeDashAppsLib.chromeDashAppsLibStrings.declarativeContentDOTonMessage
  /**
           * Fired when a message is sent via **declarativeWebRequest.SendMessageToExtension**
           * from an action of the declarative web request API.
           */
  type OnMessageEvent = chromeDashAppsLib.chromeNs.eventsNs.Event[js.Function1[/* details */ OnMessageEventDetails, scala.Unit]]
  /** Supported actions */
  type OnRequestActions = AddRequestCookie | AddResponseCookie | AddResponseHeader | CancelRequest | EditRequestCookie | EditResponseCookie | RedirectRequest | RedirectToTransparentImage | RedirectToEmptyDocument | RedirectByRegEx | RemoveRequestCookie | RemoveResponseCookie | RemoveRequestHeader | RemoveResponseHeader | SetRequestHeader | SendMessageToExtension | IgnoreRules
  /** Supported conditions */
  type OnRequestConditions = RequestMatcher
  /**
           * Description of a declarative rule for handling events.
           * With correct types for the onRequest event.
           */
  type OnRequestRule = chromeDashAppsLib.chromeNs.eventsNs.Rule[OnRequestConditions, OnRequestActions]
  type Stage = chromeDashAppsLib.chromeDashAppsLibStrings.onBeforeRequest | chromeDashAppsLib.chromeDashAppsLibStrings.onBeforeSendHeaders | chromeDashAppsLib.chromeDashAppsLibStrings.onHeadersReceived | chromeDashAppsLib.chromeDashAppsLibStrings.onAuthRequired
}
