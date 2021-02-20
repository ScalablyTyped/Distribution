package typings.awsSdk.discoveryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StartImportTaskRequest extends StObject {
  
  /**
    * Optional. A unique token that you can provide to prevent the same import request from occurring more than once. If you don't provide a token, a token is automatically generated. Sending more than one StartImportTask request with the same client request token will return information about the original import task with that client request token.
    */
  var clientRequestToken: js.UndefOr[ClientRequestToken] = js.native
  
  /**
    * The URL for your import file that you've uploaded to Amazon S3.  If you're using the AWS CLI, this URL is structured as follows: s3://BucketName/ImportFileName.CSV  
    */
  var importUrl: ImportURL = js.native
  
  /**
    * A descriptive name for this request. You can use this name to filter future requests related to this import task, such as identifying applications and servers that were included in this import task. We recommend that you use a meaningful name for each import task.
    */
  var name: ImportTaskName = js.native
}
object StartImportTaskRequest {
  
  @scala.inline
  def apply(importUrl: ImportURL, name: ImportTaskName): StartImportTaskRequest = {
    val __obj = js.Dynamic.literal(importUrl = importUrl.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[StartImportTaskRequest]
  }
  
  @scala.inline
  implicit class StartImportTaskRequestMutableBuilder[Self <: StartImportTaskRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClientRequestToken(value: ClientRequestToken): Self = StObject.set(x, "clientRequestToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClientRequestTokenUndefined: Self = StObject.set(x, "clientRequestToken", js.undefined)
    
    @scala.inline
    def setImportUrl(value: ImportURL): Self = StObject.set(x, "importUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: ImportTaskName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
