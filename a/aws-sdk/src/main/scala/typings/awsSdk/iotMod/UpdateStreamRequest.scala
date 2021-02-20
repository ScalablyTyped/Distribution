package typings.awsSdk.iotMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateStreamRequest extends StObject {
  
  /**
    * The description of the stream.
    */
  var description: js.UndefOr[StreamDescription] = js.native
  
  /**
    * The files associated with the stream.
    */
  var files: js.UndefOr[StreamFiles] = js.native
  
  /**
    * An IAM role that allows the IoT service principal assumes to access your S3 files.
    */
  var roleArn: js.UndefOr[RoleArn] = js.native
  
  /**
    * The stream ID.
    */
  var streamId: StreamId = js.native
}
object UpdateStreamRequest {
  
  @scala.inline
  def apply(streamId: StreamId): UpdateStreamRequest = {
    val __obj = js.Dynamic.literal(streamId = streamId.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateStreamRequest]
  }
  
  @scala.inline
  implicit class UpdateStreamRequestMutableBuilder[Self <: UpdateStreamRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDescription(value: StreamDescription): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    @scala.inline
    def setFiles(value: StreamFiles): Self = StObject.set(x, "files", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilesUndefined: Self = StObject.set(x, "files", js.undefined)
    
    @scala.inline
    def setFilesVarargs(value: StreamFile*): Self = StObject.set(x, "files", js.Array(value :_*))
    
    @scala.inline
    def setRoleArn(value: RoleArn): Self = StObject.set(x, "roleArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRoleArnUndefined: Self = StObject.set(x, "roleArn", js.undefined)
    
    @scala.inline
    def setStreamId(value: StreamId): Self = StObject.set(x, "streamId", value.asInstanceOf[js.Any])
  }
}
