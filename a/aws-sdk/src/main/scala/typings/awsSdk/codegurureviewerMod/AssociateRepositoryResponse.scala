package typings.awsSdk.codegurureviewerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AssociateRepositoryResponse extends js.Object {
  
  /**
    * Information about the repository association.
    */
  var RepositoryAssociation: js.UndefOr[typings.awsSdk.codegurureviewerMod.RepositoryAssociation] = js.native
  
  /**
    *  An array of key-value pairs used to tag an associated repository. A tag is a custom attribute label with two parts:    A tag key (for example, CostCenter, Environment, Project, or Secret). Tag keys are case sensitive.   An optional field known as a tag value (for example, 111122223333, Production, or a team name). Omitting the tag value is the same as using an empty string. Like tag keys, tag values are case sensitive.  
    */
  var Tags: js.UndefOr[TagMap] = js.native
}
object AssociateRepositoryResponse {
  
  @scala.inline
  def apply(): AssociateRepositoryResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AssociateRepositoryResponse]
  }
  
  @scala.inline
  implicit class AssociateRepositoryResponseOps[Self <: AssociateRepositoryResponse] (val x: Self) extends AnyVal {
    
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
    def setRepositoryAssociation(value: RepositoryAssociation): Self = this.set("RepositoryAssociation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRepositoryAssociation: Self = this.set("RepositoryAssociation", js.undefined)
    
    @scala.inline
    def setTags(value: TagMap): Self = this.set("Tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTags: Self = this.set("Tags", js.undefined)
  }
}
