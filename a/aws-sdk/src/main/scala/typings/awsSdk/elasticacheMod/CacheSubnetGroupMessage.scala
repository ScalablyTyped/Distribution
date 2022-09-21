package typings.awsSdk.elasticacheMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CacheSubnetGroupMessage extends StObject {
  
  /**
    * A list of cache subnet groups. Each element in the list contains detailed information about one group.
    */
  var CacheSubnetGroups: js.UndefOr[typings.awsSdk.elasticacheMod.CacheSubnetGroups] = js.undefined
  
  /**
    * Provides an identifier to allow retrieval of paginated results.
    */
  var Marker: js.UndefOr[String] = js.undefined
}
object CacheSubnetGroupMessage {
  
  inline def apply(): CacheSubnetGroupMessage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CacheSubnetGroupMessage]
  }
  
  extension [Self <: CacheSubnetGroupMessage](x: Self) {
    
    inline def setCacheSubnetGroups(value: CacheSubnetGroups): Self = StObject.set(x, "CacheSubnetGroups", value.asInstanceOf[js.Any])
    
    inline def setCacheSubnetGroupsUndefined: Self = StObject.set(x, "CacheSubnetGroups", js.undefined)
    
    inline def setCacheSubnetGroupsVarargs(value: CacheSubnetGroup*): Self = StObject.set(x, "CacheSubnetGroups", js.Array(value*))
    
    inline def setMarker(value: String): Self = StObject.set(x, "Marker", value.asInstanceOf[js.Any])
    
    inline def setMarkerUndefined: Self = StObject.set(x, "Marker", js.undefined)
  }
}
