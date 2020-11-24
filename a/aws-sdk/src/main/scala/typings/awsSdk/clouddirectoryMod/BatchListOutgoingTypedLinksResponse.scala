package typings.awsSdk.clouddirectoryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BatchListOutgoingTypedLinksResponse extends js.Object {
  
  /**
    * The pagination token.
    */
  var NextToken: js.UndefOr[typings.awsSdk.clouddirectoryMod.NextToken] = js.native
  
  /**
    * Returns a typed link specifier as output.
    */
  var TypedLinkSpecifiers: js.UndefOr[TypedLinkSpecifierList] = js.native
}
object BatchListOutgoingTypedLinksResponse {
  
  @scala.inline
  def apply(): BatchListOutgoingTypedLinksResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BatchListOutgoingTypedLinksResponse]
  }
  
  @scala.inline
  implicit class BatchListOutgoingTypedLinksResponseOps[Self <: BatchListOutgoingTypedLinksResponse] (val x: Self) extends AnyVal {
    
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
    def setTypedLinkSpecifiersVarargs(value: TypedLinkSpecifier*): Self = this.set("TypedLinkSpecifiers", js.Array(value :_*))
    
    @scala.inline
    def setTypedLinkSpecifiers(value: TypedLinkSpecifierList): Self = this.set("TypedLinkSpecifiers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTypedLinkSpecifiers: Self = this.set("TypedLinkSpecifiers", js.undefined)
  }
}
