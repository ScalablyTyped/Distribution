package typings.awsSdk.sagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeTrialRequest extends StObject {
  
  /**
    * The name of the trial to describe.
    */
  var TrialName: ExperimentEntityName
}
object DescribeTrialRequest {
  
  inline def apply(TrialName: ExperimentEntityName): DescribeTrialRequest = {
    val __obj = js.Dynamic.literal(TrialName = TrialName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeTrialRequest]
  }
  
  extension [Self <: DescribeTrialRequest](x: Self) {
    
    inline def setTrialName(value: ExperimentEntityName): Self = StObject.set(x, "TrialName", value.asInstanceOf[js.Any])
  }
}
