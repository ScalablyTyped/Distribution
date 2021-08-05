package typings.awsSdk.elasticacheMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CacheParameterGroup extends StObject {
  
  /**
    * The ARN (Amazon Resource Name) of the cache parameter group.
    */
  var ARN: js.UndefOr[String] = js.undefined
  
  /**
    * The name of the cache parameter group family that this cache parameter group is compatible with. Valid values are: memcached1.4 | memcached1.5 | memcached1.6 | redis2.6 | redis2.8 | redis3.2 | redis4.0 | redis5.0 | redis6.x | 
    */
  var CacheParameterGroupFamily: js.UndefOr[String] = js.undefined
  
  /**
    * The name of the cache parameter group.
    */
  var CacheParameterGroupName: js.UndefOr[String] = js.undefined
  
  /**
    * The description for this cache parameter group.
    */
  var Description: js.UndefOr[String] = js.undefined
  
  /**
    * Indicates whether the parameter group is associated with a Global Datastore
    */
  var IsGlobal: js.UndefOr[Boolean] = js.undefined
}
object CacheParameterGroup {
  
  inline def apply(): CacheParameterGroup = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CacheParameterGroup]
  }
  
  extension [Self <: CacheParameterGroup](x: Self) {
    
    inline def setARN(value: String): Self = StObject.set(x, "ARN", value.asInstanceOf[js.Any])
    
    inline def setARNUndefined: Self = StObject.set(x, "ARN", js.undefined)
    
    inline def setCacheParameterGroupFamily(value: String): Self = StObject.set(x, "CacheParameterGroupFamily", value.asInstanceOf[js.Any])
    
    inline def setCacheParameterGroupFamilyUndefined: Self = StObject.set(x, "CacheParameterGroupFamily", js.undefined)
    
    inline def setCacheParameterGroupName(value: String): Self = StObject.set(x, "CacheParameterGroupName", value.asInstanceOf[js.Any])
    
    inline def setCacheParameterGroupNameUndefined: Self = StObject.set(x, "CacheParameterGroupName", js.undefined)
    
    inline def setDescription(value: String): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    inline def setIsGlobal(value: Boolean): Self = StObject.set(x, "IsGlobal", value.asInstanceOf[js.Any])
    
    inline def setIsGlobalUndefined: Self = StObject.set(x, "IsGlobal", js.undefined)
  }
}
