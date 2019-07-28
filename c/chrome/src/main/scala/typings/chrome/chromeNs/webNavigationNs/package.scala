package typings.chrome.chromeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object webNavigationNs {
  type WebNavigationFramedErrorEvent = WebNavigationEvent[WebNavigationFramedErrorCallbackDetails]
  type WebNavigationFramedEvent = WebNavigationEvent[WebNavigationFramedCallbackDetails]
  type WebNavigationParentedEvent = WebNavigationEvent[WebNavigationParentedCallbackDetails]
  type WebNavigationReplacementEvent = WebNavigationEvent[WebNavigationReplacementCallbackDetails]
  type WebNavigationSourceEvent = WebNavigationEvent[WebNavigationSourceCallbackDetails]
  type WebNavigationTransitionalEvent = WebNavigationEvent[WebNavigationTransitionCallbackDetails]
}
