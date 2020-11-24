package typings.awsSdk.iotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateStreamResponse extends js.Object {
  
  /**
    * A description of the stream.
    */
  var description: js.UndefOr[StreamDescription] = js.native
  
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
object UpdateStreamResponse {
  
  @scala.inline
  def apply(): UpdateStreamResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateStreamResponse]
  }
  
  @scala.inline
  implicit class UpdateStreamResponseOps[Self <: UpdateStreamResponse] (val x: Self) extends AnyVal {
    
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
    def setDescription(value: StreamDescription): Self = this.set("description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    
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
