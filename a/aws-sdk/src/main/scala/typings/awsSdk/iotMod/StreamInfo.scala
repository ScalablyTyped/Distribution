package typings.awsSdk.iotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StreamInfo extends js.Object {
  
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
  implicit class StreamInfoOps[Self <: StreamInfo] (val x: Self) extends AnyVal {
    
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
    def setCreatedAt(value: DateType): Self = this.set("createdAt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreatedAt: Self = this.set("createdAt", js.undefined)
    
    @scala.inline
    def setDescription(value: StreamDescription): Self = this.set("description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    
    @scala.inline
    def setFilesVarargs(value: StreamFile*): Self = this.set("files", js.Array(value :_*))
    
    @scala.inline
    def setFiles(value: StreamFiles): Self = this.set("files", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFiles: Self = this.set("files", js.undefined)
    
    @scala.inline
    def setLastUpdatedAt(value: DateType): Self = this.set("lastUpdatedAt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLastUpdatedAt: Self = this.set("lastUpdatedAt", js.undefined)
    
    @scala.inline
    def setRoleArn(value: RoleArn): Self = this.set("roleArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRoleArn: Self = this.set("roleArn", js.undefined)
    
    @scala.inline
    def setStreamArn(value: StreamArn): Self = this.set("streamArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStreamArn: Self = this.set("streamArn", js.undefined)
    
    @scala.inline
    def setStreamId(value: StreamId): Self = this.set("streamId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStreamId: Self = this.set("streamId", js.undefined)
    
    @scala.inline
    def setStreamVersion(value: StreamVersion): Self = this.set("streamVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStreamVersion: Self = this.set("streamVersion", js.undefined)
  }
}
