package typings.awsSdk.elasticacheMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CacheEngineVersionMessage extends StObject {
  
  /**
    * A list of cache engine version details. Each element in the list contains detailed information about one cache engine version.
    */
  var CacheEngineVersions: js.UndefOr[CacheEngineVersionList] = js.native
  
  /**
    * Provides an identifier to allow retrieval of paginated results.
    */
  var Marker: js.UndefOr[String] = js.native
}
object CacheEngineVersionMessage {
  
  @scala.inline
  def apply(): CacheEngineVersionMessage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CacheEngineVersionMessage]
  }
  
  @scala.inline
  implicit class CacheEngineVersionMessageMutableBuilder[Self <: CacheEngineVersionMessage] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCacheEngineVersions(value: CacheEngineVersionList): Self = StObject.set(x, "CacheEngineVersions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCacheEngineVersionsUndefined: Self = StObject.set(x, "CacheEngineVersions", js.undefined)
    
    @scala.inline
    def setCacheEngineVersionsVarargs(value: CacheEngineVersion*): Self = StObject.set(x, "CacheEngineVersions", js.Array(value :_*))
    
    @scala.inline
    def setMarker(value: String): Self = StObject.set(x, "Marker", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMarkerUndefined: Self = StObject.set(x, "Marker", js.undefined)
  }
}
