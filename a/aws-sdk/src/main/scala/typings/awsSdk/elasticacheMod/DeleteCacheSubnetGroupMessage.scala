package typings.awsSdk.elasticacheMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
}

