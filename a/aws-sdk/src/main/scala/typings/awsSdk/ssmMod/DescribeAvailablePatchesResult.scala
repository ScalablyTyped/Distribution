package typings.awsSdk.ssmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeAvailablePatchesResult extends StObject {
  
  /**
    * The token to use when requesting the next set of items. If there are no additional items to return, the string is empty.
    */
  var NextToken: js.UndefOr[typings.awsSdk.ssmMod.NextToken] = js.undefined
  
  /**
    * An array of patches. Each entry in the array is a patch structure.
    */
  var Patches: js.UndefOr[PatchList] = js.undefined
}
object DescribeAvailablePatchesResult {
  
  inline def apply(): DescribeAvailablePatchesResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeAvailablePatchesResult]
  }
  
  extension [Self <: DescribeAvailablePatchesResult](x: Self) {
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setPatches(value: PatchList): Self = StObject.set(x, "Patches", value.asInstanceOf[js.Any])
    
    inline def setPatchesUndefined: Self = StObject.set(x, "Patches", js.undefined)
    
    inline def setPatchesVarargs(value: Patch*): Self = StObject.set(x, "Patches", js.Array(value*))
  }
}
