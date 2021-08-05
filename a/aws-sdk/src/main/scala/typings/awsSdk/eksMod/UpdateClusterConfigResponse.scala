package typings.awsSdk.eksMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateClusterConfigResponse extends StObject {
  
  var update: js.UndefOr[Update] = js.undefined
}
object UpdateClusterConfigResponse {
  
  inline def apply(): UpdateClusterConfigResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateClusterConfigResponse]
  }
  
  extension [Self <: UpdateClusterConfigResponse](x: Self) {
    
    inline def setUpdate(value: Update): Self = StObject.set(x, "update", value.asInstanceOf[js.Any])
    
    inline def setUpdateUndefined: Self = StObject.set(x, "update", js.undefined)
  }
}
