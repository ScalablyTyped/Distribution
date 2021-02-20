package typings.awsSdk.cloudformationMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeStacksOutput extends StObject {
  
  /**
    * If the output exceeds 1 MB in size, a string that identifies the next page of stacks. If no additional page exists, this value is null.
    */
  var NextToken: js.UndefOr[typings.awsSdk.cloudformationMod.NextToken] = js.native
  
  /**
    * A list of stack structures.
    */
  var Stacks: js.UndefOr[typings.awsSdk.cloudformationMod.Stacks] = js.native
}
object DescribeStacksOutput {
  
  @scala.inline
  def apply(): DescribeStacksOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeStacksOutput]
  }
  
  @scala.inline
  implicit class DescribeStacksOutputMutableBuilder[Self <: DescribeStacksOutput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    @scala.inline
    def setStacks(value: Stacks): Self = StObject.set(x, "Stacks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStacksUndefined: Self = StObject.set(x, "Stacks", js.undefined)
    
    @scala.inline
    def setStacksVarargs(value: Stack*): Self = StObject.set(x, "Stacks", js.Array(value :_*))
  }
}
