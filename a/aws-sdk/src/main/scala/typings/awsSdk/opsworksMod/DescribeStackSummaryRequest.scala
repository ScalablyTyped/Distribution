package typings.awsSdk.opsworksMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeStackSummaryRequest extends StObject {
  
  /**
    * The stack ID.
    */
  var StackId: String = js.native
}
object DescribeStackSummaryRequest {
  
  @scala.inline
  def apply(StackId: String): DescribeStackSummaryRequest = {
    val __obj = js.Dynamic.literal(StackId = StackId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeStackSummaryRequest]
  }
  
  @scala.inline
  implicit class DescribeStackSummaryRequestMutableBuilder[Self <: DescribeStackSummaryRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setStackId(value: String): Self = StObject.set(x, "StackId", value.asInstanceOf[js.Any])
  }
}
