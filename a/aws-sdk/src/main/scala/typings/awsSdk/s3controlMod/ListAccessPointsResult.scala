package typings.awsSdk.s3controlMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListAccessPointsResult extends StObject {
  
  /**
    * Contains identification and configuration information for one or more access points associated with the specified bucket.
    */
  var AccessPointList: js.UndefOr[typings.awsSdk.s3controlMod.AccessPointList] = js.undefined
  
  /**
    * If the specified bucket has more access points than can be returned in one call to this API, this field contains a continuation token that you can provide in subsequent calls to this API to retrieve additional access points.
    */
  var NextToken: js.UndefOr[NonEmptyMaxLength1024String] = js.undefined
}
object ListAccessPointsResult {
  
  inline def apply(): ListAccessPointsResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListAccessPointsResult]
  }
  
  extension [Self <: ListAccessPointsResult](x: Self) {
    
    inline def setAccessPointList(value: AccessPointList): Self = StObject.set(x, "AccessPointList", value.asInstanceOf[js.Any])
    
    inline def setAccessPointListUndefined: Self = StObject.set(x, "AccessPointList", js.undefined)
    
    inline def setAccessPointListVarargs(value: AccessPoint*): Self = StObject.set(x, "AccessPointList", js.Array(value*))
    
    inline def setNextToken(value: NonEmptyMaxLength1024String): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
