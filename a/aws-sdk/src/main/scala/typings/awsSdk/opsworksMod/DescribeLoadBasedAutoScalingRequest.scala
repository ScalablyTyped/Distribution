package typings.awsSdk.opsworksMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeLoadBasedAutoScalingRequest extends js.Object {
  
  /**
    * An array of layer IDs.
    */
  var LayerIds: Strings = js.native
}
object DescribeLoadBasedAutoScalingRequest {
  
  @scala.inline
  def apply(LayerIds: Strings): DescribeLoadBasedAutoScalingRequest = {
    val __obj = js.Dynamic.literal(LayerIds = LayerIds.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeLoadBasedAutoScalingRequest]
  }
  
  @scala.inline
  implicit class DescribeLoadBasedAutoScalingRequestOps[Self <: DescribeLoadBasedAutoScalingRequest] (val x: Self) extends AnyVal {
    
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
  }
}
