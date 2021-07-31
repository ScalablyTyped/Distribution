package typings.awsSdk.elasticacheMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteCacheParameterGroupMessage extends StObject {
  
  /**
    * The name of the cache parameter group to delete.  The specified cache security group must not be associated with any clusters. 
    */
  var CacheParameterGroupName: String
}
object DeleteCacheParameterGroupMessage {
  
  @scala.inline
  def apply(CacheParameterGroupName: String): DeleteCacheParameterGroupMessage = {
    val __obj = js.Dynamic.literal(CacheParameterGroupName = CacheParameterGroupName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteCacheParameterGroupMessage]
  }
  
  @scala.inline
  implicit class DeleteCacheParameterGroupMessageMutableBuilder[Self <: DeleteCacheParameterGroupMessage] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCacheParameterGroupName(value: String): Self = StObject.set(x, "CacheParameterGroupName", value.asInstanceOf[js.Any])
  }
}
