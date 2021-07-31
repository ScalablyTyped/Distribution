package typings.awsSdk.sagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeTrialComponentRequest extends StObject {
  
  /**
    * The name of the trial component to describe.
    */
  var TrialComponentName: ExperimentEntityName
}
object DescribeTrialComponentRequest {
  
  @scala.inline
  def apply(TrialComponentName: ExperimentEntityName): DescribeTrialComponentRequest = {
    val __obj = js.Dynamic.literal(TrialComponentName = TrialComponentName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeTrialComponentRequest]
  }
  
  @scala.inline
  implicit class DescribeTrialComponentRequestMutableBuilder[Self <: DescribeTrialComponentRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTrialComponentName(value: ExperimentEntityName): Self = StObject.set(x, "TrialComponentName", value.asInstanceOf[js.Any])
  }
}
