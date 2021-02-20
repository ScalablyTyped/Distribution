package typings.awsSdk.kinesisanalyticsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InputLambdaProcessorUpdate extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the new AWS Lambda function that is used to preprocess the records in the stream.  To specify an earlier version of the Lambda function than the latest, include the Lambda function version in the Lambda function ARN. For more information about Lambda ARNs, see Example ARNs: AWS Lambda  
    */
  var ResourceARNUpdate: js.UndefOr[ResourceARN] = js.native
  
  /**
    * The ARN of the new IAM role that is used to access the AWS Lambda function.
    */
  var RoleARNUpdate: js.UndefOr[RoleARN] = js.native
}
object InputLambdaProcessorUpdate {
  
  @scala.inline
  def apply(): InputLambdaProcessorUpdate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InputLambdaProcessorUpdate]
  }
  
  @scala.inline
  implicit class InputLambdaProcessorUpdateMutableBuilder[Self <: InputLambdaProcessorUpdate] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setResourceARNUpdate(value: ResourceARN): Self = StObject.set(x, "ResourceARNUpdate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceARNUpdateUndefined: Self = StObject.set(x, "ResourceARNUpdate", js.undefined)
    
    @scala.inline
    def setRoleARNUpdate(value: RoleARN): Self = StObject.set(x, "RoleARNUpdate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRoleARNUpdateUndefined: Self = StObject.set(x, "RoleARNUpdate", js.undefined)
  }
}
