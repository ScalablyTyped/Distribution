package typings.awsSdk.outpostsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListSitesOutput extends js.Object {
  
  var NextToken: js.UndefOr[Token] = js.native
  
  var Sites: js.UndefOr[siteListDefinition] = js.native
}
object ListSitesOutput {
  
  @scala.inline
  def apply(): ListSitesOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListSitesOutput]
  }
  
  @scala.inline
  implicit class ListSitesOutputOps[Self <: ListSitesOutput] (val x: Self) extends AnyVal {
    
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
    def setNextToken(value: Token): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
    
    @scala.inline
    def setSitesVarargs(value: Site*): Self = this.set("Sites", js.Array(value :_*))
    
    @scala.inline
    def setSites(value: siteListDefinition): Self = this.set("Sites", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSites: Self = this.set("Sites", js.undefined)
  }
}
