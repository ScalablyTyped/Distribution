package typings.awsSdk.servicediscoveryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetOperationResponse extends js.Object {
  
  /**
    * A complex type that contains information about the operation.
    */
  var Operation: js.UndefOr[typings.awsSdk.servicediscoveryMod.Operation] = js.native
}
object GetOperationResponse {
  
  @scala.inline
  def apply(): GetOperationResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetOperationResponse]
  }
  
  @scala.inline
  implicit class GetOperationResponseOps[Self <: GetOperationResponse] (val x: Self) extends AnyVal {
    
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
    def setOperation(value: Operation): Self = this.set("Operation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOperation: Self = this.set("Operation", js.undefined)
  }
}
