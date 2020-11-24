package typings.awsSdk.globalacceleratorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListListenersResponse extends js.Object {
  
  /**
    * The list of listeners for an accelerator.
    */
  var Listeners: js.UndefOr[typings.awsSdk.globalacceleratorMod.Listeners] = js.native
  
  /**
    * The token for the next set of results. You receive this token from a previous call.
    */
  var NextToken: js.UndefOr[GenericString] = js.native
}
object ListListenersResponse {
  
  @scala.inline
  def apply(): ListListenersResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListListenersResponse]
  }
  
  @scala.inline
  implicit class ListListenersResponseOps[Self <: ListListenersResponse] (val x: Self) extends AnyVal {
    
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
    def setListenersVarargs(value: Listener*): Self = this.set("Listeners", js.Array(value :_*))
    
    @scala.inline
    def setListeners(value: Listeners): Self = this.set("Listeners", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteListeners: Self = this.set("Listeners", js.undefined)
    
    @scala.inline
    def setNextToken(value: GenericString): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
  }
}
