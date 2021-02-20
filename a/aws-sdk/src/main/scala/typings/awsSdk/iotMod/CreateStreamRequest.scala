package typings.awsSdk.iotMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateStreamRequest extends StObject {
  
  /**
    * A description of the stream.
    */
  var description: js.UndefOr[StreamDescription] = js.native
  
  /**
    * The files to stream.
    */
  var files: StreamFiles = js.native
  
  /**
    * An IAM role that allows the IoT service principal assumes to access your S3 files.
    */
  var roleArn: RoleArn = js.native
  
  /**
    * The stream ID.
    */
  var streamId: StreamId = js.native
  
  /**
    * Metadata which can be used to manage streams.
    */
  var tags: js.UndefOr[TagList] = js.native
}
object CreateStreamRequest {
  
  @scala.inline
  def apply(files: StreamFiles, roleArn: RoleArn, streamId: StreamId): CreateStreamRequest = {
    val __obj = js.Dynamic.literal(files = files.asInstanceOf[js.Any], roleArn = roleArn.asInstanceOf[js.Any], streamId = streamId.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateStreamRequest]
  }
  
  @scala.inline
  implicit class CreateStreamRequestMutableBuilder[Self <: CreateStreamRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDescription(value: StreamDescription): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    @scala.inline
    def setFiles(value: StreamFiles): Self = StObject.set(x, "files", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilesVarargs(value: StreamFile*): Self = StObject.set(x, "files", js.Array(value :_*))
    
    @scala.inline
    def setRoleArn(value: RoleArn): Self = StObject.set(x, "roleArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStreamId(value: StreamId): Self = StObject.set(x, "streamId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTags(value: TagList): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    
    @scala.inline
    def setTagsVarargs(value: Tag*): Self = StObject.set(x, "tags", js.Array(value :_*))
  }
}
