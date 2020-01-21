package typings.chrome.chrome

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object webNavigation {
  type WebNavigationFramedErrorEvent = typings.chrome.chrome.webNavigation.WebNavigationEvent[typings.chrome.chrome.webNavigation.WebNavigationFramedErrorCallbackDetails]
  type WebNavigationFramedEvent = typings.chrome.chrome.webNavigation.WebNavigationEvent[typings.chrome.chrome.webNavigation.WebNavigationFramedCallbackDetails]
  type WebNavigationParentedEvent = typings.chrome.chrome.webNavigation.WebNavigationEvent[typings.chrome.chrome.webNavigation.WebNavigationParentedCallbackDetails]
  type WebNavigationReplacementEvent = typings.chrome.chrome.webNavigation.WebNavigationEvent[typings.chrome.chrome.webNavigation.WebNavigationReplacementCallbackDetails]
  type WebNavigationSourceEvent = typings.chrome.chrome.webNavigation.WebNavigationEvent[typings.chrome.chrome.webNavigation.WebNavigationSourceCallbackDetails]
  type WebNavigationTransitionalEvent = typings.chrome.chrome.webNavigation.WebNavigationEvent[typings.chrome.chrome.webNavigation.WebNavigationTransitionCallbackDetails]
}
