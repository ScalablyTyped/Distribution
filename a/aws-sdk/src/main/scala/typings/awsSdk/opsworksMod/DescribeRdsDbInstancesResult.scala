package typings.awsSdk.opsworksMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeRdsDbInstancesResult extends StObject {
  
  /**
    * An a array of RdsDbInstance objects that describe the instances.
    */
  var RdsDbInstances: js.UndefOr[typings.awsSdk.opsworksMod.RdsDbInstances] = js.native
}
object DescribeRdsDbInstancesResult {
  
  @scala.inline
  def apply(): DescribeRdsDbInstancesResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeRdsDbInstancesResult]
  }
  
  @scala.inline
  implicit class DescribeRdsDbInstancesResultMutableBuilder[Self <: DescribeRdsDbInstancesResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRdsDbInstances(value: RdsDbInstances): Self = StObject.set(x, "RdsDbInstances", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRdsDbInstancesUndefined: Self = StObject.set(x, "RdsDbInstances", js.undefined)
    
    @scala.inline
    def setRdsDbInstancesVarargs(value: RdsDbInstance*): Self = StObject.set(x, "RdsDbInstances", js.Array(value :_*))
  }
}
