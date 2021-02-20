package typings.awsSdk.elbMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeEndPointStateOutput extends StObject {
  
  /**
    * Information about the health of the instances.
    */
  var InstanceStates: js.UndefOr[typings.awsSdk.elbMod.InstanceStates] = js.native
}
object DescribeEndPointStateOutput {
  
  @scala.inline
  def apply(): DescribeEndPointStateOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeEndPointStateOutput]
  }
  
  @scala.inline
  implicit class DescribeEndPointStateOutputMutableBuilder[Self <: DescribeEndPointStateOutput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInstanceStates(value: InstanceStates): Self = StObject.set(x, "InstanceStates", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInstanceStatesUndefined: Self = StObject.set(x, "InstanceStates", js.undefined)
    
    @scala.inline
    def setInstanceStatesVarargs(value: InstanceState*): Self = StObject.set(x, "InstanceStates", js.Array(value :_*))
  }
}
