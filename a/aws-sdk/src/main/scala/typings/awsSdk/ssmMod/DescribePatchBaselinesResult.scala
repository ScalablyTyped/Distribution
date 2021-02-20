package typings.awsSdk.ssmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribePatchBaselinesResult extends StObject {
  
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
  implicit class DescribePatchBaselinesResultMutableBuilder[Self <: DescribePatchBaselinesResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBaselineIdentities(value: PatchBaselineIdentityList): Self = StObject.set(x, "BaselineIdentities", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBaselineIdentitiesUndefined: Self = StObject.set(x, "BaselineIdentities", js.undefined)
    
    @scala.inline
    def setBaselineIdentitiesVarargs(value: PatchBaselineIdentity*): Self = StObject.set(x, "BaselineIdentities", js.Array(value :_*))
    
    @scala.inline
    def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
