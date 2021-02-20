package typings.awsSdk.guarddutyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetFilterRequest extends StObject {
  
  /**
    * The unique ID of the detector that the filter is associated with.
    */
  var DetectorId: typings.awsSdk.guarddutyMod.DetectorId = js.native
  
  /**
    * The name of the filter you want to get.
    */
  var FilterName: String = js.native
}
object GetFilterRequest {
  
  @scala.inline
  def apply(DetectorId: DetectorId, FilterName: String): GetFilterRequest = {
    val __obj = js.Dynamic.literal(DetectorId = DetectorId.asInstanceOf[js.Any], FilterName = FilterName.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetFilterRequest]
  }
  
  @scala.inline
  implicit class GetFilterRequestMutableBuilder[Self <: GetFilterRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDetectorId(value: DetectorId): Self = StObject.set(x, "DetectorId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilterName(value: String): Self = StObject.set(x, "FilterName", value.asInstanceOf[js.Any])
  }
}
