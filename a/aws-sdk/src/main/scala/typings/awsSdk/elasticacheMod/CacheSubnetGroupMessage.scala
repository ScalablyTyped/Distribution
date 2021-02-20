package typings.awsSdk.elasticacheMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CacheSubnetGroupMessage extends StObject {
  
  /**
    * A list of cache subnet groups. Each element in the list contains detailed information about one group.
    */
  var CacheSubnetGroups: js.UndefOr[typings.awsSdk.elasticacheMod.CacheSubnetGroups] = js.native
  
  /**
    * Provides an identifier to allow retrieval of paginated results.
    */
  var Marker: js.UndefOr[String] = js.native
}
object CacheSubnetGroupMessage {
  
  @scala.inline
  def apply(): CacheSubnetGroupMessage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CacheSubnetGroupMessage]
  }
  
  @scala.inline
  implicit class CacheSubnetGroupMessageMutableBuilder[Self <: CacheSubnetGroupMessage] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCacheSubnetGroups(value: CacheSubnetGroups): Self = StObject.set(x, "CacheSubnetGroups", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCacheSubnetGroupsUndefined: Self = StObject.set(x, "CacheSubnetGroups", js.undefined)
    
    @scala.inline
    def setCacheSubnetGroupsVarargs(value: CacheSubnetGroup*): Self = StObject.set(x, "CacheSubnetGroups", js.Array(value :_*))
    
    @scala.inline
    def setMarker(value: String): Self = StObject.set(x, "Marker", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMarkerUndefined: Self = StObject.set(x, "Marker", js.undefined)
  }
}
