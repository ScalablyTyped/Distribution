package typings.awsSdk.ssmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListAssociationVersionsResult extends js.Object {
  
  /**
    * Information about all versions of the association for the specified association ID.
    */
  var AssociationVersions: js.UndefOr[AssociationVersionList] = js.native
  
  /**
    * The token for the next set of items to return. Use this token to get the next set of results.
    */
  var NextToken: js.UndefOr[typings.awsSdk.ssmMod.NextToken] = js.native
}
object ListAssociationVersionsResult {
  
  @scala.inline
  def apply(): ListAssociationVersionsResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListAssociationVersionsResult]
  }
  
  @scala.inline
  implicit class ListAssociationVersionsResultOps[Self <: ListAssociationVersionsResult] (val x: Self) extends AnyVal {
    
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
    def setAssociationVersionsVarargs(value: AssociationVersionInfo*): Self = this.set("AssociationVersions", js.Array(value :_*))
    
    @scala.inline
    def setAssociationVersions(value: AssociationVersionList): Self = this.set("AssociationVersions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAssociationVersions: Self = this.set("AssociationVersions", js.undefined)
    
    @scala.inline
    def setNextToken(value: NextToken): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
  }
}
