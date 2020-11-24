package typings.cacheManagerIoredis.mod.CacheManagerIORedis

import typings.ioredis.mod.ClusterNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ClusterOptions extends js.Object {
  
  var nodes: js.Array[ClusterNode] = js.native
  
  var options: typings.ioredis.mod.ClusterOptions = js.native
}
object ClusterOptions {
  
  @scala.inline
  def apply(nodes: js.Array[ClusterNode], options: typings.ioredis.mod.ClusterOptions): ClusterOptions = {
    val __obj = js.Dynamic.literal(nodes = nodes.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClusterOptions]
  }
  
  @scala.inline
  implicit class ClusterOptionsOps[Self <: ClusterOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setNodesVarargs(value: ClusterNode*): Self = this.set("nodes", js.Array(value :_*))
    
    @scala.inline
    def setNodes(value: js.Array[ClusterNode]): Self = this.set("nodes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOptions(value: typings.ioredis.mod.ClusterOptions): Self = this.set("options", value.asInstanceOf[js.Any])
  }
}
