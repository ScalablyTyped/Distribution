package typings.awsSdk.clouddirectoryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BatchListObjectParentsResponse extends js.Object {
  
  var NextToken: js.UndefOr[typings.awsSdk.clouddirectoryMod.NextToken] = js.native
  
  var ParentLinks: js.UndefOr[ObjectIdentifierAndLinkNameList] = js.native
}
object BatchListObjectParentsResponse {
  
  @scala.inline
  def apply(): BatchListObjectParentsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BatchListObjectParentsResponse]
  }
  
  @scala.inline
  implicit class BatchListObjectParentsResponseOps[Self <: BatchListObjectParentsResponse] (val x: Self) extends AnyVal {
    
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
    def setNextToken(value: NextToken): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
    
    @scala.inline
    def setParentLinksVarargs(value: ObjectIdentifierAndLinkNameTuple*): Self = this.set("ParentLinks", js.Array(value :_*))
    
    @scala.inline
    def setParentLinks(value: ObjectIdentifierAndLinkNameList): Self = this.set("ParentLinks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteParentLinks: Self = this.set("ParentLinks", js.undefined)
  }
}
