package typings.awsSdk.configserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeRemediationExceptionsRequest extends StObject {
  
  /**
    * The name of the AWS Config rule.
    */
  var ConfigRuleName: typings.awsSdk.configserviceMod.ConfigRuleName
  
  /**
    * The maximum number of RemediationExceptionResourceKey returned on each page. The default is 25. If you specify 0, AWS Config uses the default.
    */
  var Limit: js.UndefOr[typings.awsSdk.configserviceMod.Limit] = js.undefined
  
  /**
    * The nextToken string returned in a previous request that you use to request the next page of results in a paginated response.
    */
  var NextToken: js.UndefOr[String] = js.undefined
  
  /**
    * An exception list of resource exception keys to be processed with the current request. AWS Config adds exception for each resource key. For example, AWS Config adds 3 exceptions for 3 resource keys. 
    */
  var ResourceKeys: js.UndefOr[RemediationExceptionResourceKeys] = js.undefined
}
object DescribeRemediationExceptionsRequest {
  
  @scala.inline
  def apply(ConfigRuleName: ConfigRuleName): DescribeRemediationExceptionsRequest = {
    val __obj = js.Dynamic.literal(ConfigRuleName = ConfigRuleName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeRemediationExceptionsRequest]
  }
  
  @scala.inline
  implicit class DescribeRemediationExceptionsRequestMutableBuilder[Self <: DescribeRemediationExceptionsRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setConfigRuleName(value: ConfigRuleName): Self = StObject.set(x, "ConfigRuleName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLimit(value: Limit): Self = StObject.set(x, "Limit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLimitUndefined: Self = StObject.set(x, "Limit", js.undefined)
    
    @scala.inline
    def setNextToken(value: String): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    @scala.inline
    def setResourceKeys(value: RemediationExceptionResourceKeys): Self = StObject.set(x, "ResourceKeys", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceKeysUndefined: Self = StObject.set(x, "ResourceKeys", js.undefined)
    
    @scala.inline
    def setResourceKeysVarargs(value: RemediationExceptionResourceKey*): Self = StObject.set(x, "ResourceKeys", js.Array(value :_*))
  }
}
