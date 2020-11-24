package typings.awsSdk.s3controlMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListRegionalBucketsResult extends js.Object {
  
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
  implicit class ListRegionalBucketsResultOps[Self <: ListRegionalBucketsResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setNextToken(value: NonEmptyMaxLength1024String): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
    
    @scala.inline
    def setRegionalBucketListVarargs(value: RegionalBucket*): Self = this.set("RegionalBucketList", js.Array(value :_*))
    
    @scala.inline
    def setRegionalBucketList(value: RegionalBucketList): Self = this.set("RegionalBucketList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRegionalBucketList: Self = this.set("RegionalBucketList", js.undefined)
  }
}
