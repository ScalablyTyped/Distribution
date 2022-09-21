package typings.awsSdk.cloudformationMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeAccountLimitsOutput extends StObject {
  
  /**
    * An account limit structure that contain a list of CloudFormation account limits and their values.
    */
  var AccountLimits: js.UndefOr[AccountLimitList] = js.undefined
  
  /**
    * If the output exceeds 1 MB in size, a string that identifies the next page of limits. If no additional page exists, this value is null.
    */
  var NextToken: js.UndefOr[typings.awsSdk.cloudformationMod.NextToken] = js.undefined
}
object DescribeAccountLimitsOutput {
  
  inline def apply(): DescribeAccountLimitsOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeAccountLimitsOutput]
  }
  
  extension [Self <: DescribeAccountLimitsOutput](x: Self) {
    
    inline def setAccountLimits(value: AccountLimitList): Self = StObject.set(x, "AccountLimits", value.asInstanceOf[js.Any])
    
    inline def setAccountLimitsUndefined: Self = StObject.set(x, "AccountLimits", js.undefined)
    
    inline def setAccountLimitsVarargs(value: AccountLimit*): Self = StObject.set(x, "AccountLimits", js.Array(value*))
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
