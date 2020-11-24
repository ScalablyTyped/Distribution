package typings.awsSdk.wafv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListResourcesForWebACLResponse extends js.Object {
  
  /**
    * The array of Amazon Resource Names (ARNs) of the associated resources.
    */
  var ResourceArns: js.UndefOr[typings.awsSdk.wafv2Mod.ResourceArns] = js.native
}
object ListResourcesForWebACLResponse {
  
  @scala.inline
  def apply(): ListResourcesForWebACLResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListResourcesForWebACLResponse]
  }
  
  @scala.inline
  implicit class ListResourcesForWebACLResponseOps[Self <: ListResourcesForWebACLResponse] (val x: Self) extends AnyVal {
    
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
    def setResourceArnsVarargs(value: ResourceArn*): Self = this.set("ResourceArns", js.Array(value :_*))
    
    @scala.inline
    def setResourceArns(value: ResourceArns): Self = this.set("ResourceArns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResourceArns: Self = this.set("ResourceArns", js.undefined)
  }
}
