package typings.chromeDashApps.chromeNs.networkingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object oncNs {
  import typings.chromeDashApps.chromeDashAppsStrings.full
  import typings.chromeDashApps.chromeDashAppsStrings.managed
  import typings.chromeDashApps.chromeDashAppsStrings.partial
  import typings.chromeDashApps.chromeDashAppsStrings.unmanaged
  import typings.chromeDashApps.chromeNs.integer
  import typings.chromeDashApps.chromeNs.networkingNs.oncNs.underscoreInternalUnderscoreNs.NetworkConfigBase
  import typings.chromeDashApps.chromeNs.networkingNs.oncNs.underscoreInternalUnderscoreNs.ObjectFunction

  type ManagedBoolean = ManagedType[Boolean]
  type ManagedDOMString = ManagedType[String]
  type ManagedDOMStringList = ManagedType[js.Array[String]]
  type ManagedIPConfigType = ManagedType[js.Array[IPConfigType]]
  type ManagedLong = ManagedType[integer]
  type ManagedProperties = NetworkProperties[managed, full]
  type NetworkConfigProperties[OF /* <: ObjectFunction */] = NetworkConfigBase[unmanaged, full, OF]
  type NetworkStateProperties = NetworkProperties[unmanaged, partial]
}
