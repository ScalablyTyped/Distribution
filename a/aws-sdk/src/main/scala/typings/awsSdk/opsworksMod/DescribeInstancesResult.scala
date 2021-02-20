package typings.awsSdk.opsworksMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeInstancesResult extends StObject {
  
  /**
    * An array of Instance objects that describe the instances.
    */
  var Instances: js.UndefOr[typings.awsSdk.opsworksMod.Instances] = js.native
}
object DescribeInstancesResult {
  
  @scala.inline
  def apply(): DescribeInstancesResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeInstancesResult]
  }
  
  @scala.inline
  implicit class DescribeInstancesResultMutableBuilder[Self <: DescribeInstancesResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInstances(value: Instances): Self = StObject.set(x, "Instances", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInstancesUndefined: Self = StObject.set(x, "Instances", js.undefined)
    
    @scala.inline
    def setInstancesVarargs(value: Instance*): Self = StObject.set(x, "Instances", js.Array(value :_*))
  }
}
