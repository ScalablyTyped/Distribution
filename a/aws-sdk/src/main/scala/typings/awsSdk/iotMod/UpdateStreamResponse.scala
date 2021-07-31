package typings.awsSdk.iotMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateStreamResponse extends StObject {
  
  /**
    * A description of the stream.
    */
  var description: js.UndefOr[StreamDescription] = js.undefined
  
  /**
    * The stream ARN.
    */
  var streamArn: js.UndefOr[StreamArn] = js.undefined
  
  /**
    * The stream ID.
    */
  var streamId: js.UndefOr[StreamId] = js.undefined
  
  /**
    * The stream version.
    */
  var streamVersion: js.UndefOr[StreamVersion] = js.undefined
}
object UpdateStreamResponse {
  
  @scala.inline
  def apply(): UpdateStreamResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateStreamResponse]
  }
  
  @scala.inline
  implicit class UpdateStreamResponseMutableBuilder[Self <: UpdateStreamResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDescription(value: StreamDescription): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
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
