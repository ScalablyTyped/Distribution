package typings.awsSdk.opsworksMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeTimeBasedAutoScalingRequest extends StObject {
  
  /**
    * An array of instance IDs.
    */
  var InstanceIds: Strings = js.native
}
object DescribeTimeBasedAutoScalingRequest {
  
  @scala.inline
  def apply(InstanceIds: Strings): DescribeTimeBasedAutoScalingRequest = {
    val __obj = js.Dynamic.literal(InstanceIds = InstanceIds.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeTimeBasedAutoScalingRequest]
  }
  
  @scala.inline
  implicit class DescribeTimeBasedAutoScalingRequestMutableBuilder[Self <: DescribeTimeBasedAutoScalingRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInstanceIds(value: Strings): Self = StObject.set(x, "InstanceIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInstanceIdsVarargs(value: String*): Self = StObject.set(x, "InstanceIds", js.Array(value :_*))
  }
}
