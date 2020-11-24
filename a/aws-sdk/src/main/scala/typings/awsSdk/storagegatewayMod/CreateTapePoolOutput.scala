package typings.awsSdk.storagegatewayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateTapePoolOutput extends js.Object {
  
  /**
    * The unique Amazon Resource Name (ARN) that represents the custom tape pool. Use the ListTapePools operation to return a list of tape pools for your account and AWS Region.
    */
  var PoolARN: js.UndefOr[typings.awsSdk.storagegatewayMod.PoolARN] = js.native
}
object CreateTapePoolOutput {
  
  @scala.inline
  def apply(): CreateTapePoolOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateTapePoolOutput]
  }
  
  @scala.inline
  implicit class CreateTapePoolOutputOps[Self <: CreateTapePoolOutput] (val x: Self) extends AnyVal {
    
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
