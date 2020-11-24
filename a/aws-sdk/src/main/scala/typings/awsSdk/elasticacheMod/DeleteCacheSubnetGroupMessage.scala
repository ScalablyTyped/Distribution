package typings.awsSdk.elasticacheMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeleteCacheSubnetGroupMessage extends js.Object {
  
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
  implicit class DeleteCacheSubnetGroupMessageOps[Self <: DeleteCacheSubnetGroupMessage] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setCacheSubnetGroupName(value: String): Self = this.set("CacheSubnetGroupName", value.asInstanceOf[js.Any])
  }
}
