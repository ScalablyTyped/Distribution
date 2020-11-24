package typings.awsSdk.storagegatewayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeleteTapePoolInput extends js.Object {
  
  /**
    * The Amazon Resource Name (ARN) of the custom tape pool to delete.
    */
  var PoolARN: typings.awsSdk.storagegatewayMod.PoolARN = js.native
}
object DeleteTapePoolInput {
  
  @scala.inline
  def apply(PoolARN: PoolARN): DeleteTapePoolInput = {
    val __obj = js.Dynamic.literal(PoolARN = PoolARN.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteTapePoolInput]
  }
  
  @scala.inline
  implicit class DeleteTapePoolInputOps[Self <: DeleteTapePoolInput] (val x: Self) extends AnyVal {
    
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
  }
}
