package typings.awsSdk.connectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DisassociateLambdaFunctionRequest extends js.Object {
  
  /**
    * The Amazon Resource Name (ARN) of the Lambda function being disassociated.
    */
  var FunctionArn: typings.awsSdk.connectMod.FunctionArn = js.native
  
  /**
    * The identifier of the Amazon Connect instance..
    */
  var InstanceId: typings.awsSdk.connectMod.InstanceId = js.native
}
object DisassociateLambdaFunctionRequest {
  
  @scala.inline
  def apply(FunctionArn: FunctionArn, InstanceId: InstanceId): DisassociateLambdaFunctionRequest = {
    val __obj = js.Dynamic.literal(FunctionArn = FunctionArn.asInstanceOf[js.Any], InstanceId = InstanceId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DisassociateLambdaFunctionRequest]
  }
  
  @scala.inline
  implicit class DisassociateLambdaFunctionRequestOps[Self <: DisassociateLambdaFunctionRequest] (val x: Self) extends AnyVal {
    
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
    def setFunctionArn(value: FunctionArn): Self = this.set("FunctionArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInstanceId(value: InstanceId): Self = this.set("InstanceId", value.asInstanceOf[js.Any])
  }
}
