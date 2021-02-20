package typings.awsSdk.iotthingsgraphMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetSystemTemplateRequest extends StObject {
  
  /**
    * The ID of the system to get. This ID must be in the user's namespace. The ID should be in the following format.  urn:tdm:REGION/ACCOUNT ID/default:system:SYSTEMNAME 
    */
  var id: Urn = js.native
  
  /**
    * The number that specifies the revision of the system to get.
    */
  var revisionNumber: js.UndefOr[Version] = js.native
}
object GetSystemTemplateRequest {
  
  @scala.inline
  def apply(id: Urn): GetSystemTemplateRequest = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetSystemTemplateRequest]
  }
  
  @scala.inline
  implicit class GetSystemTemplateRequestMutableBuilder[Self <: GetSystemTemplateRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setId(value: Urn): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRevisionNumber(value: Version): Self = StObject.set(x, "revisionNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRevisionNumberUndefined: Self = StObject.set(x, "revisionNumber", js.undefined)
  }
}
