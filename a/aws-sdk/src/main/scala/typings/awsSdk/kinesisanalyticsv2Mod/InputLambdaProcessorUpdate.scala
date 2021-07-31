package typings.awsSdk.kinesisanalyticsv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InputLambdaProcessorUpdate extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the new AWS Lambda function that is used to preprocess the records in the stream.  To specify an earlier version of the Lambda function than the latest, include the Lambda function version in the Lambda function ARN. For more information about Lambda ARNs, see Example ARNs: AWS Lambda  
    */
  var ResourceARNUpdate: ResourceARN
}
object InputLambdaProcessorUpdate {
  
  @scala.inline
  def apply(ResourceARNUpdate: ResourceARN): InputLambdaProcessorUpdate = {
    val __obj = js.Dynamic.literal(ResourceARNUpdate = ResourceARNUpdate.asInstanceOf[js.Any])
    __obj.asInstanceOf[InputLambdaProcessorUpdate]
  }
  
  @scala.inline
  implicit class InputLambdaProcessorUpdateMutableBuilder[Self <: InputLambdaProcessorUpdate] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setResourceARNUpdate(value: ResourceARN): Self = StObject.set(x, "ResourceARNUpdate", value.asInstanceOf[js.Any])
  }
}
