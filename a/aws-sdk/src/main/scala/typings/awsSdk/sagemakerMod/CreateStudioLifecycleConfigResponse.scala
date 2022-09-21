package typings.awsSdk.sagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateStudioLifecycleConfigResponse extends StObject {
  
  /**
    * The ARN of your created Lifecycle Configuration.
    */
  var StudioLifecycleConfigArn: js.UndefOr[typings.awsSdk.sagemakerMod.StudioLifecycleConfigArn] = js.undefined
}
object CreateStudioLifecycleConfigResponse {
  
  inline def apply(): CreateStudioLifecycleConfigResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateStudioLifecycleConfigResponse]
  }
  
  extension [Self <: CreateStudioLifecycleConfigResponse](x: Self) {
    
    inline def setStudioLifecycleConfigArn(value: StudioLifecycleConfigArn): Self = StObject.set(x, "StudioLifecycleConfigArn", value.asInstanceOf[js.Any])
    
    inline def setStudioLifecycleConfigArnUndefined: Self = StObject.set(x, "StudioLifecycleConfigArn", js.undefined)
  }
}
