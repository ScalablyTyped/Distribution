package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeByoipCidrsResult extends StObject {
  
  /**
    * Information about your address ranges.
    */
  var ByoipCidrs: js.UndefOr[ByoipCidrSet] = js.undefined
  
  /**
    * The token to use to retrieve the next page of results. This value is null when there are no more results to return.
    */
  var NextToken: js.UndefOr[String] = js.undefined
}
object DescribeByoipCidrsResult {
  
  inline def apply(): DescribeByoipCidrsResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeByoipCidrsResult]
  }
  
  extension [Self <: DescribeByoipCidrsResult](x: Self) {
    
    inline def setByoipCidrs(value: ByoipCidrSet): Self = StObject.set(x, "ByoipCidrs", value.asInstanceOf[js.Any])
    
    inline def setByoipCidrsUndefined: Self = StObject.set(x, "ByoipCidrs", js.undefined)
    
    inline def setByoipCidrsVarargs(value: ByoipCidr*): Self = StObject.set(x, "ByoipCidrs", js.Array(value :_*))
    
    inline def setNextToken(value: String): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
