package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ClientConnectOptions extends StObject {
  
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
  implicit class ClientConnectOptionsMutableBuilder[Self <: ClientConnectOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEnabled(value: Boolean): Self = StObject.set(x, "Enabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnabledUndefined: Self = StObject.set(x, "Enabled", js.undefined)
    
    @scala.inline
    def setLambdaFunctionArn(value: String): Self = StObject.set(x, "LambdaFunctionArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLambdaFunctionArnUndefined: Self = StObject.set(x, "LambdaFunctionArn", js.undefined)
  }
}
