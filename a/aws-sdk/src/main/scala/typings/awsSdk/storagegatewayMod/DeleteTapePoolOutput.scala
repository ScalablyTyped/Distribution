package typings.awsSdk.storagegatewayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeleteTapePoolOutput extends js.Object {
  
  /**
    * The Amazon Resource Name (ARN) of the custom tape pool being deleted.
    */
  var PoolARN: js.UndefOr[typings.awsSdk.storagegatewayMod.PoolARN] = js.native
}
object DeleteTapePoolOutput {
  
  @scala.inline
  def apply(): DeleteTapePoolOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteTapePoolOutput]
  }
  
  @scala.inline
  implicit class DeleteTapePoolOutputOps[Self <: DeleteTapePoolOutput] (val x: Self) extends AnyVal {
    
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
    def setPoolARN(value: PoolARN): Self = this.set("PoolARN", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePoolARN: Self = this.set("PoolARN", js.undefined)
  }
}
