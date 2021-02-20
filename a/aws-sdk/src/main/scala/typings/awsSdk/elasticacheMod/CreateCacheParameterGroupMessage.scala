package typings.awsSdk.elasticacheMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateCacheParameterGroupMessage extends StObject {
  
  /**
    * The name of the cache parameter group family that the cache parameter group can be used with. Valid values are: memcached1.4 | memcached1.5 | memcached1.6 | redis2.6 | redis2.8 | redis3.2 | redis4.0 | redis5.0 | redis6.x | 
    */
  var CacheParameterGroupFamily: String = js.native
  
  /**
    * A user-specified name for the cache parameter group.
    */
  var CacheParameterGroupName: String = js.native
  
  /**
    * A user-specified description for the cache parameter group.
    */
  var Description: String = js.native
}
object CreateCacheParameterGroupMessage {
  
  @scala.inline
  def apply(CacheParameterGroupFamily: String, CacheParameterGroupName: String, Description: String): CreateCacheParameterGroupMessage = {
    val __obj = js.Dynamic.literal(CacheParameterGroupFamily = CacheParameterGroupFamily.asInstanceOf[js.Any], CacheParameterGroupName = CacheParameterGroupName.asInstanceOf[js.Any], Description = Description.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateCacheParameterGroupMessage]
  }
  
  @scala.inline
  implicit class CreateCacheParameterGroupMessageMutableBuilder[Self <: CreateCacheParameterGroupMessage] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCacheParameterGroupFamily(value: String): Self = StObject.set(x, "CacheParameterGroupFamily", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCacheParameterGroupName(value: String): Self = StObject.set(x, "CacheParameterGroupName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
  }
}
