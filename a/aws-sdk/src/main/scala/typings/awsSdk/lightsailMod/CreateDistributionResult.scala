package typings.awsSdk.lightsailMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateDistributionResult extends StObject {
  
  /**
    * An object that describes the distribution created.
    */
  var distribution: js.UndefOr[LightsailDistribution] = js.native
  
  /**
    * An array of objects that describe the result of the action, such as the status of the request, the timestamp of the request, and the resources affected by the request.
    */
  var operation: js.UndefOr[Operation] = js.native
}
object CreateDistributionResult {
  
  @scala.inline
  def apply(): CreateDistributionResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateDistributionResult]
  }
  
  @scala.inline
  implicit class CreateDistributionResultMutableBuilder[Self <: CreateDistributionResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDistribution(value: LightsailDistribution): Self = StObject.set(x, "distribution", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDistributionUndefined: Self = StObject.set(x, "distribution", js.undefined)
    
    @scala.inline
    def setOperation(value: Operation): Self = StObject.set(x, "operation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOperationUndefined: Self = StObject.set(x, "operation", js.undefined)
  }
}
