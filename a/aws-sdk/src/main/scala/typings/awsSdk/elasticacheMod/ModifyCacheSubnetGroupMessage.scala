package typings.awsSdk.elasticacheMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ModifyCacheSubnetGroupMessage extends StObject {
  
  /**
    * A description of the cache subnet group.
    */
  var CacheSubnetGroupDescription: js.UndefOr[String] = js.undefined
  
  /**
    * The name for the cache subnet group. This value is stored as a lowercase string. Constraints: Must contain no more than 255 alphanumeric characters or hyphens. Example: mysubnetgroup 
    */
  var CacheSubnetGroupName: String
  
  /**
    * The EC2 subnet IDs for the cache subnet group.
    */
  var SubnetIds: js.UndefOr[SubnetIdentifierList] = js.undefined
}
object ModifyCacheSubnetGroupMessage {
  
  inline def apply(CacheSubnetGroupName: String): ModifyCacheSubnetGroupMessage = {
    val __obj = js.Dynamic.literal(CacheSubnetGroupName = CacheSubnetGroupName.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModifyCacheSubnetGroupMessage]
  }
  
  extension [Self <: ModifyCacheSubnetGroupMessage](x: Self) {
    
    inline def setCacheSubnetGroupDescription(value: String): Self = StObject.set(x, "CacheSubnetGroupDescription", value.asInstanceOf[js.Any])
    
    inline def setCacheSubnetGroupDescriptionUndefined: Self = StObject.set(x, "CacheSubnetGroupDescription", js.undefined)
    
    inline def setCacheSubnetGroupName(value: String): Self = StObject.set(x, "CacheSubnetGroupName", value.asInstanceOf[js.Any])
    
    inline def setSubnetIds(value: SubnetIdentifierList): Self = StObject.set(x, "SubnetIds", value.asInstanceOf[js.Any])
    
    inline def setSubnetIdsUndefined: Self = StObject.set(x, "SubnetIds", js.undefined)
    
    inline def setSubnetIdsVarargs(value: String*): Self = StObject.set(x, "SubnetIds", js.Array(value*))
  }
}
