package typings.chromeDashApps.chrome.runtime

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.chromeDashApps.chromeDashAppsStrings.`httpsColonSlashSlashwwwDotgoogle-analyticsDotcomSlashAsterisk`
  - typings.chromeDashApps.chromeDashAppsStrings.httpsColonSlashSlashwwwDotgoogleapisDotcomSlashAsterisk
  - typings.chromeDashApps.chromeDashAppsStrings.Lessthansignall_urlsGreaterthansign
  - typings.chromeDashApps.chromeDashAppsStrings.httpColonSlashSlashAsteriskSlashAsterisk
  - typings.chromeDashApps.chromeDashAppsStrings.httpsColonSlashSlashAsteriskSlashAsterisk
  - typings.chromeDashApps.chromeDashAppsStrings.fileColonSlashSlashSlashAsteriskSlashAsterisk
  - typings.chromeDashApps.chromeDashAppsStrings.chromeColonSlashSlashfaviconSlash
*/
trait UrlMatches extends Permission

object UrlMatches {
  @scala.inline
  def Lessthansignall_urlsGreaterthansign: typings.chromeDashApps.chromeDashAppsStrings.Lessthansignall_urlsGreaterthansign = this.cast("<all_urls>")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def chromeColonSlashSlashfaviconSlash: typings.chromeDashApps.chromeDashAppsStrings.chromeColonSlashSlashfaviconSlash = this.cast("chrome://favicon/")
  @scala.inline
  def fileColonSlashSlashSlashAsteriskSlashAsterisk: typings.chromeDashApps.chromeDashAppsStrings.fileColonSlashSlashSlashAsteriskSlashAsterisk = this.cast("file:///*/*")
  @scala.inline
  def httpColonSlashSlashAsteriskSlashAsterisk: typings.chromeDashApps.chromeDashAppsStrings.httpColonSlashSlashAsteriskSlashAsterisk = this.cast("http://*/*")
  @scala.inline
  def httpsColonSlashSlashAsteriskSlashAsterisk: typings.chromeDashApps.chromeDashAppsStrings.httpsColonSlashSlashAsteriskSlashAsterisk = this.cast("https://*/*")
  @scala.inline
  def `httpsColonSlashSlashwwwDotgoogle-analyticsDotcomSlashAsterisk`: typings.chromeDashApps.chromeDashAppsStrings.`httpsColonSlashSlashwwwDotgoogle-analyticsDotcomSlashAsterisk` = this.cast("https://www.google-analytics.com/*")
  @scala.inline
  def httpsColonSlashSlashwwwDotgoogleapisDotcomSlashAsterisk: typings.chromeDashApps.chromeDashAppsStrings.httpsColonSlashSlashwwwDotgoogleapisDotcomSlashAsterisk = this.cast("https://www.googleapis.com/*")
}

