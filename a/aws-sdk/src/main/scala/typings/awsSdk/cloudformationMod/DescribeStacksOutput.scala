package typings.awsSdk.cloudformationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeStacksOutput extends js.Object {
  
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
  implicit class DescribeStacksOutputOps[Self <: DescribeStacksOutput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setNextToken(value: NextToken): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
    
    @scala.inline
    def setStacksVarargs(value: Stack*): Self = this.set("Stacks", js.Array(value :_*))
    
    @scala.inline
    def setStacks(value: Stacks): Self = this.set("Stacks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStacks: Self = this.set("Stacks", js.undefined)
  }
}
