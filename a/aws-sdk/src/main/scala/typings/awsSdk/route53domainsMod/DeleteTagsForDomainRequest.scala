package typings.awsSdk.route53domainsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeleteTagsForDomainRequest extends js.Object {
  
  /**
    * The domain for which you want to delete one or more tags.
    */
  var DomainName: typings.awsSdk.route53domainsMod.DomainName = js.native
  
  /**
    * A list of tag keys to delete.
    */
  var TagsToDelete: TagKeyList = js.native
}
object DeleteTagsForDomainRequest {
  
  @scala.inline
  def apply(DomainName: DomainName, TagsToDelete: TagKeyList): DeleteTagsForDomainRequest = {
    val __obj = js.Dynamic.literal(DomainName = DomainName.asInstanceOf[js.Any], TagsToDelete = TagsToDelete.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteTagsForDomainRequest]
  }
  
  @scala.inline
  implicit class DeleteTagsForDomainRequestOps[Self <: DeleteTagsForDomainRequest] (val x: Self) extends AnyVal {
    
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
    def setDomainName(value: DomainName): Self = this.set("DomainName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagsToDeleteVarargs(value: TagKey*): Self = this.set("TagsToDelete", js.Array(value :_*))
    
    @scala.inline
    def setTagsToDelete(value: TagKeyList): Self = this.set("TagsToDelete", value.asInstanceOf[js.Any])
  }
}
