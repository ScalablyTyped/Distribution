package typings.awsSdk.directconnectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeTagsRequest extends js.Object {
  
  /**
    * The Amazon Resource Names (ARNs) of the resources.
    */
  var resourceArns: ResourceArnList = js.native
}
object DescribeTagsRequest {
  
  @scala.inline
  def apply(resourceArns: ResourceArnList): DescribeTagsRequest = {
    val __obj = js.Dynamic.literal(resourceArns = resourceArns.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeTagsRequest]
  }
  
  @scala.inline
  implicit class DescribeTagsRequestOps[Self <: DescribeTagsRequest] (val x: Self) extends AnyVal {
    
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
    def setResourceArnsVarargs(value: ResourceArn*): Self = this.set("resourceArns", js.Array(value :_*))
    
    @scala.inline
    def setResourceArns(value: ResourceArnList): Self = this.set("resourceArns", value.asInstanceOf[js.Any])
  }
}
