package typings.awsSdk.cloudformationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeStackResourcesOutput extends js.Object {
  
  /**
    * A list of StackResource structures.
    */
  var StackResources: js.UndefOr[typings.awsSdk.cloudformationMod.StackResources] = js.native
}
object DescribeStackResourcesOutput {
  
  @scala.inline
  def apply(): DescribeStackResourcesOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeStackResourcesOutput]
  }
  
  @scala.inline
  implicit class DescribeStackResourcesOutputOps[Self <: DescribeStackResourcesOutput] (val x: Self) extends AnyVal {
    
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
    def setStackResourcesVarargs(value: StackResource*): Self = this.set("StackResources", js.Array(value :_*))
    
    @scala.inline
    def setStackResources(value: StackResources): Self = this.set("StackResources", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStackResources: Self = this.set("StackResources", js.undefined)
  }
}
