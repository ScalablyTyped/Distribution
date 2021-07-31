package typings.awsSdk.elasticacheMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CacheParameterGroupsMessage extends StObject {
  
  /**
    * A list of cache parameter groups. Each element in the list contains detailed information about one cache parameter group.
    */
  var CacheParameterGroups: js.UndefOr[CacheParameterGroupList] = js.undefined
  
  /**
    * Provides an identifier to allow retrieval of paginated results.
    */
  var Marker: js.UndefOr[String] = js.undefined
}
object CacheParameterGroupsMessage {
  
  @scala.inline
  def apply(): CacheParameterGroupsMessage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CacheParameterGroupsMessage]
  }
  
  @scala.inline
  implicit class CacheParameterGroupsMessageMutableBuilder[Self <: CacheParameterGroupsMessage] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCacheParameterGroups(value: CacheParameterGroupList): Self = StObject.set(x, "CacheParameterGroups", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCacheParameterGroupsUndefined: Self = StObject.set(x, "CacheParameterGroups", js.undefined)
    
    @scala.inline
    def setCacheParameterGroupsVarargs(value: CacheParameterGroup*): Self = StObject.set(x, "CacheParameterGroups", js.Array(value :_*))
    
    @scala.inline
    def setMarker(value: String): Self = StObject.set(x, "Marker", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMarkerUndefined: Self = StObject.set(x, "Marker", js.undefined)
  }
}
