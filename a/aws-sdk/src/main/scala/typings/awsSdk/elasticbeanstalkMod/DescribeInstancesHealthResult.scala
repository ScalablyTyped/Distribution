package typings.awsSdk.elasticbeanstalkMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeInstancesHealthResult extends StObject {
  
  /**
    * Detailed health information about each instance. The output differs slightly between Linux and Windows environments. There is a difference in the members that are supported under the &lt;CPUUtilization&gt; type.
    */
  var InstanceHealthList: js.UndefOr[typings.awsSdk.elasticbeanstalkMod.InstanceHealthList] = js.native
  
  /**
    * Pagination token for the next page of results, if available.
    */
  var NextToken: js.UndefOr[typings.awsSdk.elasticbeanstalkMod.NextToken] = js.native
  
  /**
    * The date and time that the health information was retrieved.
    */
  var RefreshedAt: js.UndefOr[typings.awsSdk.elasticbeanstalkMod.RefreshedAt] = js.native
}
object DescribeInstancesHealthResult {
  
  @scala.inline
  def apply(): DescribeInstancesHealthResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeInstancesHealthResult]
  }
  
  @scala.inline
  implicit class DescribeInstancesHealthResultMutableBuilder[Self <: DescribeInstancesHealthResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInstanceHealthList(value: InstanceHealthList): Self = StObject.set(x, "InstanceHealthList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInstanceHealthListUndefined: Self = StObject.set(x, "InstanceHealthList", js.undefined)
    
    @scala.inline
    def setInstanceHealthListVarargs(value: SingleInstanceHealth*): Self = StObject.set(x, "InstanceHealthList", js.Array(value :_*))
    
    @scala.inline
    def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    @scala.inline
    def setRefreshedAt(value: RefreshedAt): Self = StObject.set(x, "RefreshedAt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRefreshedAtUndefined: Self = StObject.set(x, "RefreshedAt", js.undefined)
  }
}
