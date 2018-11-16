package typings
package chromeDashAppsLib.chromeNs.networkingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object oncNs {
  type ActivationStateType = chromeDashAppsLib.chromeDashAppsLibStrings.Activated | chromeDashAppsLib.chromeDashAppsLibStrings.Activating | chromeDashAppsLib.chromeDashAppsLibStrings.NotActivated | chromeDashAppsLib.chromeDashAppsLibStrings.PartiallyActivated
  type CaptivePortalStatus = chromeDashAppsLib.chromeDashAppsLibStrings.Unknown | chromeDashAppsLib.chromeDashAppsLibStrings.Offline | chromeDashAppsLib.chromeDashAppsLibStrings.Online | chromeDashAppsLib.chromeDashAppsLibStrings.Portal | chromeDashAppsLib.chromeDashAppsLibStrings.ProxyAuthRequired
  type ClientCertType = chromeDashAppsLib.chromeDashAppsLibStrings.Ref | chromeDashAppsLib.chromeDashAppsLibStrings.Pattern
  type ConnectionStateType = chromeDashAppsLib.chromeDashAppsLibStrings.Connected | chromeDashAppsLib.chromeDashAppsLibStrings.Connecting | chromeDashAppsLib.chromeDashAppsLibStrings.NotConnected
  /* The current state of the device. */
  type DeviceState = chromeDashAppsLib.chromeDashAppsLibStrings.Uninitialized | chromeDashAppsLib.chromeDashAppsLibStrings.Disabled | chromeDashAppsLib.chromeDashAppsLibStrings.Enabling | chromeDashAppsLib.chromeDashAppsLibStrings.Enabled | chromeDashAppsLib.chromeDashAppsLibStrings.Prohibited
  type EthernetAuthenticationType = chromeDashAppsLib.chromeDashAppsLibStrings.None | chromeDashAppsLib.chromeDashAppsLibStrings.`8021X`
  type IPConfigType = chromeDashAppsLib.chromeDashAppsLibStrings.DHCP | chromeDashAppsLib.chromeDashAppsLibStrings.Static
  type IPConfigurationType = chromeDashAppsLib.chromeDashAppsLibStrings.IPv4 | chromeDashAppsLib.chromeDashAppsLibStrings.IPv6
  type InterfaceType = chromeDashAppsLib.chromeDashAppsLibStrings.partial | chromeDashAppsLib.chromeDashAppsLibStrings.full
  type ManagedBoolean = ManagedType[scala.Boolean]
  type ManagedDOMString = ManagedType[java.lang.String]
  type ManagedDOMStringList = ManagedType[js.Array[java.lang.String]]
  type ManagedIPConfigType = ManagedType[js.Array[IPConfigType]]
  type ManagedLong = ManagedType[chromeDashAppsLib.chromeNs.integer]
  type ManagedObject = chromeDashAppsLib.chromeDashAppsLibStrings.managed | chromeDashAppsLib.chromeDashAppsLibStrings.unmanaged
  type ManagedProperties = NetworkProperties[
    chromeDashAppsLib.chromeDashAppsLibStrings.managed, 
    chromeDashAppsLib.chromeDashAppsLibStrings.full
  ]
  type NetworkConfigProperties[OF /* <: chromeDashAppsLib.chromeNs.networkingNs.oncNs.underscoreInternalUnderscoreNs.ObjectFunction */] = chromeDashAppsLib.chromeNs.networkingNs.oncNs.underscoreInternalUnderscoreNs.NetworkConfigBase[
    chromeDashAppsLib.chromeDashAppsLibStrings.unmanaged, 
    chromeDashAppsLib.chromeDashAppsLibStrings.full, 
    OF
  ]
  type NetworkStateProperties = NetworkProperties[
    chromeDashAppsLib.chromeDashAppsLibStrings.unmanaged, 
    chromeDashAppsLib.chromeDashAppsLibStrings.partial
  ]
  type NetworkType = chromeDashAppsLib.chromeDashAppsLibStrings.All | chromeDashAppsLib.chromeDashAppsLibStrings.Cellular | chromeDashAppsLib.chromeDashAppsLibStrings.Ethernet | chromeDashAppsLib.chromeDashAppsLibStrings.VPN | chromeDashAppsLib.chromeDashAppsLibStrings.Wireless | chromeDashAppsLib.chromeDashAppsLibStrings.WiFi | chromeDashAppsLib.chromeDashAppsLibStrings.WiMAX
  type ProxySettingsType = chromeDashAppsLib.chromeDashAppsLibStrings.Direct | chromeDashAppsLib.chromeDashAppsLibStrings.Manual | chromeDashAppsLib.chromeDashAppsLibStrings.PAC | chromeDashAppsLib.chromeDashAppsLibStrings.WPAD
}
