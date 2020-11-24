package typings.awsSdk.kafkaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetCompatibleKafkaVersionsRequest extends js.Object {
  
  /**
    * 
    The Amazon Resource Name (ARN) of the cluster check.
    
    */
  var ClusterArn: js.UndefOr[string] = js.native
}
object GetCompatibleKafkaVersionsRequest {
  
  @scala.inline
  def apply(): GetCompatibleKafkaVersionsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetCompatibleKafkaVersionsRequest]
  }
  
  @scala.inline
  implicit class GetCompatibleKafkaVersionsRequestOps[Self <: GetCompatibleKafkaVersionsRequest] (val x: Self) extends AnyVal {
    
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
    def setClusterArn(value: string): Self = this.set("ClusterArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClusterArn: Self = this.set("ClusterArn", js.undefined)
  }
}
