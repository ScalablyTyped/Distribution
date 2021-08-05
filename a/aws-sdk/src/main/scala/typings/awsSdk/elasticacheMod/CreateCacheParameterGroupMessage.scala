package typings.awsSdk.elasticacheMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateCacheParameterGroupMessage extends StObject {
  
  /**
    * The name of the cache parameter group family that the cache parameter group can be used with. Valid values are: memcached1.4 | memcached1.5 | memcached1.6 | redis2.6 | redis2.8 | redis3.2 | redis4.0 | redis5.0 | redis6.x | 
    */
  var CacheParameterGroupFamily: String
  
  /**
    * A user-specified name for the cache parameter group.
    */
  var CacheParameterGroupName: String
  
  /**
    * A user-specified description for the cache parameter group.
    */
  var Description: String
}
object CreateCacheParameterGroupMessage {
  
  inline def apply(CacheParameterGroupFamily: String, CacheParameterGroupName: String, Description: String): CreateCacheParameterGroupMessage = {
    val __obj = js.Dynamic.literal(CacheParameterGroupFamily = CacheParameterGroupFamily.asInstanceOf[js.Any], CacheParameterGroupName = CacheParameterGroupName.asInstanceOf[js.Any], Description = Description.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateCacheParameterGroupMessage]
  }
  
  extension [Self <: CreateCacheParameterGroupMessage](x: Self) {
    
    inline def setCacheParameterGroupFamily(value: String): Self = StObject.set(x, "CacheParameterGroupFamily", value.asInstanceOf[js.Any])
    
    inline def setCacheParameterGroupName(value: String): Self = StObject.set(x, "CacheParameterGroupName", value.asInstanceOf[js.Any])
    
    inline def setDescription(value: String): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
  }
}
