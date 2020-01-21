package typings.chromeApps.chrome.networking

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object onc {
  type ManagedBoolean = typings.chromeApps.chrome.networking.onc.ManagedType[scala.Boolean]
  type ManagedDOMString = typings.chromeApps.chrome.networking.onc.ManagedType[java.lang.String]
  type ManagedDOMStringList = typings.chromeApps.chrome.networking.onc.ManagedType[js.Array[java.lang.String]]
  type ManagedIPConfigType = typings.chromeApps.chrome.networking.onc.ManagedType[js.Array[typings.chromeApps.chrome.networking.onc.IPConfigType]]
  type ManagedLong = typings.chromeApps.chrome.networking.onc.ManagedType[typings.chromeApps.chrome.integer]
  type ManagedProperties = typings.chromeApps.chrome.networking.onc.NetworkProperties[
    typings.chromeApps.chromeAppsStrings.managed, 
    typings.chromeApps.chromeAppsStrings.full
  ]
  type NetworkConfigProperties[OF /* <: typings.chromeApps.chrome.networking.onc.internal.ObjectFunction */] = typings.chromeApps.chrome.networking.onc.internal.NetworkConfigBase[
    typings.chromeApps.chromeAppsStrings.unmanaged, 
    typings.chromeApps.chromeAppsStrings.full, 
    OF
  ]
  type NetworkStateProperties = typings.chromeApps.chrome.networking.onc.NetworkProperties[
    typings.chromeApps.chromeAppsStrings.unmanaged, 
    typings.chromeApps.chromeAppsStrings.partial
  ]
}
