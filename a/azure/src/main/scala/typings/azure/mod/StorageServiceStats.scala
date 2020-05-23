package typings.azure.mod

import typings.azure.anon.LastSyncTime
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StorageServiceStats extends js.Object {
  var GeoReplication: LastSyncTime
}

object StorageServiceStats {
  @scala.inline
  def apply(GeoReplication: LastSyncTime): StorageServiceStats = {
    val __obj = js.Dynamic.literal(GeoReplication = GeoReplication.asInstanceOf[js.Any])
    __obj.asInstanceOf[StorageServiceStats]
  }
}

