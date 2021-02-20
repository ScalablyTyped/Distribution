package typings.awsSdk.gameliftMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeInstancesOutput extends StObject {
  
  /**
    * A collection of objects containing properties for each instance returned.
    */
  var Instances: js.UndefOr[InstanceList] = js.native
  
  /**
    * Token that indicates where to resume retrieving results on the next call to this operation. If no token is returned, these results represent the end of the list.
    */
  var NextToken: js.UndefOr[NonZeroAndMaxString] = js.native
}
object DescribeInstancesOutput {
  
  @scala.inline
  def apply(): DescribeInstancesOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeInstancesOutput]
  }
  
  @scala.inline
  implicit class DescribeInstancesOutputMutableBuilder[Self <: DescribeInstancesOutput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInstances(value: InstanceList): Self = StObject.set(x, "Instances", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInstancesUndefined: Self = StObject.set(x, "Instances", js.undefined)
    
    @scala.inline
    def setInstancesVarargs(value: Instance*): Self = StObject.set(x, "Instances", js.Array(value :_*))
    
    @scala.inline
    def setNextToken(value: NonZeroAndMaxString): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
