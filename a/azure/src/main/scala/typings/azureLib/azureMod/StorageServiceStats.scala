package typings
package azureLib.azureMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StorageServiceStats extends js.Object {
  var GeoReplication: azureLib.Anon_LastSyncTime
}

object StorageServiceStats {
  @scala.inline
  def apply(GeoReplication: azureLib.Anon_LastSyncTime): StorageServiceStats = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("GeoReplication")(GeoReplication)
    __obj.asInstanceOf[StorageServiceStats]
  }
}

