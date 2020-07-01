package typings.cacheManagerIoredis.mod.CacheManagerIORedis

import typings.ioredis.mod.ClusterNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ClusterOptions extends js.Object {
  var nodes: js.Array[ClusterNode]
  var options: typings.ioredis.mod.ClusterOptions
}

object ClusterOptions {
  @scala.inline
  def apply(nodes: js.Array[ClusterNode], options: typings.ioredis.mod.ClusterOptions): ClusterOptions = {
    val __obj = js.Dynamic.literal(nodes = nodes.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClusterOptions]
  }
}

