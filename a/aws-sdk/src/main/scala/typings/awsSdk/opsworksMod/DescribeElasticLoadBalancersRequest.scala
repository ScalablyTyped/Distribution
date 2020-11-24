package typings.awsSdk.opsworksMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeElasticLoadBalancersRequest extends js.Object {
  
  /**
    * A list of layer IDs. The action describes the Elastic Load Balancing instances for the specified layers.
    */
  var LayerIds: js.UndefOr[Strings] = js.native
  
  /**
    * A stack ID. The action describes the stack's Elastic Load Balancing instances.
    */
  var StackId: js.UndefOr[String] = js.native
}
object DescribeElasticLoadBalancersRequest {
  
  @scala.inline
  def apply(): DescribeElasticLoadBalancersRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeElasticLoadBalancersRequest]
  }
  
  @scala.inline
  implicit class DescribeElasticLoadBalancersRequestOps[Self <: DescribeElasticLoadBalancersRequest] (val x: Self) extends AnyVal {
    
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
    def setLayerIdsVarargs(value: String*): Self = this.set("LayerIds", js.Array(value :_*))
    
    @scala.inline
    def setLayerIds(value: Strings): Self = this.set("LayerIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLayerIds: Self = this.set("LayerIds", js.undefined)
    
    @scala.inline
    def setStackId(value: String): Self = this.set("StackId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStackId: Self = this.set("StackId", js.undefined)
  }
}
