package typings.awsSdk.cloudformationMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeStackSetOperationOutput extends StObject {
  
  /**
    * The specified stack set operation.
    */
  var StackSetOperation: js.UndefOr[typings.awsSdk.cloudformationMod.StackSetOperation] = js.native
}
object DescribeStackSetOperationOutput {
  
  @scala.inline
  def apply(): DescribeStackSetOperationOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeStackSetOperationOutput]
  }
  
  @scala.inline
  implicit class DescribeStackSetOperationOutputMutableBuilder[Self <: DescribeStackSetOperationOutput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setStackSetOperation(value: StackSetOperation): Self = StObject.set(x, "StackSetOperation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStackSetOperationUndefined: Self = StObject.set(x, "StackSetOperation", js.undefined)
  }
}
