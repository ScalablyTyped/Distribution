package typings.awsSdk.opsworksMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeInstancesRequest extends StObject {
  
  /**
    * An array of instance IDs to be described. If you use this parameter, DescribeInstances returns a description of the specified instances. Otherwise, it returns a description of every instance.
    */
  var InstanceIds: js.UndefOr[Strings] = js.undefined
  
  /**
    * A layer ID. If you use this parameter, DescribeInstances returns descriptions of the instances associated with the specified layer.
    */
  var LayerId: js.UndefOr[String] = js.undefined
  
  /**
    * A stack ID. If you use this parameter, DescribeInstances returns descriptions of the instances associated with the specified stack.
    */
  var StackId: js.UndefOr[String] = js.undefined
}
object DescribeInstancesRequest {
  
  @scala.inline
  def apply(): DescribeInstancesRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeInstancesRequest]
  }
  
  @scala.inline
  implicit class DescribeInstancesRequestMutableBuilder[Self <: DescribeInstancesRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInstanceIds(value: Strings): Self = StObject.set(x, "InstanceIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInstanceIdsUndefined: Self = StObject.set(x, "InstanceIds", js.undefined)
    
    @scala.inline
    def setInstanceIdsVarargs(value: String*): Self = StObject.set(x, "InstanceIds", js.Array(value :_*))
    
    @scala.inline
    def setLayerId(value: String): Self = StObject.set(x, "LayerId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLayerIdUndefined: Self = StObject.set(x, "LayerId", js.undefined)
    
    @scala.inline
    def setStackId(value: String): Self = StObject.set(x, "StackId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStackIdUndefined: Self = StObject.set(x, "StackId", js.undefined)
  }
}
