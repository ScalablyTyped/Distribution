package typings.awsSdk.networkmanagerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetLinkAssociationsResponse extends js.Object {
  
  /**
    * The link associations.
    */
  var LinkAssociations: js.UndefOr[LinkAssociationList] = js.native
  
  /**
    * The token for the next page of results.
    */
  var NextToken: js.UndefOr[String] = js.native
}
object GetLinkAssociationsResponse {
  
  @scala.inline
  def apply(): GetLinkAssociationsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetLinkAssociationsResponse]
  }
  
  @scala.inline
  implicit class GetLinkAssociationsResponseOps[Self <: GetLinkAssociationsResponse] (val x: Self) extends AnyVal {
    
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
    def setLinkAssociationsVarargs(value: LinkAssociation*): Self = this.set("LinkAssociations", js.Array(value :_*))
    
    @scala.inline
    def setLinkAssociations(value: LinkAssociationList): Self = this.set("LinkAssociations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLinkAssociations: Self = this.set("LinkAssociations", js.undefined)
    
    @scala.inline
    def setNextToken(value: String): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
  }
}
