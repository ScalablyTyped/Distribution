package typings.awsSdk.greengrassMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StartBulkDeploymentRequest extends StObject {
  
  /**
    * A client token used to correlate requests and responses.
    */
  var AmznClientToken: js.UndefOr[string] = js.undefined
  
  /**
    * The ARN of the execution role to associate with the bulk deployment operation. This IAM role must allow the ''greengrass:CreateDeployment'' action for all group versions that are listed in the input file. This IAM role must have access to the S3 bucket containing the input file.
    */
  var ExecutionRoleArn: string
  
  /**
    * The URI of the input file contained in the S3 bucket. The execution role must have ''getObject'' permissions on this bucket to access the input file. The input file is a JSON-serialized, line delimited file with UTF-8 encoding that provides a list of group and version IDs and the deployment type. This file must be less than 100 MB. Currently, AWS IoT Greengrass supports only ''NewDeployment'' deployment types.
    */
  var InputFileUri: string
  
  /**
    * Tag(s) to add to the new resource.
    */
  var tags: js.UndefOr[Tags] = js.undefined
}
object StartBulkDeploymentRequest {
  
  @scala.inline
  def apply(ExecutionRoleArn: string, InputFileUri: string): StartBulkDeploymentRequest = {
    val __obj = js.Dynamic.literal(ExecutionRoleArn = ExecutionRoleArn.asInstanceOf[js.Any], InputFileUri = InputFileUri.asInstanceOf[js.Any])
    __obj.asInstanceOf[StartBulkDeploymentRequest]
  }
  
  @scala.inline
  implicit class StartBulkDeploymentRequestMutableBuilder[Self <: StartBulkDeploymentRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAmznClientToken(value: string): Self = StObject.set(x, "AmznClientToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAmznClientTokenUndefined: Self = StObject.set(x, "AmznClientToken", js.undefined)
    
    @scala.inline
    def setExecutionRoleArn(value: string): Self = StObject.set(x, "ExecutionRoleArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInputFileUri(value: string): Self = StObject.set(x, "InputFileUri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTags(value: Tags): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
  }
}
