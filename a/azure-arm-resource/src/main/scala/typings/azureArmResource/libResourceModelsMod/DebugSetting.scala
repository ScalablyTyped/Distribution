package typings.azureArmResource.libResourceModelsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DebugSetting extends StObject {
  
  /**
    * Specifies the type of information to log for debugging. The permitted values are none,
    * requestContent, responseContent, or both requestContent and responseContent separated by a
    * comma. The default is none. When setting this value, carefully consider the type of
    * information you are passing in during deployment. By logging information about the request or
    * response, you could potentially expose sensitive data that is retrieved through the deployment
    * operations.
    */
  var detailLevel: js.UndefOr[String] = js.undefined
}
object DebugSetting {
  
  inline def apply(): DebugSetting = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DebugSetting]
  }
  
  extension [Self <: DebugSetting](x: Self) {
    
    inline def setDetailLevel(value: String): Self = StObject.set(x, "detailLevel", value.asInstanceOf[js.Any])
    
    inline def setDetailLevelUndefined: Self = StObject.set(x, "detailLevel", js.undefined)
  }
}
