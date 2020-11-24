package typings.awsSdk.mqMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateBrokerResponse extends js.Object {
  
  /**
    * The Amazon Resource Name (ARN) of the broker.
    */
  var BrokerArn: js.UndefOr[string] = js.native
  
  /**
    * The unique ID that Amazon MQ generates for the broker.
    */
  var BrokerId: js.UndefOr[string] = js.native
}
object CreateBrokerResponse {
  
  @scala.inline
  def apply(): CreateBrokerResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateBrokerResponse]
  }
  
  @scala.inline
  implicit class CreateBrokerResponseOps[Self <: CreateBrokerResponse] (val x: Self) extends AnyVal {
    
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
    def setBrokerArn(value: string): Self = this.set("BrokerArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBrokerArn: Self = this.set("BrokerArn", js.undefined)
    
    @scala.inline
    def setBrokerId(value: string): Self = this.set("BrokerId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBrokerId: Self = this.set("BrokerId", js.undefined)
  }
}
