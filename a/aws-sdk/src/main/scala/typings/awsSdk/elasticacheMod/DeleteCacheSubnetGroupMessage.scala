package typings.awsSdk.elasticacheMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeleteCacheSubnetGroupMessage extends StObject {
  
  /**
    * The name of the cache subnet group to delete. Constraints: Must contain no more than 255 alphanumeric characters or hyphens.
    */
  var CacheSubnetGroupName: String = js.native
}
object DeleteCacheSubnetGroupMessage {
  
  @scala.inline
  def apply(CacheSubnetGroupName: String): DeleteCacheSubnetGroupMessage = {
    val __obj = js.Dynamic.literal(CacheSubnetGroupName = CacheSubnetGroupName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteCacheSubnetGroupMessage]
  }
  
  @scala.inline
  implicit class DeleteCacheSubnetGroupMessageMutableBuilder[Self <: DeleteCacheSubnetGroupMessage] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCacheSubnetGroupName(value: String): Self = StObject.set(x, "CacheSubnetGroupName", value.asInstanceOf[js.Any])
  }
}
