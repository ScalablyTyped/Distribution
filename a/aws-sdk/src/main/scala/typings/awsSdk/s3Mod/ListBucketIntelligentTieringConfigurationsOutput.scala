package typings.awsSdk.s3Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListBucketIntelligentTieringConfigurationsOutput extends StObject {
  
  /**
    * The ContinuationToken that represents a placeholder from where this request should begin.
    */
  var ContinuationToken: js.UndefOr[Token] = js.undefined
  
  /**
    * The list of S3 Intelligent-Tiering configurations for a bucket.
    */
  var IntelligentTieringConfigurationList: js.UndefOr[typings.awsSdk.s3Mod.IntelligentTieringConfigurationList] = js.undefined
  
  /**
    * Indicates whether the returned list of analytics configurations is complete. A value of true indicates that the list is not complete and the NextContinuationToken will be provided for a subsequent request.
    */
  var IsTruncated: js.UndefOr[typings.awsSdk.s3Mod.IsTruncated] = js.undefined
  
  /**
    * The marker used to continue this inventory configuration listing. Use the NextContinuationToken from this response to continue the listing in a subsequent request. The continuation token is an opaque value that Amazon S3 understands.
    */
  var NextContinuationToken: js.UndefOr[NextToken] = js.undefined
}
object ListBucketIntelligentTieringConfigurationsOutput {
  
  inline def apply(): ListBucketIntelligentTieringConfigurationsOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListBucketIntelligentTieringConfigurationsOutput]
  }
  
  extension [Self <: ListBucketIntelligentTieringConfigurationsOutput](x: Self) {
    
    inline def setContinuationToken(value: Token): Self = StObject.set(x, "ContinuationToken", value.asInstanceOf[js.Any])
    
    inline def setContinuationTokenUndefined: Self = StObject.set(x, "ContinuationToken", js.undefined)
    
    inline def setIntelligentTieringConfigurationList(value: IntelligentTieringConfigurationList): Self = StObject.set(x, "IntelligentTieringConfigurationList", value.asInstanceOf[js.Any])
    
    inline def setIntelligentTieringConfigurationListUndefined: Self = StObject.set(x, "IntelligentTieringConfigurationList", js.undefined)
    
    inline def setIntelligentTieringConfigurationListVarargs(value: IntelligentTieringConfiguration*): Self = StObject.set(x, "IntelligentTieringConfigurationList", js.Array(value*))
    
    inline def setIsTruncated(value: IsTruncated): Self = StObject.set(x, "IsTruncated", value.asInstanceOf[js.Any])
    
    inline def setIsTruncatedUndefined: Self = StObject.set(x, "IsTruncated", js.undefined)
    
    inline def setNextContinuationToken(value: NextToken): Self = StObject.set(x, "NextContinuationToken", value.asInstanceOf[js.Any])
    
    inline def setNextContinuationTokenUndefined: Self = StObject.set(x, "NextContinuationToken", js.undefined)
  }
}
