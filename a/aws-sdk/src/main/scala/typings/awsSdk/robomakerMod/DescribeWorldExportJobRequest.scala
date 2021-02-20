package typings.awsSdk.robomakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeWorldExportJobRequest extends StObject {
  
  /**
    * The Amazon Resource Name (arn) of the world export job to describe.
    */
  var job: Arn = js.native
}
object DescribeWorldExportJobRequest {
  
  @scala.inline
  def apply(job: Arn): DescribeWorldExportJobRequest = {
    val __obj = js.Dynamic.literal(job = job.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeWorldExportJobRequest]
  }
  
  @scala.inline
  implicit class DescribeWorldExportJobRequestMutableBuilder[Self <: DescribeWorldExportJobRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setJob(value: Arn): Self = StObject.set(x, "job", value.asInstanceOf[js.Any])
  }
}
