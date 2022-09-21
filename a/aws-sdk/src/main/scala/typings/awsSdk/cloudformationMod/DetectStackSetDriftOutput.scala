package typings.awsSdk.cloudformationMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DetectStackSetDriftOutput extends StObject {
  
  /**
    * The ID of the drift detection stack set operation. You can use this operation ID with  DescribeStackSetOperation  to monitor the progress of the drift detection operation.
    */
  var OperationId: js.UndefOr[ClientRequestToken] = js.undefined
}
object DetectStackSetDriftOutput {
  
  inline def apply(): DetectStackSetDriftOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DetectStackSetDriftOutput]
  }
  
  extension [Self <: DetectStackSetDriftOutput](x: Self) {
    
    inline def setOperationId(value: ClientRequestToken): Self = StObject.set(x, "OperationId", value.asInstanceOf[js.Any])
    
    inline def setOperationIdUndefined: Self = StObject.set(x, "OperationId", js.undefined)
  }
}
