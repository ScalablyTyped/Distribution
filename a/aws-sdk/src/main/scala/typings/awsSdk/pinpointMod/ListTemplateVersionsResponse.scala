package typings.awsSdk.pinpointMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListTemplateVersionsResponse extends StObject {
  
  var TemplateVersionsResponse: typings.awsSdk.pinpointMod.TemplateVersionsResponse = js.native
}
object ListTemplateVersionsResponse {
  
  @scala.inline
  def apply(TemplateVersionsResponse: TemplateVersionsResponse): ListTemplateVersionsResponse = {
    val __obj = js.Dynamic.literal(TemplateVersionsResponse = TemplateVersionsResponse.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListTemplateVersionsResponse]
  }
  
  @scala.inline
  implicit class ListTemplateVersionsResponseMutableBuilder[Self <: ListTemplateVersionsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTemplateVersionsResponse(value: TemplateVersionsResponse): Self = StObject.set(x, "TemplateVersionsResponse", value.asInstanceOf[js.Any])
  }
}
