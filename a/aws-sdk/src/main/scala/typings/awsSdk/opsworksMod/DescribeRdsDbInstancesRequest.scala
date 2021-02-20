package typings.awsSdk.opsworksMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeRdsDbInstancesRequest extends StObject {
  
  /**
    * An array containing the ARNs of the instances to be described.
    */
  var RdsDbInstanceArns: js.UndefOr[Strings] = js.native
  
  /**
    * The ID of the stack with which the instances are registered. The operation returns descriptions of all registered Amazon RDS instances.
    */
  var StackId: String = js.native
}
object DescribeRdsDbInstancesRequest {
  
  @scala.inline
  def apply(StackId: String): DescribeRdsDbInstancesRequest = {
    val __obj = js.Dynamic.literal(StackId = StackId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeRdsDbInstancesRequest]
  }
  
  @scala.inline
  implicit class DescribeRdsDbInstancesRequestMutableBuilder[Self <: DescribeRdsDbInstancesRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRdsDbInstanceArns(value: Strings): Self = StObject.set(x, "RdsDbInstanceArns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRdsDbInstanceArnsUndefined: Self = StObject.set(x, "RdsDbInstanceArns", js.undefined)
    
    @scala.inline
    def setRdsDbInstanceArnsVarargs(value: String*): Self = StObject.set(x, "RdsDbInstanceArns", js.Array(value :_*))
    
    @scala.inline
    def setStackId(value: String): Self = StObject.set(x, "StackId", value.asInstanceOf[js.Any])
  }
}
