package typings.awsSdk.s3controlMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListRegionalBucketsResult extends StObject {
  
  /**
    *  NextToken is sent when isTruncated is true, which means there are more buckets that can be listed. The next list requests to Amazon S3 can be continued with this NextToken. NextToken is obfuscated and is not a real key.
    */
  var NextToken: js.UndefOr[NonEmptyMaxLength1024String] = js.native
  
  /**
    * 
    */
  var RegionalBucketList: js.UndefOr[typings.awsSdk.s3controlMod.RegionalBucketList] = js.native
}
object ListRegionalBucketsResult {
  
  @scala.inline
  def apply(): ListRegionalBucketsResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListRegionalBucketsResult]
  }
  
  @scala.inline
  implicit class ListRegionalBucketsResultMutableBuilder[Self <: ListRegionalBucketsResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNextToken(value: NonEmptyMaxLength1024String): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    @scala.inline
    def setRegionalBucketList(value: RegionalBucketList): Self = StObject.set(x, "RegionalBucketList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRegionalBucketListUndefined: Self = StObject.set(x, "RegionalBucketList", js.undefined)
    
    @scala.inline
    def setRegionalBucketListVarargs(value: RegionalBucket*): Self = StObject.set(x, "RegionalBucketList", js.Array(value :_*))
  }
}
