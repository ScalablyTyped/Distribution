package typings.awsSdk.robomakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeDeploymentJobRequest extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the deployment job.
    */
  var job: Arn
}
object DescribeDeploymentJobRequest {
  
  @scala.inline
  def apply(job: Arn): DescribeDeploymentJobRequest = {
    val __obj = js.Dynamic.literal(job = job.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeDeploymentJobRequest]
  }
  
  @scala.inline
  implicit class DescribeDeploymentJobRequestMutableBuilder[Self <: DescribeDeploymentJobRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setJob(value: Arn): Self = StObject.set(x, "job", value.asInstanceOf[js.Any])
  }
}
