package typings.awsSdk.elasticacheMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CacheEngineVersion extends StObject {
  
  /**
    * The description of the cache engine.
    */
  var CacheEngineDescription: js.UndefOr[String] = js.undefined
  
  /**
    * The description of the cache engine version.
    */
  var CacheEngineVersionDescription: js.UndefOr[String] = js.undefined
  
  /**
    * The name of the cache parameter group family associated with this cache engine. Valid values are: memcached1.4 | memcached1.5 | memcached1.6 | redis2.6 | redis2.8 | redis3.2 | redis4.0 | redis5.0 | redis6.x | 
    */
  var CacheParameterGroupFamily: js.UndefOr[String] = js.undefined
  
  /**
    * The name of the cache engine.
    */
  var Engine: js.UndefOr[String] = js.undefined
  
  /**
    * The version number of the cache engine.
    */
  var EngineVersion: js.UndefOr[String] = js.undefined
}
object CacheEngineVersion {
  
  inline def apply(): CacheEngineVersion = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CacheEngineVersion]
  }
  
  extension [Self <: CacheEngineVersion](x: Self) {
    
    inline def setCacheEngineDescription(value: String): Self = StObject.set(x, "CacheEngineDescription", value.asInstanceOf[js.Any])
    
    inline def setCacheEngineDescriptionUndefined: Self = StObject.set(x, "CacheEngineDescription", js.undefined)
    
    inline def setCacheEngineVersionDescription(value: String): Self = StObject.set(x, "CacheEngineVersionDescription", value.asInstanceOf[js.Any])
    
    inline def setCacheEngineVersionDescriptionUndefined: Self = StObject.set(x, "CacheEngineVersionDescription", js.undefined)
    
    inline def setCacheParameterGroupFamily(value: String): Self = StObject.set(x, "CacheParameterGroupFamily", value.asInstanceOf[js.Any])
    
    inline def setCacheParameterGroupFamilyUndefined: Self = StObject.set(x, "CacheParameterGroupFamily", js.undefined)
    
    inline def setEngine(value: String): Self = StObject.set(x, "Engine", value.asInstanceOf[js.Any])
    
    inline def setEngineUndefined: Self = StObject.set(x, "Engine", js.undefined)
    
    inline def setEngineVersion(value: String): Self = StObject.set(x, "EngineVersion", value.asInstanceOf[js.Any])
    
    inline def setEngineVersionUndefined: Self = StObject.set(x, "EngineVersion", js.undefined)
  }
}
