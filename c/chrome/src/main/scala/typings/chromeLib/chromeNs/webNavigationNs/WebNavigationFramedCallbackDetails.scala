package typings
package chromeLib.chromeNs.webNavigationNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait WebNavigationFramedCallbackDetails extends WebNavigationUrlCallbackDetails {
  /** 0 indicates the navigation happens in the tab content window; a positive value indicates navigation in a subframe. Frame IDs are unique for a given tab and process. */
  var frameId: scala.Double
  /**
           * The ID of the process runs the renderer for this tab.
           * @since Chrome 22.
           */
  var processId: scala.Double
}

