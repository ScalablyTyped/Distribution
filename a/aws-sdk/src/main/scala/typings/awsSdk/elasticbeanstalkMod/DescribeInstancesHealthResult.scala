package typings.awsSdk.elasticbeanstalkMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeInstancesHealthResult extends StObject {
  
  /**
    * Detailed health information about each instance. The output differs slightly between Linux and Windows environments. There is a difference in the members that are supported under the &lt;CPUUtilization&gt; type.
    */
  var InstanceHealthList: js.UndefOr[typings.awsSdk.elasticbeanstalkMod.InstanceHealthList] = js.undefined
  
  /**
    * Pagination token for the next page of results, if available.
    */
  var NextToken: js.UndefOr[typings.awsSdk.elasticbeanstalkMod.NextToken] = js.undefined
  
  /**
    * The date and time that the health information was retrieved.
    */
  var RefreshedAt: js.UndefOr[typings.awsSdk.elasticbeanstalkMod.RefreshedAt] = js.undefined
}
object DescribeInstancesHealthResult {
  
  inline def apply(): DescribeInstancesHealthResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeInstancesHealthResult]
  }
  
  extension [Self <: DescribeInstancesHealthResult](x: Self) {
    
    inline def setInstanceHealthList(value: InstanceHealthList): Self = StObject.set(x, "InstanceHealthList", value.asInstanceOf[js.Any])
    
    inline def setInstanceHealthListUndefined: Self = StObject.set(x, "InstanceHealthList", js.undefined)
    
    inline def setInstanceHealthListVarargs(value: SingleInstanceHealth*): Self = StObject.set(x, "InstanceHealthList", js.Array(value :_*))
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setRefreshedAt(value: RefreshedAt): Self = StObject.set(x, "RefreshedAt", value.asInstanceOf[js.Any])
    
    inline def setRefreshedAtUndefined: Self = StObject.set(x, "RefreshedAt", js.undefined)
  }
}
