package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ClientConnectOptions extends js.Object {
  
  /**
    * Indicates whether client connect options are enabled. The default is false (not enabled).
    */
  var Enabled: js.UndefOr[Boolean] = js.native
  
  /**
    * The Amazon Resource Name (ARN) of the AWS Lambda function used for connection authorization.
    */
  var LambdaFunctionArn: js.UndefOr[String] = js.native
}
object ClientConnectOptions {
  
  @scala.inline
  def apply(): ClientConnectOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ClientConnectOptions]
  }
  
  @scala.inline
  implicit class ClientConnectOptionsOps[Self <: ClientConnectOptions] (val x: Self) extends AnyVal {
    
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
    def setEnabled(value: Boolean): Self = this.set("Enabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnabled: Self = this.set("Enabled", js.undefined)
    
    @scala.inline
    def setLambdaFunctionArn(value: String): Self = this.set("LambdaFunctionArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLambdaFunctionArn: Self = this.set("LambdaFunctionArn", js.undefined)
  }
}
