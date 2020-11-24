package typings.chromeApps.WebView.Events

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * String indicating what type of abort occurred.
  * This string is *not* guaranteed to remain backwards compatible between releases.
  * You must not parse and act based upon its content. It is also possible that,
  * in some cases, an error not listed here could be reported.
  */
/* Rewritten from type alias, can be one of: 
  - typings.chromeApps.chromeAppsStrings.ERR_ABORTED
  - typings.chromeApps.chromeAppsStrings.ERR_INVALID_URL
  - typings.chromeApps.chromeAppsStrings.ERR_DISALLOWED_URL_SCHEME
  - typings.chromeApps.chromeAppsStrings.ERR_BLOCKED_BY_CLIENT
  - typings.chromeApps.chromeAppsStrings.ERR_ADDRESS_UNREACHABLE
  - typings.chromeApps.chromeAppsStrings.ERR_EMPTY_RESPONSE
  - typings.chromeApps.chromeAppsStrings.ERR_FILE_NOT_FOUND
  - typings.chromeApps.chromeAppsStrings.ERR_UNKNOWN_URL_SCHEME
*/
trait LoadAbortReason extends js.Object
object LoadAbortReason {
  
  @scala.inline
  def ERR_ABORTED: typings.chromeApps.chromeAppsStrings.ERR_ABORTED = "ERR_ABORTED".asInstanceOf[typings.chromeApps.chromeAppsStrings.ERR_ABORTED]
  
  @scala.inline
  def ERR_ADDRESS_UNREACHABLE: typings.chromeApps.chromeAppsStrings.ERR_ADDRESS_UNREACHABLE = "ERR_ADDRESS_UNREACHABLE".asInstanceOf[typings.chromeApps.chromeAppsStrings.ERR_ADDRESS_UNREACHABLE]
  
  @scala.inline
  def ERR_BLOCKED_BY_CLIENT: typings.chromeApps.chromeAppsStrings.ERR_BLOCKED_BY_CLIENT = "ERR_BLOCKED_BY_CLIENT".asInstanceOf[typings.chromeApps.chromeAppsStrings.ERR_BLOCKED_BY_CLIENT]
  
  @scala.inline
  def ERR_DISALLOWED_URL_SCHEME: typings.chromeApps.chromeAppsStrings.ERR_DISALLOWED_URL_SCHEME = "ERR_DISALLOWED_URL_SCHEME".asInstanceOf[typings.chromeApps.chromeAppsStrings.ERR_DISALLOWED_URL_SCHEME]
  
  @scala.inline
  def ERR_EMPTY_RESPONSE: typings.chromeApps.chromeAppsStrings.ERR_EMPTY_RESPONSE = "ERR_EMPTY_RESPONSE".asInstanceOf[typings.chromeApps.chromeAppsStrings.ERR_EMPTY_RESPONSE]
  
  @scala.inline
  def ERR_FILE_NOT_FOUND: typings.chromeApps.chromeAppsStrings.ERR_FILE_NOT_FOUND = "ERR_FILE_NOT_FOUND".asInstanceOf[typings.chromeApps.chromeAppsStrings.ERR_FILE_NOT_FOUND]
  
  @scala.inline
  def ERR_INVALID_URL: typings.chromeApps.chromeAppsStrings.ERR_INVALID_URL = "ERR_INVALID_URL".asInstanceOf[typings.chromeApps.chromeAppsStrings.ERR_INVALID_URL]
  
  @scala.inline
  def ERR_UNKNOWN_URL_SCHEME: typings.chromeApps.chromeAppsStrings.ERR_UNKNOWN_URL_SCHEME = "ERR_UNKNOWN_URL_SCHEME".asInstanceOf[typings.chromeApps.chromeAppsStrings.ERR_UNKNOWN_URL_SCHEME]
}
