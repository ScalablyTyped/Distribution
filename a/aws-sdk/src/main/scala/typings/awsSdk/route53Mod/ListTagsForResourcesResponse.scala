package typings.awsSdk.route53Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListTagsForResourcesResponse extends js.Object {
  
  /**
    * A list of ResourceTagSets containing tags associated with the specified resources.
    */
  var ResourceTagSets: ResourceTagSetList = js.native
}
object ListTagsForResourcesResponse {
  
  @scala.inline
  def apply(ResourceTagSets: ResourceTagSetList): ListTagsForResourcesResponse = {
    val __obj = js.Dynamic.literal(ResourceTagSets = ResourceTagSets.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListTagsForResourcesResponse]
  }
  
  @scala.inline
  implicit class ListTagsForResourcesResponseOps[Self <: ListTagsForResourcesResponse] (val x: Self) extends AnyVal {
    
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
    def setResourceTagSetsVarargs(value: ResourceTagSet*): Self = this.set("ResourceTagSets", js.Array(value :_*))
    
    @scala.inline
    def setResourceTagSets(value: ResourceTagSetList): Self = this.set("ResourceTagSets", value.asInstanceOf[js.Any])
  }
}
