package typings.awsSdk.elasticacheMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteCacheParameterGroupMessage extends js.Object {
  /**
    * The name of the cache parameter group to delete.  The specified cache security group must not be associated with any clusters. 
    */
  var CacheParameterGroupName: String = js.native
}

object DeleteCacheParameterGroupMessage {
  @scala.inline
  def apply(CacheParameterGroupName: String): DeleteCacheParameterGroupMessage = {
    val __obj = js.Dynamic.literal(CacheParameterGroupName = CacheParameterGroupName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteCacheParameterGroupMessage]
  }
}

