package typings.awsSdk.elasticacheMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CacheEngineVersionMessage extends StObject {
  
  /**
    * A list of cache engine version details. Each element in the list contains detailed information about one cache engine version.
    */
  var CacheEngineVersions: js.UndefOr[CacheEngineVersionList] = js.undefined
  
  /**
    * Provides an identifier to allow retrieval of paginated results.
    */
  var Marker: js.UndefOr[String] = js.undefined
}
object CacheEngineVersionMessage {
  
  inline def apply(): CacheEngineVersionMessage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CacheEngineVersionMessage]
  }
  
  extension [Self <: CacheEngineVersionMessage](x: Self) {
    
    inline def setCacheEngineVersions(value: CacheEngineVersionList): Self = StObject.set(x, "CacheEngineVersions", value.asInstanceOf[js.Any])
    
    inline def setCacheEngineVersionsUndefined: Self = StObject.set(x, "CacheEngineVersions", js.undefined)
    
    inline def setCacheEngineVersionsVarargs(value: CacheEngineVersion*): Self = StObject.set(x, "CacheEngineVersions", js.Array(value :_*))
    
    inline def setMarker(value: String): Self = StObject.set(x, "Marker", value.asInstanceOf[js.Any])
    
    inline def setMarkerUndefined: Self = StObject.set(x, "Marker", js.undefined)
  }
}
