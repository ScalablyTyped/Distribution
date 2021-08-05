package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeInstanceStatusResult extends StObject {
  
  /**
    * Information about the status of the instances.
    */
  var InstanceStatuses: js.UndefOr[InstanceStatusList] = js.undefined
  
  /**
    * The token to use to retrieve the next page of results. This value is null when there are no more results to return.
    */
  var NextToken: js.UndefOr[String] = js.undefined
}
object DescribeInstanceStatusResult {
  
  inline def apply(): DescribeInstanceStatusResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeInstanceStatusResult]
  }
  
  extension [Self <: DescribeInstanceStatusResult](x: Self) {
    
    inline def setInstanceStatuses(value: InstanceStatusList): Self = StObject.set(x, "InstanceStatuses", value.asInstanceOf[js.Any])
    
    inline def setInstanceStatusesUndefined: Self = StObject.set(x, "InstanceStatuses", js.undefined)
    
    inline def setInstanceStatusesVarargs(value: InstanceStatus*): Self = StObject.set(x, "InstanceStatuses", js.Array(value :_*))
    
    inline def setNextToken(value: String): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
