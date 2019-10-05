package typings.chrome.chrome

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object webNavigation {
  type WebNavigationFramedErrorEvent = WebNavigationEvent[WebNavigationFramedErrorCallbackDetails]
  type WebNavigationFramedEvent = WebNavigationEvent[WebNavigationFramedCallbackDetails]
  type WebNavigationParentedEvent = WebNavigationEvent[WebNavigationParentedCallbackDetails]
  type WebNavigationReplacementEvent = WebNavigationEvent[WebNavigationReplacementCallbackDetails]
  type WebNavigationSourceEvent = WebNavigationEvent[WebNavigationSourceCallbackDetails]
  type WebNavigationTransitionalEvent = WebNavigationEvent[WebNavigationTransitionCallbackDetails]
}
