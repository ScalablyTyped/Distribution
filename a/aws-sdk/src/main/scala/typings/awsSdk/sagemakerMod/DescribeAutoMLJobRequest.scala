package typings.awsSdk.sagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeAutoMLJobRequest extends StObject {
  
  /**
    * Request information about a job using that job's unique name.
    */
  var AutoMLJobName: typings.awsSdk.sagemakerMod.AutoMLJobName = js.native
}
object DescribeAutoMLJobRequest {
  
  @scala.inline
  def apply(AutoMLJobName: AutoMLJobName): DescribeAutoMLJobRequest = {
    val __obj = js.Dynamic.literal(AutoMLJobName = AutoMLJobName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeAutoMLJobRequest]
  }
  
  @scala.inline
  implicit class DescribeAutoMLJobRequestMutableBuilder[Self <: DescribeAutoMLJobRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAutoMLJobName(value: AutoMLJobName): Self = StObject.set(x, "AutoMLJobName", value.asInstanceOf[js.Any])
  }
}
