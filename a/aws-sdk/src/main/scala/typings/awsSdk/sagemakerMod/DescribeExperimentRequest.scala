package typings.awsSdk.sagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeExperimentRequest extends StObject {
  
  /**
    * The name of the experiment to describe.
    */
  var ExperimentName: ExperimentEntityName = js.native
}
object DescribeExperimentRequest {
  
  @scala.inline
  def apply(ExperimentName: ExperimentEntityName): DescribeExperimentRequest = {
    val __obj = js.Dynamic.literal(ExperimentName = ExperimentName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeExperimentRequest]
  }
  
  @scala.inline
  implicit class DescribeExperimentRequestMutableBuilder[Self <: DescribeExperimentRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExperimentName(value: ExperimentEntityName): Self = StObject.set(x, "ExperimentName", value.asInstanceOf[js.Any])
  }
}
