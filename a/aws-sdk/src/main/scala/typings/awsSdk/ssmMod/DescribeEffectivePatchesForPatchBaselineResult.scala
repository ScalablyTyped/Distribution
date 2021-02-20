package typings.awsSdk.ssmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeEffectivePatchesForPatchBaselineResult extends StObject {
  
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
  implicit class DescribeEffectivePatchesForPatchBaselineResultMutableBuilder[Self <: DescribeEffectivePatchesForPatchBaselineResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEffectivePatches(value: EffectivePatchList): Self = StObject.set(x, "EffectivePatches", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEffectivePatchesUndefined: Self = StObject.set(x, "EffectivePatches", js.undefined)
    
    @scala.inline
    def setEffectivePatchesVarargs(value: EffectivePatch*): Self = StObject.set(x, "EffectivePatches", js.Array(value :_*))
    
    @scala.inline
    def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
