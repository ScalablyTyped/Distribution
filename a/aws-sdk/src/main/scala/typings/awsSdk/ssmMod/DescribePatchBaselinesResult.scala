package typings.awsSdk.ssmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribePatchBaselinesResult extends js.Object {
  
  /**
    * An array of PatchBaselineIdentity elements.
    */
  var BaselineIdentities: js.UndefOr[PatchBaselineIdentityList] = js.native
  
  /**
    * The token to use when requesting the next set of items. If there are no additional items to return, the string is empty.
    */
  var NextToken: js.UndefOr[typings.awsSdk.ssmMod.NextToken] = js.native
}
object DescribePatchBaselinesResult {
  
  @scala.inline
  def apply(): DescribePatchBaselinesResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribePatchBaselinesResult]
  }
  
  @scala.inline
  implicit class DescribePatchBaselinesResultOps[Self <: DescribePatchBaselinesResult] (val x: Self) extends AnyVal {
    
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
    def setBaselineIdentitiesVarargs(value: PatchBaselineIdentity*): Self = this.set("BaselineIdentities", js.Array(value :_*))
    
    @scala.inline
    def setBaselineIdentities(value: PatchBaselineIdentityList): Self = this.set("BaselineIdentities", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBaselineIdentities: Self = this.set("BaselineIdentities", js.undefined)
    
    @scala.inline
    def setNextToken(value: NextToken): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
  }
}
