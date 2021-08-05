package typings.awsSdk.lightsailMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateDistributionBundleResult extends StObject {
  
  var operation: js.UndefOr[Operation] = js.undefined
}
object UpdateDistributionBundleResult {
  
  inline def apply(): UpdateDistributionBundleResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateDistributionBundleResult]
  }
  
  extension [Self <: UpdateDistributionBundleResult](x: Self) {
    
    inline def setOperation(value: Operation): Self = StObject.set(x, "operation", value.asInstanceOf[js.Any])
    
    inline def setOperationUndefined: Self = StObject.set(x, "operation", js.undefined)
  }
}
