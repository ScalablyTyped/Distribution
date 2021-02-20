package typings.awsSdk.elasticacheMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateCacheSecurityGroupMessage extends StObject {
  
  /**
    * A name for the cache security group. This value is stored as a lowercase string. Constraints: Must contain no more than 255 alphanumeric characters. Cannot be the word "Default". Example: mysecuritygroup 
    */
  var CacheSecurityGroupName: String = js.native
  
  /**
    * A description for the cache security group.
    */
  var Description: String = js.native
}
object CreateCacheSecurityGroupMessage {
  
  @scala.inline
  def apply(CacheSecurityGroupName: String, Description: String): CreateCacheSecurityGroupMessage = {
    val __obj = js.Dynamic.literal(CacheSecurityGroupName = CacheSecurityGroupName.asInstanceOf[js.Any], Description = Description.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateCacheSecurityGroupMessage]
  }
  
  @scala.inline
  implicit class CreateCacheSecurityGroupMessageMutableBuilder[Self <: CreateCacheSecurityGroupMessage] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCacheSecurityGroupName(value: String): Self = StObject.set(x, "CacheSecurityGroupName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
  }
}
