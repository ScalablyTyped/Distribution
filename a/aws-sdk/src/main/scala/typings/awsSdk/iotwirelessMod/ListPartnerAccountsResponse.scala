package typings.awsSdk.iotwirelessMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListPartnerAccountsResponse extends StObject {
  
  /**
    * The token to use to get the next set of results, or null if there are no additional results.
    */
  var NextToken: js.UndefOr[typings.awsSdk.iotwirelessMod.NextToken] = js.undefined
  
  /**
    * The Sidewalk account credentials.
    */
  var Sidewalk: js.UndefOr[SidewalkAccountList] = js.undefined
}
object ListPartnerAccountsResponse {
  
  inline def apply(): ListPartnerAccountsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListPartnerAccountsResponse]
  }
  
  extension [Self <: ListPartnerAccountsResponse](x: Self) {
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setSidewalk(value: SidewalkAccountList): Self = StObject.set(x, "Sidewalk", value.asInstanceOf[js.Any])
    
    inline def setSidewalkUndefined: Self = StObject.set(x, "Sidewalk", js.undefined)
    
    inline def setSidewalkVarargs(value: SidewalkAccountInfoWithFingerprint*): Self = StObject.set(x, "Sidewalk", js.Array(value*))
  }
}
