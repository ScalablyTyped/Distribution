package typings.awsSdk.ssmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeAvailablePatchesResult extends js.Object {
  
  /**
    * The token to use when requesting the next set of items. If there are no additional items to return, the string is empty.
    */
  var NextToken: js.UndefOr[typings.awsSdk.ssmMod.NextToken] = js.native
  
  /**
    * An array of patches. Each entry in the array is a patch structure.
    */
  var Patches: js.UndefOr[PatchList] = js.native
}
object DescribeAvailablePatchesResult {
  
  @scala.inline
  def apply(): DescribeAvailablePatchesResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeAvailablePatchesResult]
  }
  
  @scala.inline
  implicit class DescribeAvailablePatchesResultOps[Self <: DescribeAvailablePatchesResult] (val x: Self) extends AnyVal {
    
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
    def setNextToken(value: NextToken): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
    
    @scala.inline
    def setPatchesVarargs(value: Patch*): Self = this.set("Patches", js.Array(value :_*))
    
    @scala.inline
    def setPatches(value: PatchList): Self = this.set("Patches", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePatches: Self = this.set("Patches", js.undefined)
  }
}
