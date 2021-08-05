package typings.awsSdk.emrMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeStepInput extends StObject {
  
  /**
    * The identifier of the cluster with steps to describe.
    */
  var ClusterId: typings.awsSdk.emrMod.ClusterId
  
  /**
    * The identifier of the step to describe.
    */
  var StepId: typings.awsSdk.emrMod.StepId
}
object DescribeStepInput {
  
  inline def apply(ClusterId: ClusterId, StepId: StepId): DescribeStepInput = {
    val __obj = js.Dynamic.literal(ClusterId = ClusterId.asInstanceOf[js.Any], StepId = StepId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeStepInput]
  }
  
  extension [Self <: DescribeStepInput](x: Self) {
    
    inline def setClusterId(value: ClusterId): Self = StObject.set(x, "ClusterId", value.asInstanceOf[js.Any])
    
    inline def setStepId(value: StepId): Self = StObject.set(x, "StepId", value.asInstanceOf[js.Any])
  }
}
