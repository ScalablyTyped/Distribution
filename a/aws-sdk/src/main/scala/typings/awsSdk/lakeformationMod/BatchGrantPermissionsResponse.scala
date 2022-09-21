package typings.awsSdk.lakeformationMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BatchGrantPermissionsResponse extends StObject {
  
  /**
    * A list of failures to grant permissions to the resources.
    */
  var Failures: js.UndefOr[BatchPermissionsFailureList] = js.undefined
}
object BatchGrantPermissionsResponse {
  
  inline def apply(): BatchGrantPermissionsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BatchGrantPermissionsResponse]
  }
  
  extension [Self <: BatchGrantPermissionsResponse](x: Self) {
    
    inline def setFailures(value: BatchPermissionsFailureList): Self = StObject.set(x, "Failures", value.asInstanceOf[js.Any])
    
    inline def setFailuresUndefined: Self = StObject.set(x, "Failures", js.undefined)
    
    inline def setFailuresVarargs(value: BatchPermissionsFailureEntry*): Self = StObject.set(x, "Failures", js.Array(value*))
  }
}
