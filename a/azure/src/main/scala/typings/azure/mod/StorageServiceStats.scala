package typings.azure.mod

import typings.azure.anon.LastSyncTime
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StorageServiceStats extends StObject {
  
  var GeoReplication: LastSyncTime
}
object StorageServiceStats {
  
  inline def apply(GeoReplication: LastSyncTime): StorageServiceStats = {
    val __obj = js.Dynamic.literal(GeoReplication = GeoReplication.asInstanceOf[js.Any])
    __obj.asInstanceOf[StorageServiceStats]
  }
  
  extension [Self <: StorageServiceStats](x: Self) {
    
    inline def setGeoReplication(value: LastSyncTime): Self = StObject.set(x, "GeoReplication", value.asInstanceOf[js.Any])
  }
}
