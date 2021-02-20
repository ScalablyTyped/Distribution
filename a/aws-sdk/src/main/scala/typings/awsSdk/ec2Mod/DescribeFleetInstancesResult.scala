package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeFleetInstancesResult extends StObject {
  
  /**
    * The running instances. This list is refreshed periodically and might be out of date.
    */
  var ActiveInstances: js.UndefOr[ActiveInstanceSet] = js.native
  
  /**
    * The ID of the EC2 Fleet.
    */
  var FleetId: js.UndefOr[typings.awsSdk.ec2Mod.FleetId] = js.native
  
  /**
    * The token for the next set of results.
    */
  var NextToken: js.UndefOr[String] = js.native
}
object DescribeFleetInstancesResult {
  
  @scala.inline
  def apply(): DescribeFleetInstancesResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeFleetInstancesResult]
  }
  
  @scala.inline
  implicit class DescribeFleetInstancesResultMutableBuilder[Self <: DescribeFleetInstancesResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setActiveInstances(value: ActiveInstanceSet): Self = StObject.set(x, "ActiveInstances", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActiveInstancesUndefined: Self = StObject.set(x, "ActiveInstances", js.undefined)
    
    @scala.inline
    def setActiveInstancesVarargs(value: ActiveInstance*): Self = StObject.set(x, "ActiveInstances", js.Array(value :_*))
    
    @scala.inline
    def setFleetId(value: FleetId): Self = StObject.set(x, "FleetId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFleetIdUndefined: Self = StObject.set(x, "FleetId", js.undefined)
    
    @scala.inline
    def setNextToken(value: String): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
