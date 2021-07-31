package typings.azure.mod

import typings.azure.anon.LastSyncTime
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StorageServiceStats extends StObject {
  
  var GeoReplication: LastSyncTime
}
object StorageServiceStats {
  
  @scala.inline
  def apply(GeoReplication: LastSyncTime): StorageServiceStats = {
    val __obj = js.Dynamic.literal(GeoReplication = GeoReplication.asInstanceOf[js.Any])
    __obj.asInstanceOf[StorageServiceStats]
  }
  
  @scala.inline
  implicit class StorageServiceStatsMutableBuilder[Self <: StorageServiceStats] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGeoReplication(value: LastSyncTime): Self = StObject.set(x, "GeoReplication", value.asInstanceOf[js.Any])
  }
}
