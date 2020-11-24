package typings.awsSdk.ssmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeInstancePatchStatesResult extends js.Object {
  
  /**
    * The high-level patch state for the requested instances.
    */
  var InstancePatchStates: js.UndefOr[InstancePatchStateList] = js.native
  
  /**
    * The token to use when requesting the next set of items. If there are no additional items to return, the string is empty.
    */
  var NextToken: js.UndefOr[typings.awsSdk.ssmMod.NextToken] = js.native
}
object DescribeInstancePatchStatesResult {
  
  @scala.inline
  def apply(): DescribeInstancePatchStatesResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeInstancePatchStatesResult]
  }
  
  @scala.inline
  implicit class DescribeInstancePatchStatesResultOps[Self <: DescribeInstancePatchStatesResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setInstancePatchStatesVarargs(value: InstancePatchState*): Self = this.set("InstancePatchStates", js.Array(value :_*))
    
    @scala.inline
    def setInstancePatchStates(value: InstancePatchStateList): Self = this.set("InstancePatchStates", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInstancePatchStates: Self = this.set("InstancePatchStates", js.undefined)
    
    @scala.inline
    def setNextToken(value: NextToken): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
  }
}
