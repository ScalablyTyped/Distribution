package typings.awsSdk.discoveryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StopContinuousExportRequest extends StObject {
  
  /**
    * The unique ID assigned to this export.
    */
  var exportId: ConfigurationsExportId = js.native
}
object StopContinuousExportRequest {
  
  @scala.inline
  def apply(exportId: ConfigurationsExportId): StopContinuousExportRequest = {
    val __obj = js.Dynamic.literal(exportId = exportId.asInstanceOf[js.Any])
    __obj.asInstanceOf[StopContinuousExportRequest]
  }
  
  @scala.inline
  implicit class StopContinuousExportRequestMutableBuilder[Self <: StopContinuousExportRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExportId(value: ConfigurationsExportId): Self = StObject.set(x, "exportId", value.asInstanceOf[js.Any])
  }
}
