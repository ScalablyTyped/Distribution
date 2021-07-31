package typings.awsSdk.iotthingsgraphMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateSystemInstanceResponse extends StObject {
  
  /**
    * The summary object that describes the new system instance.
    */
  var summary: js.UndefOr[SystemInstanceSummary] = js.undefined
}
object CreateSystemInstanceResponse {
  
  @scala.inline
  def apply(): CreateSystemInstanceResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateSystemInstanceResponse]
  }
  
  @scala.inline
  implicit class CreateSystemInstanceResponseMutableBuilder[Self <: CreateSystemInstanceResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSummary(value: SystemInstanceSummary): Self = StObject.set(x, "summary", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSummaryUndefined: Self = StObject.set(x, "summary", js.undefined)
  }
}
