package typings.awsSdk.iotMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StreamInfo extends StObject {
  
  /**
    * The date when the stream was created.
    */
  var createdAt: js.UndefOr[DateType] = js.native
  
  /**
    * The description of the stream.
    */
  var description: js.UndefOr[StreamDescription] = js.native
  
  /**
    * The files to stream.
    */
  var files: js.UndefOr[StreamFiles] = js.native
  
  /**
    * The date when the stream was last updated.
    */
  var lastUpdatedAt: js.UndefOr[DateType] = js.native
  
  /**
    * An IAM role AWS IoT assumes to access your S3 files.
    */
  var roleArn: js.UndefOr[RoleArn] = js.native
  
  /**
    * The stream ARN.
    */
  var streamArn: js.UndefOr[StreamArn] = js.native
  
  /**
    * The stream ID.
    */
  var streamId: js.UndefOr[StreamId] = js.native
  
  /**
    * The stream version.
    */
  var streamVersion: js.UndefOr[StreamVersion] = js.native
}
object StreamInfo {
  
  @scala.inline
  def apply(): StreamInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StreamInfo]
  }
  
  @scala.inline
  implicit class StreamInfoMutableBuilder[Self <: StreamInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCreatedAt(value: DateType): Self = StObject.set(x, "createdAt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreatedAtUndefined: Self = StObject.set(x, "createdAt", js.undefined)
    
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
    def setLastUpdatedAt(value: DateType): Self = StObject.set(x, "lastUpdatedAt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastUpdatedAtUndefined: Self = StObject.set(x, "lastUpdatedAt", js.undefined)
    
    @scala.inline
    def setRoleArn(value: RoleArn): Self = StObject.set(x, "roleArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRoleArnUndefined: Self = StObject.set(x, "roleArn", js.undefined)
    
    @scala.inline
    def setStreamArn(value: StreamArn): Self = StObject.set(x, "streamArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStreamArnUndefined: Self = StObject.set(x, "streamArn", js.undefined)
    
    @scala.inline
    def setStreamId(value: StreamId): Self = StObject.set(x, "streamId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStreamIdUndefined: Self = StObject.set(x, "streamId", js.undefined)
    
    @scala.inline
    def setStreamVersion(value: StreamVersion): Self = StObject.set(x, "streamVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStreamVersionUndefined: Self = StObject.set(x, "streamVersion", js.undefined)
  }
}
