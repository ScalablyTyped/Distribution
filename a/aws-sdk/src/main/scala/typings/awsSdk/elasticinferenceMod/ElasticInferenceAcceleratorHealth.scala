package typings.awsSdk.elasticinferenceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ElasticInferenceAcceleratorHealth extends StObject {
  
  /**
    *  The health status of the Elastic Inference Accelerator. 
    */
  var status: js.UndefOr[AcceleratorHealthStatus] = js.native
}
object ElasticInferenceAcceleratorHealth {
  
  @scala.inline
  def apply(): ElasticInferenceAcceleratorHealth = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ElasticInferenceAcceleratorHealth]
  }
  
  @scala.inline
  implicit class ElasticInferenceAcceleratorHealthMutableBuilder[Self <: ElasticInferenceAcceleratorHealth] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setStatus(value: AcceleratorHealthStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
  }
}
