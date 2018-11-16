package typings
package chromeLib.chromeNs.webNavigationNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait WebNavigationTransitionCallbackDetails extends WebNavigationFramedCallbackDetails {
  /**
           * A list of transition qualifiers.
           * Each element one of: "client_redirect", "server_redirect", "forward_back", or "from_address_bar"
           */
  var transitionQualifiers: js.Array[java.lang.String]
  /**
           * Cause of the navigation.
           * One of: "link", "typed", "auto_bookmark", "auto_subframe", "manual_subframe", "generated", "start_page", "form_submit", "reload", "keyword", or "keyword_generated"
           */
  var transitionType: java.lang.String
}

