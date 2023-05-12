package typings.awsSdk2Types.clientsSsmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListOpsMetadataResult extends StObject {
  
  /**
    * The token for the next set of items to return. Use this token to get the next set of results.
    */
  var NextToken: js.UndefOr[typings.awsSdk2Types.clientsSsmMod.NextToken] = js.undefined
  
  /**
    * Returns a list of OpsMetadata objects.
    */
  var OpsMetadataList: js.UndefOr[typings.awsSdk2Types.clientsSsmMod.OpsMetadataList] = js.undefined
}
object ListOpsMetadataResult {
  
  inline def apply(): ListOpsMetadataResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListOpsMetadataResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListOpsMetadataResult] (val x: Self) extends AnyVal {
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setOpsMetadataList(value: OpsMetadataList): Self = StObject.set(x, "OpsMetadataList", value.asInstanceOf[js.Any])
    
    inline def setOpsMetadataListUndefined: Self = StObject.set(x, "OpsMetadataList", js.undefined)
    
    inline def setOpsMetadataListVarargs(value: OpsMetadata*): Self = StObject.set(x, "OpsMetadataList", js.Array(value*))
  }
}
