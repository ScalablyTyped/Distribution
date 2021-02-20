package typings.awsSdk.ivsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetStreamResponse extends StObject {
  
  var stream: js.UndefOr[Stream] = js.native
}
object GetStreamResponse {
  
  @scala.inline
  def apply(): GetStreamResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetStreamResponse]
  }
  
  @scala.inline
  implicit class GetStreamResponseMutableBuilder[Self <: GetStreamResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setStream(value: Stream): Self = StObject.set(x, "stream", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStreamUndefined: Self = StObject.set(x, "stream", js.undefined)
  }
}
