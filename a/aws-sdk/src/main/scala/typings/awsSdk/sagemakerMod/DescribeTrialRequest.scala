package typings.awsSdk.sagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeTrialRequest extends StObject {
  
  /**
    * The name of the trial to describe.
    */
  var TrialName: ExperimentEntityName = js.native
}
object DescribeTrialRequest {
  
  @scala.inline
  def apply(TrialName: ExperimentEntityName): DescribeTrialRequest = {
    val __obj = js.Dynamic.literal(TrialName = TrialName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeTrialRequest]
  }
  
  @scala.inline
  implicit class DescribeTrialRequestMutableBuilder[Self <: DescribeTrialRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTrialName(value: ExperimentEntityName): Self = StObject.set(x, "TrialName", value.asInstanceOf[js.Any])
  }
}
