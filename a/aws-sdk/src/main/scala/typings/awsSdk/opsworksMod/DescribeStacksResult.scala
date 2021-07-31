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
  
  @scala.inline
  def apply(): DescribeStacksResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeStacksResult]
  }
  
  @scala.inline
  implicit class DescribeStacksResultMutableBuilder[Self <: DescribeStacksResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setStacks(value: Stacks): Self = StObject.set(x, "Stacks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStacksUndefined: Self = StObject.set(x, "Stacks", js.undefined)
    
    @scala.inline
    def setStacksVarargs(value: Stack*): Self = StObject.set(x, "Stacks", js.Array(value :_*))
  }
}
