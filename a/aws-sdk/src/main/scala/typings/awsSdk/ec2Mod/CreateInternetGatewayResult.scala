package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateInternetGatewayResult extends js.Object {
  
  /**
    * Information about the internet gateway.
    */
  var InternetGateway: js.UndefOr[typings.awsSdk.ec2Mod.InternetGateway] = js.native
}
object CreateInternetGatewayResult {
  
  @scala.inline
  def apply(): CreateInternetGatewayResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateInternetGatewayResult]
  }
  
  @scala.inline
  implicit class CreateInternetGatewayResultOps[Self <: CreateInternetGatewayResult] (val x: Self) extends AnyVal {
    
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
    def setInternetGateway(value: InternetGateway): Self = this.set("InternetGateway", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInternetGateway: Self = this.set("InternetGateway", js.undefined)
  }
}
