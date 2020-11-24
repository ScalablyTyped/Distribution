package typings.awsSdk.globalacceleratorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListByoipCidrsResponse extends js.Object {
  
  /**
    * Information about your address ranges.
    */
  var ByoipCidrs: js.UndefOr[typings.awsSdk.globalacceleratorMod.ByoipCidrs] = js.native
  
  /**
    * The token for the next page of results.
    */
  var NextToken: js.UndefOr[GenericString] = js.native
}
object ListByoipCidrsResponse {
  
  @scala.inline
  def apply(): ListByoipCidrsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListByoipCidrsResponse]
  }
  
  @scala.inline
  implicit class ListByoipCidrsResponseOps[Self <: ListByoipCidrsResponse] (val x: Self) extends AnyVal {
    
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
    def setByoipCidrsVarargs(value: ByoipCidr*): Self = this.set("ByoipCidrs", js.Array(value :_*))
    
    @scala.inline
    def setByoipCidrs(value: ByoipCidrs): Self = this.set("ByoipCidrs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteByoipCidrs: Self = this.set("ByoipCidrs", js.undefined)
    
    @scala.inline
    def setNextToken(value: GenericString): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
  }
}
