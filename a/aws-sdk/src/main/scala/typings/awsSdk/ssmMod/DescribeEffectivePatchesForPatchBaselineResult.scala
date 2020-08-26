package typings.awsSdk.ssmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeEffectivePatchesForPatchBaselineResult extends js.Object {
  /**
    * An array of patches and patch status.
    */
  var EffectivePatches: js.UndefOr[EffectivePatchList] = js.native
  /**
    * The token to use when requesting the next set of items. If there are no additional items to return, the string is empty.
    */
  var NextToken: js.UndefOr[typings.awsSdk.ssmMod.NextToken] = js.native
}

object DescribeEffectivePatchesForPatchBaselineResult {
  @scala.inline
  def apply(): DescribeEffectivePatchesForPatchBaselineResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeEffectivePatchesForPatchBaselineResult]
  }
  @scala.inline
  implicit class DescribeEffectivePatchesForPatchBaselineResultOps[Self <: DescribeEffectivePatchesForPatchBaselineResult] (val x: Self) extends AnyVal {
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
    def setEffectivePatchesVarargs(value: EffectivePatch*): Self = this.set("EffectivePatches", js.Array(value :_*))
    @scala.inline
    def setEffectivePatches(value: EffectivePatchList): Self = this.set("EffectivePatches", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEffectivePatches: Self = this.set("EffectivePatches", js.undefined)
    @scala.inline
    def setNextToken(value: NextToken): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
  }
  
}

