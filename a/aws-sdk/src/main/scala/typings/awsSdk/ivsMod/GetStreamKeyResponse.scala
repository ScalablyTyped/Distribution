package typings.awsSdk.ivsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetStreamKeyResponse extends StObject {
  
  var streamKey: js.UndefOr[StreamKey] = js.native
}
object GetStreamKeyResponse {
  
  @scala.inline
  def apply(): GetStreamKeyResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetStreamKeyResponse]
  }
  
  @scala.inline
  implicit class GetStreamKeyResponseMutableBuilder[Self <: GetStreamKeyResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setStreamKey(value: StreamKey): Self = StObject.set(x, "streamKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStreamKeyUndefined: Self = StObject.set(x, "streamKey", js.undefined)
  }
}
