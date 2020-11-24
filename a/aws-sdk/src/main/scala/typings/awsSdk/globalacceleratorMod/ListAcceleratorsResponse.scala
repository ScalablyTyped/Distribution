package typings.awsSdk.globalacceleratorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListAcceleratorsResponse extends js.Object {
  
  /**
    * The list of accelerators for a customer account.
    */
  var Accelerators: js.UndefOr[typings.awsSdk.globalacceleratorMod.Accelerators] = js.native
  
  /**
    * The token for the next set of results. You receive this token from a previous call.
    */
  var NextToken: js.UndefOr[GenericString] = js.native
}
object ListAcceleratorsResponse {
  
  @scala.inline
  def apply(): ListAcceleratorsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListAcceleratorsResponse]
  }
  
  @scala.inline
  implicit class ListAcceleratorsResponseOps[Self <: ListAcceleratorsResponse] (val x: Self) extends AnyVal {
    
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
    def setAcceleratorsVarargs(value: Accelerator*): Self = this.set("Accelerators", js.Array(value :_*))
    
    @scala.inline
    def setAccelerators(value: Accelerators): Self = this.set("Accelerators", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAccelerators: Self = this.set("Accelerators", js.undefined)
    
    @scala.inline
    def setNextToken(value: GenericString): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
  }
}
