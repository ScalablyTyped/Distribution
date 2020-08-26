package typings.awsSdk.ssmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeInstancePatchStatesForPatchGroupResult extends js.Object {
  /**
    * The high-level patch state for the requested instances. 
    */
  var InstancePatchStates: js.UndefOr[InstancePatchStatesList] = js.native
  /**
    * The token to use when requesting the next set of items. If there are no additional items to return, the string is empty.
    */
  var NextToken: js.UndefOr[typings.awsSdk.ssmMod.NextToken] = js.native
}

object DescribeInstancePatchStatesForPatchGroupResult {
  @scala.inline
  def apply(): DescribeInstancePatchStatesForPatchGroupResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeInstancePatchStatesForPatchGroupResult]
  }
  @scala.inline
  implicit class DescribeInstancePatchStatesForPatchGroupResultOps[Self <: DescribeInstancePatchStatesForPatchGroupResult] (val x: Self) extends AnyVal {
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
    def setInstancePatchStates(value: InstancePatchStatesList): Self = this.set("InstancePatchStates", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInstancePatchStates: Self = this.set("InstancePatchStates", js.undefined)
    @scala.inline
    def setNextToken(value: NextToken): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
  }
  
}

