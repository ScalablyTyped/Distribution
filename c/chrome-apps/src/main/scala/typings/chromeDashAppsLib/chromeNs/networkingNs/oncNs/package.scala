package typings
package chromeDashAppsLib.chromeNs.networkingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object oncNs {
  type ManagedBoolean = ManagedType[scala.Boolean]
  type ManagedDOMString = ManagedType[java.lang.String]
  type ManagedDOMStringList = ManagedType[js.Array[java.lang.String]]
  type ManagedIPConfigType = ManagedType[js.Array[IPConfigType]]
  type ManagedLong = ManagedType[chromeDashAppsLib.chromeNs.integer]
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
}
