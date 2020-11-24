package typings.awsSdk.elasticacheMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReservedCacheNodeMessage extends js.Object {
  
  /**
    * Provides an identifier to allow retrieval of paginated results.
    */
  var Marker: js.UndefOr[String] = js.native
  
  /**
    * A list of reserved cache nodes. Each element in the list contains detailed information about one node.
    */
  var ReservedCacheNodes: js.UndefOr[ReservedCacheNodeList] = js.native
}
object ReservedCacheNodeMessage {
  
  @scala.inline
  def apply(): ReservedCacheNodeMessage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReservedCacheNodeMessage]
  }
  
  @scala.inline
  implicit class ReservedCacheNodeMessageOps[Self <: ReservedCacheNodeMessage] (val x: Self) extends AnyVal {
    
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
    def setMarker(value: String): Self = this.set("Marker", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMarker: Self = this.set("Marker", js.undefined)
    
    @scala.inline
    def setReservedCacheNodesVarargs(value: ReservedCacheNode*): Self = this.set("ReservedCacheNodes", js.Array(value :_*))
    
    @scala.inline
    def setReservedCacheNodes(value: ReservedCacheNodeList): Self = this.set("ReservedCacheNodes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReservedCacheNodes: Self = this.set("ReservedCacheNodes", js.undefined)
  }
}
