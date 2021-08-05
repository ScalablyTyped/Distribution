package typings.awsSdk.elasticacheMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateCacheSecurityGroupMessage extends StObject {
  
  /**
    * A name for the cache security group. This value is stored as a lowercase string. Constraints: Must contain no more than 255 alphanumeric characters. Cannot be the word "Default". Example: mysecuritygroup 
    */
  var CacheSecurityGroupName: String
  
  /**
    * A description for the cache security group.
    */
  var Description: String
}
object CreateCacheSecurityGroupMessage {
  
  inline def apply(CacheSecurityGroupName: String, Description: String): CreateCacheSecurityGroupMessage = {
    val __obj = js.Dynamic.literal(CacheSecurityGroupName = CacheSecurityGroupName.asInstanceOf[js.Any], Description = Description.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateCacheSecurityGroupMessage]
  }
  
  extension [Self <: CreateCacheSecurityGroupMessage](x: Self) {
    
    inline def setCacheSecurityGroupName(value: String): Self = StObject.set(x, "CacheSecurityGroupName", value.asInstanceOf[js.Any])
    
    inline def setDescription(value: String): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
  }
}
