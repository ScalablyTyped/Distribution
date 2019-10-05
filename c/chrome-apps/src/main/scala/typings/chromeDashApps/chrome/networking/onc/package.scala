package typings.chromeDashApps.chrome.networking

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object onc {
  import typings.chromeDashApps.chrome.integer
  import typings.chromeDashApps.chrome.networking.onc._internal_.NetworkConfigBase
  import typings.chromeDashApps.chrome.networking.onc._internal_.ObjectFunction
  import typings.chromeDashApps.chromeDashAppsStrings.full
  import typings.chromeDashApps.chromeDashAppsStrings.managed
  import typings.chromeDashApps.chromeDashAppsStrings.partial
  import typings.chromeDashApps.chromeDashAppsStrings.unmanaged

  type ManagedBoolean = ManagedType[Boolean]
  type ManagedDOMString = ManagedType[String]
  type ManagedDOMStringList = ManagedType[js.Array[String]]
  type ManagedIPConfigType = ManagedType[js.Array[IPConfigType]]
  type ManagedLong = ManagedType[integer]
  type ManagedProperties = NetworkProperties[managed, full]
  type NetworkConfigProperties[OF /* <: ObjectFunction */] = NetworkConfigBase[unmanaged, full, OF]
  type NetworkStateProperties = NetworkProperties[unmanaged, partial]
}
