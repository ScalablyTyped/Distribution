package typings.awsSdk.cloudformationMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeStackResourcesOutput extends StObject {
  
  /**
    * A list of StackResource structures.
    */
  var StackResources: js.UndefOr[typings.awsSdk.cloudformationMod.StackResources] = js.undefined
}
object DescribeStackResourcesOutput {
  
  @scala.inline
  def apply(): DescribeStackResourcesOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeStackResourcesOutput]
  }
  
  @scala.inline
  implicit class DescribeStackResourcesOutputMutableBuilder[Self <: DescribeStackResourcesOutput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setStackResources(value: StackResources): Self = StObject.set(x, "StackResources", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStackResourcesUndefined: Self = StObject.set(x, "StackResources", js.undefined)
    
    @scala.inline
    def setStackResourcesVarargs(value: StackResource*): Self = StObject.set(x, "StackResources", js.Array(value :_*))
  }
}
