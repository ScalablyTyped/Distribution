package typings.awsSdk.iotMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeJobExecutionResponse extends StObject {
  
  /**
    * Information about the job execution.
    */
  var execution: js.UndefOr[JobExecution] = js.native
}
object DescribeJobExecutionResponse {
  
  @scala.inline
  def apply(): DescribeJobExecutionResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeJobExecutionResponse]
  }
  
  @scala.inline
  implicit class DescribeJobExecutionResponseMutableBuilder[Self <: DescribeJobExecutionResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExecution(value: JobExecution): Self = StObject.set(x, "execution", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExecutionUndefined: Self = StObject.set(x, "execution", js.undefined)
  }
}
