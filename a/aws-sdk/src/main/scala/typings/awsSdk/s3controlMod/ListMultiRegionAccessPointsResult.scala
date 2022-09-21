package typings.awsSdk.s3controlMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListMultiRegionAccessPointsResult extends StObject {
  
  /**
    * The list of Multi-Region Access Points associated with the user.
    */
  var AccessPoints: js.UndefOr[MultiRegionAccessPointReportList] = js.undefined
  
  /**
    * If the specified bucket has more Multi-Region Access Points than can be returned in one call to this action, this field contains a continuation token. You can use this token tin subsequent calls to this action to retrieve additional Multi-Region Access Points.
    */
  var NextToken: js.UndefOr[NonEmptyMaxLength1024String] = js.undefined
}
object ListMultiRegionAccessPointsResult {
  
  inline def apply(): ListMultiRegionAccessPointsResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListMultiRegionAccessPointsResult]
  }
  
  extension [Self <: ListMultiRegionAccessPointsResult](x: Self) {
    
    inline def setAccessPoints(value: MultiRegionAccessPointReportList): Self = StObject.set(x, "AccessPoints", value.asInstanceOf[js.Any])
    
    inline def setAccessPointsUndefined: Self = StObject.set(x, "AccessPoints", js.undefined)
    
    inline def setAccessPointsVarargs(value: MultiRegionAccessPointReport*): Self = StObject.set(x, "AccessPoints", js.Array(value*))
    
    inline def setNextToken(value: NonEmptyMaxLength1024String): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
