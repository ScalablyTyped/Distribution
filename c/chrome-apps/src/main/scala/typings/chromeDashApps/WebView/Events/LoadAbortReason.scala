package typings.chromeDashApps.WebView.Events

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
  - typings.chromeDashApps.chromeDashAppsStrings.ERR_ABORTED
  - typings.chromeDashApps.chromeDashAppsStrings.ERR_INVALID_URL
  - typings.chromeDashApps.chromeDashAppsStrings.ERR_DISALLOWED_URL_SCHEME
  - typings.chromeDashApps.chromeDashAppsStrings.ERR_BLOCKED_BY_CLIENT
  - typings.chromeDashApps.chromeDashAppsStrings.ERR_ADDRESS_UNREACHABLE
  - typings.chromeDashApps.chromeDashAppsStrings.ERR_EMPTY_RESPONSE
  - typings.chromeDashApps.chromeDashAppsStrings.ERR_FILE_NOT_FOUND
  - typings.chromeDashApps.chromeDashAppsStrings.ERR_UNKNOWN_URL_SCHEME
*/
trait LoadAbortReason extends js.Object

