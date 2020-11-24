package typings.awsSdk.timestreamqueryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CancelQueryResponse extends js.Object {
  
  /**
    *  A CancellationMessage is returned when a CancelQuery request for the query specified by QueryId has already been issued. 
    */
  var CancellationMessage: js.UndefOr[String] = js.native
}
object CancelQueryResponse {
  
  @scala.inline
  def apply(): CancelQueryResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CancelQueryResponse]
  }
  
  @scala.inline
  implicit class CancelQueryResponseOps[Self <: CancelQueryResponse] (val x: Self) extends AnyVal {
    
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
    def setCancellationMessage(value: String): Self = this.set("CancellationMessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCancellationMessage: Self = this.set("CancellationMessage", js.undefined)
  }
}
