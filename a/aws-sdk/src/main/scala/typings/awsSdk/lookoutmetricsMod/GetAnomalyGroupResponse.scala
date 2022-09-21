package typings.awsSdk.lookoutmetricsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetAnomalyGroupResponse extends StObject {
  
  /**
    * Details about the anomaly group.
    */
  var AnomalyGroup: js.UndefOr[typings.awsSdk.lookoutmetricsMod.AnomalyGroup] = js.undefined
}
object GetAnomalyGroupResponse {
  
  inline def apply(): GetAnomalyGroupResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetAnomalyGroupResponse]
  }
  
  extension [Self <: GetAnomalyGroupResponse](x: Self) {
    
    inline def setAnomalyGroup(value: AnomalyGroup): Self = StObject.set(x, "AnomalyGroup", value.asInstanceOf[js.Any])
    
    inline def setAnomalyGroupUndefined: Self = StObject.set(x, "AnomalyGroup", js.undefined)
  }
}
