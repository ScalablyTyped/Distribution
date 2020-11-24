package typings.chromeApps.chrome.signedInDevices

import typings.chromeApps.chromeAppsStrings.android_
import typings.chromeApps.chromeAppsStrings.linux_
import typings.chromeApps.chromeAppsStrings.mac_
import typings.chromeApps.chromeAppsStrings.unknown__
import typings.chromeApps.chromeAppsStrings.win_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.chromeApps.chromeAppsStrings.win_
  - typings.chromeApps.chromeAppsStrings.mac_
  - typings.chromeApps.chromeAppsStrings.linux_
  - typings.chromeApps.chromeAppsStrings.chrome_os
  - typings.chromeApps.chromeAppsStrings.android_
  - typings.chromeApps.chromeAppsStrings.ios
  - typings.chromeApps.chromeAppsStrings.unknown__
*/
trait OS extends js.Object
object OS {
  
  @scala.inline
  def android: android_ = "android".asInstanceOf[android_]
  
  @scala.inline
  def chrome_os: typings.chromeApps.chromeAppsStrings.chrome_os = "chrome_os".asInstanceOf[typings.chromeApps.chromeAppsStrings.chrome_os]
  
  @scala.inline
  def ios: typings.chromeApps.chromeAppsStrings.ios = "ios".asInstanceOf[typings.chromeApps.chromeAppsStrings.ios]
  
  @scala.inline
  def linux: linux_ = "linux".asInstanceOf[linux_]
  
  @scala.inline
  def mac: mac_ = "mac".asInstanceOf[mac_]
  
  @scala.inline
  def unknown: unknown__ = "unknown".asInstanceOf[unknown__]
  
  @scala.inline
  def win: win_ = "win".asInstanceOf[win_]
}
