package typings.awsSdk.cloudformationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeStackSetOutput extends js.Object {
  
  /**
    * The specified stack set.
    */
  var StackSet: js.UndefOr[typings.awsSdk.cloudformationMod.StackSet] = js.native
}
object DescribeStackSetOutput {
  
  @scala.inline
  def apply(): DescribeStackSetOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeStackSetOutput]
  }
  
  @scala.inline
  implicit class DescribeStackSetOutputOps[Self <: DescribeStackSetOutput] (val x: Self) extends AnyVal {
    
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
    def setStackSet(value: StackSet): Self = this.set("StackSet", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStackSet: Self = this.set("StackSet", js.undefined)
  }
}
