package typings.awsSdk.configserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeRetentionConfigurationsRequest extends StObject {
  
  /**
    * The nextToken string returned on a previous page that you use to get the next page of results in a paginated response. 
    */
  var NextToken: js.UndefOr[typings.awsSdk.configserviceMod.NextToken] = js.undefined
  
  /**
    * A list of names of retention configurations for which you want details. If you do not specify a name, AWS Config returns details for all the retention configurations for that account.  Currently, AWS Config supports only one retention configuration per region in your account. 
    */
  var RetentionConfigurationNames: js.UndefOr[RetentionConfigurationNameList] = js.undefined
}
object DescribeRetentionConfigurationsRequest {
  
  inline def apply(): DescribeRetentionConfigurationsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeRetentionConfigurationsRequest]
  }
  
  extension [Self <: DescribeRetentionConfigurationsRequest](x: Self) {
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setRetentionConfigurationNames(value: RetentionConfigurationNameList): Self = StObject.set(x, "RetentionConfigurationNames", value.asInstanceOf[js.Any])
    
    inline def setRetentionConfigurationNamesUndefined: Self = StObject.set(x, "RetentionConfigurationNames", js.undefined)
    
    inline def setRetentionConfigurationNamesVarargs(value: RetentionConfigurationName*): Self = StObject.set(x, "RetentionConfigurationNames", js.Array(value :_*))
  }
}
