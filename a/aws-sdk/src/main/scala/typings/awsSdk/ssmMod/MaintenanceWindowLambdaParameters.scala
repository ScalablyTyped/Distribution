package typings.awsSdk.ssmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MaintenanceWindowLambdaParameters extends js.Object {
  
  /**
    * Pass client-specific information to the Lambda function that you are invoking. You can then process the client information in your Lambda function as you choose through the context variable.
    */
  var ClientContext: js.UndefOr[MaintenanceWindowLambdaClientContext] = js.native
  
  /**
    * JSON to provide to your Lambda function as input.
    */
  var Payload: js.UndefOr[MaintenanceWindowLambdaPayload] = js.native
  
  /**
    * (Optional) Specify a Lambda function version or alias name. If you specify a function version, the action uses the qualified function ARN to invoke a specific Lambda function. If you specify an alias name, the action uses the alias ARN to invoke the Lambda function version to which the alias points.
    */
  var Qualifier: js.UndefOr[MaintenanceWindowLambdaQualifier] = js.native
}
object MaintenanceWindowLambdaParameters {
  
  @scala.inline
  def apply(): MaintenanceWindowLambdaParameters = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MaintenanceWindowLambdaParameters]
  }
  
  @scala.inline
  implicit class MaintenanceWindowLambdaParametersOps[Self <: MaintenanceWindowLambdaParameters] (val x: Self) extends AnyVal {
    
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
    def setClientContext(value: MaintenanceWindowLambdaClientContext): Self = this.set("ClientContext", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClientContext: Self = this.set("ClientContext", js.undefined)
    
    @scala.inline
    def setPayload(value: MaintenanceWindowLambdaPayload): Self = this.set("Payload", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePayload: Self = this.set("Payload", js.undefined)
    
    @scala.inline
    def setQualifier(value: MaintenanceWindowLambdaQualifier): Self = this.set("Qualifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteQualifier: Self = this.set("Qualifier", js.undefined)
  }
}
