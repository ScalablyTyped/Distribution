package typings.awsSdk.elasticacheMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeleteCacheSecurityGroupMessage extends StObject {
  
  /**
    * The name of the cache security group to delete.  You cannot delete the default security group. 
    */
  var CacheSecurityGroupName: String = js.native
}
object DeleteCacheSecurityGroupMessage {
  
  @scala.inline
  def apply(CacheSecurityGroupName: String): DeleteCacheSecurityGroupMessage = {
    val __obj = js.Dynamic.literal(CacheSecurityGroupName = CacheSecurityGroupName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteCacheSecurityGroupMessage]
  }
  
  @scala.inline
  implicit class DeleteCacheSecurityGroupMessageMutableBuilder[Self <: DeleteCacheSecurityGroupMessage] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCacheSecurityGroupName(value: String): Self = StObject.set(x, "CacheSecurityGroupName", value.asInstanceOf[js.Any])
  }
}
