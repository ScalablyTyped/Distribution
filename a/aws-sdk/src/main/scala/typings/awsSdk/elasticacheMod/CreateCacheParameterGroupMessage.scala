package typings.awsSdk.elasticacheMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateCacheParameterGroupMessage extends js.Object {
  /**
    * The name of the cache parameter group family that the cache parameter group can be used with. Valid values are: memcached1.4 | memcached1.5 | redis2.6 | redis2.8 | redis3.2 | redis4.0 | redis5.0 | 
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
}

