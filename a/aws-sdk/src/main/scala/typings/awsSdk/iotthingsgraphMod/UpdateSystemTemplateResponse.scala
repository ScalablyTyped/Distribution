package typings.awsSdk.iotthingsgraphMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateSystemTemplateResponse extends StObject {
  
  /**
    * An object containing summary information about the updated system.
    */
  var summary: js.UndefOr[SystemTemplateSummary] = js.native
}
object UpdateSystemTemplateResponse {
  
  @scala.inline
  def apply(): UpdateSystemTemplateResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateSystemTemplateResponse]
  }
  
  @scala.inline
  implicit class UpdateSystemTemplateResponseMutableBuilder[Self <: UpdateSystemTemplateResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSummary(value: SystemTemplateSummary): Self = StObject.set(x, "summary", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSummaryUndefined: Self = StObject.set(x, "summary", js.undefined)
  }
}
