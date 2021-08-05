package typings.awsSdk.elasticacheMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReplicationGroupMessage extends StObject {
  
  /**
    * Provides an identifier to allow retrieval of paginated results.
    */
  var Marker: js.UndefOr[String] = js.undefined
  
  /**
    * A list of replication groups. Each item in the list contains detailed information about one replication group.
    */
  var ReplicationGroups: js.UndefOr[ReplicationGroupList] = js.undefined
}
object ReplicationGroupMessage {
  
  inline def apply(): ReplicationGroupMessage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReplicationGroupMessage]
  }
  
  extension [Self <: ReplicationGroupMessage](x: Self) {
    
    inline def setMarker(value: String): Self = StObject.set(x, "Marker", value.asInstanceOf[js.Any])
    
    inline def setMarkerUndefined: Self = StObject.set(x, "Marker", js.undefined)
    
    inline def setReplicationGroups(value: ReplicationGroupList): Self = StObject.set(x, "ReplicationGroups", value.asInstanceOf[js.Any])
    
    inline def setReplicationGroupsUndefined: Self = StObject.set(x, "ReplicationGroups", js.undefined)
    
    inline def setReplicationGroupsVarargs(value: ReplicationGroup*): Self = StObject.set(x, "ReplicationGroups", js.Array(value :_*))
  }
}
