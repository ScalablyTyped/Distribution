package typings.awsSdk.kafkaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeClusterOperationResponse extends js.Object {
  
  /**
    * 
    Cluster operation information
    
    */
  var ClusterOperationInfo: js.UndefOr[typings.awsSdk.kafkaMod.ClusterOperationInfo] = js.native
}
object DescribeClusterOperationResponse {
  
  @scala.inline
  def apply(): DescribeClusterOperationResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeClusterOperationResponse]
  }
  
  @scala.inline
  implicit class DescribeClusterOperationResponseOps[Self <: DescribeClusterOperationResponse] (val x: Self) extends AnyVal {
    
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
    def setClusterOperationInfo(value: ClusterOperationInfo): Self = this.set("ClusterOperationInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClusterOperationInfo: Self = this.set("ClusterOperationInfo", js.undefined)
  }
}
