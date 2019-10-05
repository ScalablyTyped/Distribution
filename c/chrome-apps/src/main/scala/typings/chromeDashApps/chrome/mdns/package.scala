package typings.chromeDashApps.chrome

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mdns {
  import typings.chromeDashApps.chromeDashAppsStrings.serviceType
  import typings.std.Record

  /**
    * Dictionary
    * [key in ValidServiceTypes]: string
    */
  type ServiceTypes = Record[ValidServiceTypes, String]
  /**
    * Locked to this because it's the only one that can be used.
    *
    * const char kEventFilterServiceTypeKey[] = "serviceType";
    * @see[Source: event_matcher.cc, line 19]{@link https://github.com/chromium/chromium/tree/master/extensions/common/event_matcher.cc}
    */
  type ValidServiceTypes = serviceType
}
