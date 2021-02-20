package typings.awsSdk.iotMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StreamSummary extends StObject {
  
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
object StreamSummary {
  
  @scala.inline
  def apply(): StreamSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StreamSummary]
  }
  
  @scala.inline
  implicit class StreamSummaryMutableBuilder[Self <: StreamSummary] (val x: Self) extends AnyVal {
    
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
