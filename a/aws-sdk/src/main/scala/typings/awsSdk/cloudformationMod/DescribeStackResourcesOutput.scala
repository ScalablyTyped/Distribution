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
  
  inline def apply(): DescribeStackResourcesOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeStackResourcesOutput]
  }
  
  extension [Self <: DescribeStackResourcesOutput](x: Self) {
    
    inline def setStackResources(value: StackResources): Self = StObject.set(x, "StackResources", value.asInstanceOf[js.Any])
    
    inline def setStackResourcesUndefined: Self = StObject.set(x, "StackResources", js.undefined)
    
    inline def setStackResourcesVarargs(value: StackResource*): Self = StObject.set(x, "StackResources", js.Array(value :_*))
  }
}
