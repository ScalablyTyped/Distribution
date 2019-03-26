package typings
package chromeDashAppsLib.WebViewNs.EventsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * String indicating what type of abort occurred.
  * This string is *not* guaranteed to remain backwards compatible between releases.
  * You must not parse and act based upon its content. It is also possible that,
  * in some cases, an error not listed here could be reported.
  */
/* Rewritten from type alias, can be one of: 
  - chromeDashAppsLib.chromeDashAppsLibStrings.ERR_ABORTED
  - chromeDashAppsLib.chromeDashAppsLibStrings.ERR_INVALID_URL
  - chromeDashAppsLib.chromeDashAppsLibStrings.ERR_DISALLOWED_URL_SCHEME
  - chromeDashAppsLib.chromeDashAppsLibStrings.ERR_BLOCKED_BY_CLIENT
  - chromeDashAppsLib.chromeDashAppsLibStrings.ERR_ADDRESS_UNREACHABLE
  - chromeDashAppsLib.chromeDashAppsLibStrings.ERR_EMPTY_RESPONSE
  - chromeDashAppsLib.chromeDashAppsLibStrings.ERR_FILE_NOT_FOUND
  - chromeDashAppsLib.chromeDashAppsLibStrings.ERR_UNKNOWN_URL_SCHEME
*/
trait LoadAbortReason extends js.Object

