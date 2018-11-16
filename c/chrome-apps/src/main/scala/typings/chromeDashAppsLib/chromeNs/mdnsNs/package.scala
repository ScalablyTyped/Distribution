package typings
package chromeDashAppsLib.chromeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mdnsNs {
  /**
           * Dictionary
           * [key in ValidServiceTypes]: string
           */
  type ServiceTypes = stdLib.Record[ValidServiceTypes, java.lang.String]
  /**
           * Locked to this because it's the only one that can be used.
           *
           * const char kEventFilterServiceTypeKey[] = "serviceType";
           * @see[Source: event_matcher.cc, line 19]{@link https://github.com/chromium/chromium/tree/master/extensions/common/event_matcher.cc}
           */
  type ValidServiceTypes = chromeDashAppsLib.chromeDashAppsLibStrings.serviceType
}
