package typings.awsSdk.kafkaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeClusterResponse extends js.Object {
  
  /**
    * 
    The cluster information.
    
    */
  var ClusterInfo: js.UndefOr[typings.awsSdk.kafkaMod.ClusterInfo] = js.native
}
object DescribeClusterResponse {
  
  @scala.inline
  def apply(): DescribeClusterResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeClusterResponse]
  }
  
  @scala.inline
  implicit class DescribeClusterResponseOps[Self <: DescribeClusterResponse] (val x: Self) extends AnyVal {
    
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
    def setClusterInfo(value: ClusterInfo): Self = this.set("ClusterInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClusterInfo: Self = this.set("ClusterInfo", js.undefined)
  }
}
