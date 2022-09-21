package typings.awsSdk.pinpointsmsvoicev2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeAccountAttributesResult extends StObject {
  
  /**
    * An array of AccountAttributes objects.
    */
  var AccountAttributes: js.UndefOr[AccountAttributeList] = js.undefined
  
  /**
    * The token to be used for the next set of paginated results. If this field is empty then there are no more results.
    */
  var NextToken: js.UndefOr[typings.awsSdk.pinpointsmsvoicev2Mod.NextToken] = js.undefined
}
object DescribeAccountAttributesResult {
  
  inline def apply(): DescribeAccountAttributesResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeAccountAttributesResult]
  }
  
  extension [Self <: DescribeAccountAttributesResult](x: Self) {
    
    inline def setAccountAttributes(value: AccountAttributeList): Self = StObject.set(x, "AccountAttributes", value.asInstanceOf[js.Any])
    
    inline def setAccountAttributesUndefined: Self = StObject.set(x, "AccountAttributes", js.undefined)
    
    inline def setAccountAttributesVarargs(value: AccountAttribute*): Self = StObject.set(x, "AccountAttributes", js.Array(value*))
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
