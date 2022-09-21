package typings.awsSdk.cloudhsmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListHapgsResponse extends StObject {
  
  /**
    * The list of high-availability partition groups.
    */
  var HapgList: typings.awsSdk.cloudhsmMod.HapgList
  
  /**
    * If not null, more results are available. Pass this value to ListHapgs to retrieve the next set of items.
    */
  var NextToken: js.UndefOr[PaginationToken] = js.undefined
}
object ListHapgsResponse {
  
  inline def apply(HapgList: HapgList): ListHapgsResponse = {
    val __obj = js.Dynamic.literal(HapgList = HapgList.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListHapgsResponse]
  }
  
  extension [Self <: ListHapgsResponse](x: Self) {
    
    inline def setHapgList(value: HapgList): Self = StObject.set(x, "HapgList", value.asInstanceOf[js.Any])
    
    inline def setHapgListVarargs(value: HapgArn*): Self = StObject.set(x, "HapgList", js.Array(value*))
    
    inline def setNextToken(value: PaginationToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
