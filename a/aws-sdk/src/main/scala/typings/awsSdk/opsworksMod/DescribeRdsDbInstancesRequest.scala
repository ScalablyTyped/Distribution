package typings.awsSdk.opsworksMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeRdsDbInstancesRequest extends StObject {
  
  /**
    * An array containing the ARNs of the instances to be described.
    */
  var RdsDbInstanceArns: js.UndefOr[Strings] = js.undefined
  
  /**
    * The ID of the stack with which the instances are registered. The operation returns descriptions of all registered Amazon RDS instances.
    */
  var StackId: String
}
object DescribeRdsDbInstancesRequest {
  
  inline def apply(StackId: String): DescribeRdsDbInstancesRequest = {
    val __obj = js.Dynamic.literal(StackId = StackId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeRdsDbInstancesRequest]
  }
  
  extension [Self <: DescribeRdsDbInstancesRequest](x: Self) {
    
    inline def setRdsDbInstanceArns(value: Strings): Self = StObject.set(x, "RdsDbInstanceArns", value.asInstanceOf[js.Any])
    
    inline def setRdsDbInstanceArnsUndefined: Self = StObject.set(x, "RdsDbInstanceArns", js.undefined)
    
    inline def setRdsDbInstanceArnsVarargs(value: String*): Self = StObject.set(x, "RdsDbInstanceArns", js.Array(value*))
    
    inline def setStackId(value: String): Self = StObject.set(x, "StackId", value.asInstanceOf[js.Any])
  }
}
