package typings.awsSdk.cloudformationMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DetectStackSetDriftOutput extends StObject {
  
  /**
    * The ID of the drift detection stack set operation.  you can use this operation id with  DescribeStackSetOperation  to monitor the progress of the drift detection operation. 
    */
  var OperationId: js.UndefOr[ClientRequestToken] = js.native
}
object DetectStackSetDriftOutput {
  
  @scala.inline
  def apply(): DetectStackSetDriftOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DetectStackSetDriftOutput]
  }
  
  @scala.inline
  implicit class DetectStackSetDriftOutputMutableBuilder[Self <: DetectStackSetDriftOutput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOperationId(value: ClientRequestToken): Self = StObject.set(x, "OperationId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOperationIdUndefined: Self = StObject.set(x, "OperationId", js.undefined)
  }
}
