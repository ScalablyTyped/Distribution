package typings.awsSdk.ivsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateStreamKeyResponse extends StObject {
  
  /**
    * Stream key used to authenticate an RTMPS stream for ingestion.
    */
  var streamKey: js.UndefOr[StreamKey] = js.undefined
}
object CreateStreamKeyResponse {
  
  @scala.inline
  def apply(): CreateStreamKeyResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateStreamKeyResponse]
  }
  
  @scala.inline
  implicit class CreateStreamKeyResponseMutableBuilder[Self <: CreateStreamKeyResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setStreamKey(value: StreamKey): Self = StObject.set(x, "streamKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStreamKeyUndefined: Self = StObject.set(x, "streamKey", js.undefined)
  }
}
