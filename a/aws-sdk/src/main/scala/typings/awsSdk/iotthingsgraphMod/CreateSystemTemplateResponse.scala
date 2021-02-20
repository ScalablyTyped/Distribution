package typings.awsSdk.iotthingsgraphMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateSystemTemplateResponse extends StObject {
  
  /**
    * The summary object that describes the created system.
    */
  var summary: js.UndefOr[SystemTemplateSummary] = js.native
}
object CreateSystemTemplateResponse {
  
  @scala.inline
  def apply(): CreateSystemTemplateResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateSystemTemplateResponse]
  }
  
  @scala.inline
  implicit class CreateSystemTemplateResponseMutableBuilder[Self <: CreateSystemTemplateResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSummary(value: SystemTemplateSummary): Self = StObject.set(x, "summary", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSummaryUndefined: Self = StObject.set(x, "summary", js.undefined)
  }
}
