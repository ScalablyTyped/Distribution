package typings.awsSdk.s3Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListBucketAnalyticsConfigurationsOutput extends StObject {
  
  /**
    * The list of analytics configurations for a bucket.
    */
  var AnalyticsConfigurationList: js.UndefOr[typings.awsSdk.s3Mod.AnalyticsConfigurationList] = js.undefined
  
  /**
    * The marker that is used as a starting point for this analytics configuration list response. This value is present if it was sent in the request.
    */
  var ContinuationToken: js.UndefOr[Token] = js.undefined
  
  /**
    * Indicates whether the returned list of analytics configurations is complete. A value of true indicates that the list is not complete and the NextContinuationToken will be provided for a subsequent request.
    */
  var IsTruncated: js.UndefOr[typings.awsSdk.s3Mod.IsTruncated] = js.undefined
  
  /**
    *  NextContinuationToken is sent when isTruncated is true, which indicates that there are more analytics configurations to list. The next request must include this NextContinuationToken. The token is obfuscated and is not a usable value.
    */
  var NextContinuationToken: js.UndefOr[NextToken] = js.undefined
}
object ListBucketAnalyticsConfigurationsOutput {
  
  inline def apply(): ListBucketAnalyticsConfigurationsOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListBucketAnalyticsConfigurationsOutput]
  }
  
  extension [Self <: ListBucketAnalyticsConfigurationsOutput](x: Self) {
    
    inline def setAnalyticsConfigurationList(value: AnalyticsConfigurationList): Self = StObject.set(x, "AnalyticsConfigurationList", value.asInstanceOf[js.Any])
    
    inline def setAnalyticsConfigurationListUndefined: Self = StObject.set(x, "AnalyticsConfigurationList", js.undefined)
    
    inline def setAnalyticsConfigurationListVarargs(value: AnalyticsConfiguration*): Self = StObject.set(x, "AnalyticsConfigurationList", js.Array(value*))
    
    inline def setContinuationToken(value: Token): Self = StObject.set(x, "ContinuationToken", value.asInstanceOf[js.Any])
    
    inline def setContinuationTokenUndefined: Self = StObject.set(x, "ContinuationToken", js.undefined)
    
    inline def setIsTruncated(value: IsTruncated): Self = StObject.set(x, "IsTruncated", value.asInstanceOf[js.Any])
    
    inline def setIsTruncatedUndefined: Self = StObject.set(x, "IsTruncated", js.undefined)
    
    inline def setNextContinuationToken(value: NextToken): Self = StObject.set(x, "NextContinuationToken", value.asInstanceOf[js.Any])
    
    inline def setNextContinuationTokenUndefined: Self = StObject.set(x, "NextContinuationToken", js.undefined)
  }
}
