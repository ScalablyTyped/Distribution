package typings.awsSdk.lightsailMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateDistributionBundleResult extends StObject {
  
  var operation: js.UndefOr[Operation] = js.undefined
}
object UpdateDistributionBundleResult {
  
  @scala.inline
  def apply(): UpdateDistributionBundleResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateDistributionBundleResult]
  }
  
  @scala.inline
  implicit class UpdateDistributionBundleResultMutableBuilder[Self <: UpdateDistributionBundleResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOperation(value: Operation): Self = StObject.set(x, "operation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOperationUndefined: Self = StObject.set(x, "operation", js.undefined)
  }
}
