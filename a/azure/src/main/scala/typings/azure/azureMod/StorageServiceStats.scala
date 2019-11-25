package typings.azure.azureMod

import typings.azure.Anon_LastSyncTime
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StorageServiceStats extends js.Object {
  var GeoReplication: Anon_LastSyncTime
}

object StorageServiceStats {
  @scala.inline
  def apply(GeoReplication: Anon_LastSyncTime): StorageServiceStats = {
    val __obj = js.Dynamic.literal(GeoReplication = GeoReplication.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[StorageServiceStats]
  }
}

