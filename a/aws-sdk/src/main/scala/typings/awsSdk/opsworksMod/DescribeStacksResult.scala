package typings.awsSdk.opsworksMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeStacksResult extends StObject {
  
  /**
    * An array of Stack objects that describe the stacks.
    */
  var Stacks: js.UndefOr[typings.awsSdk.opsworksMod.Stacks] = js.undefined
}
object DescribeStacksResult {
  
  inline def apply(): DescribeStacksResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeStacksResult]
  }
  
  extension [Self <: DescribeStacksResult](x: Self) {
    
    inline def setStacks(value: Stacks): Self = StObject.set(x, "Stacks", value.asInstanceOf[js.Any])
    
    inline def setStacksUndefined: Self = StObject.set(x, "Stacks", js.undefined)
    
    inline def setStacksVarargs(value: Stack*): Self = StObject.set(x, "Stacks", js.Array(value :_*))
  }
}
