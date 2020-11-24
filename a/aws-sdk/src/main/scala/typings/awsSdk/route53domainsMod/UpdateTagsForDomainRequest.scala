package typings.awsSdk.route53domainsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateTagsForDomainRequest extends js.Object {
  
  /**
    * The domain for which you want to add or update tags.
    */
  var DomainName: typings.awsSdk.route53domainsMod.DomainName = js.native
  
  /**
    * A list of the tag keys and values that you want to add or update. If you specify a key that already exists, the corresponding value will be replaced.
    */
  var TagsToUpdate: js.UndefOr[TagList] = js.native
}
object UpdateTagsForDomainRequest {
  
  @scala.inline
  def apply(DomainName: DomainName): UpdateTagsForDomainRequest = {
    val __obj = js.Dynamic.literal(DomainName = DomainName.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateTagsForDomainRequest]
  }
  
  @scala.inline
  implicit class UpdateTagsForDomainRequestOps[Self <: UpdateTagsForDomainRequest] (val x: Self) extends AnyVal {
    
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
    def setTagsToUpdateVarargs(value: Tag*): Self = this.set("TagsToUpdate", js.Array(value :_*))
    
    @scala.inline
    def setTagsToUpdate(value: TagList): Self = this.set("TagsToUpdate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTagsToUpdate: Self = this.set("TagsToUpdate", js.undefined)
  }
}
