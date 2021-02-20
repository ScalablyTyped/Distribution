package typings.awsSdk.pinpointMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListTemplatesResponse extends StObject {
  
  var TemplatesResponse: typings.awsSdk.pinpointMod.TemplatesResponse = js.native
}
object ListTemplatesResponse {
  
  @scala.inline
  def apply(TemplatesResponse: TemplatesResponse): ListTemplatesResponse = {
    val __obj = js.Dynamic.literal(TemplatesResponse = TemplatesResponse.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListTemplatesResponse]
  }
  
  @scala.inline
  implicit class ListTemplatesResponseMutableBuilder[Self <: ListTemplatesResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTemplatesResponse(value: TemplatesResponse): Self = StObject.set(x, "TemplatesResponse", value.asInstanceOf[js.Any])
  }
}
