package typings.awsSdk.ssmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribePatchGroupsResult extends StObject {
  
  /**
    * Each entry in the array contains: PatchGroup: string (between 1 and 256 characters, Regex: ^([\p{L}\p{Z}\p{N}_.:/=+\-@]*)$) PatchBaselineIdentity: A PatchBaselineIdentity element. 
    */
  var Mappings: js.UndefOr[PatchGroupPatchBaselineMappingList] = js.undefined
  
  /**
    * The token to use when requesting the next set of items. If there are no additional items to return, the string is empty.
    */
  var NextToken: js.UndefOr[typings.awsSdk.ssmMod.NextToken] = js.undefined
}
object DescribePatchGroupsResult {
  
  inline def apply(): DescribePatchGroupsResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribePatchGroupsResult]
  }
  
  extension [Self <: DescribePatchGroupsResult](x: Self) {
    
    inline def setMappings(value: PatchGroupPatchBaselineMappingList): Self = StObject.set(x, "Mappings", value.asInstanceOf[js.Any])
    
    inline def setMappingsUndefined: Self = StObject.set(x, "Mappings", js.undefined)
    
    inline def setMappingsVarargs(value: PatchGroupPatchBaselineMapping*): Self = StObject.set(x, "Mappings", js.Array(value :_*))
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
