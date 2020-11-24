package typings.awsSdk.s3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListBucketIntelligentTieringConfigurationsOutput extends js.Object {
  
  /**
    * The ContinuationToken that represents a placeholder from where this request should begin.
    */
  var ContinuationToken: js.UndefOr[Token] = js.native
  
  /**
    * The list of S3 Intelligent-Tiering configurations for a bucket.
    */
  var IntelligentTieringConfigurationList: js.UndefOr[typings.awsSdk.s3Mod.IntelligentTieringConfigurationList] = js.native
  
  /**
    * Indicates whether the returned list of analytics configurations is complete. A value of true indicates that the list is not complete and the NextContinuationToken will be provided for a subsequent request.
    */
  var IsTruncated: js.UndefOr[typings.awsSdk.s3Mod.IsTruncated] = js.native
  
  /**
    * The marker used to continue this inventory configuration listing. Use the NextContinuationToken from this response to continue the listing in a subsequent request. The continuation token is an opaque value that Amazon S3 understands.
    */
  var NextContinuationToken: js.UndefOr[NextToken] = js.native
}
object ListBucketIntelligentTieringConfigurationsOutput {
  
  @scala.inline
  def apply(): ListBucketIntelligentTieringConfigurationsOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListBucketIntelligentTieringConfigurationsOutput]
  }
  
  @scala.inline
  implicit class ListBucketIntelligentTieringConfigurationsOutputOps[Self <: ListBucketIntelligentTieringConfigurationsOutput] (val x: Self) extends AnyVal {
    
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
    def setContinuationToken(value: Token): Self = this.set("ContinuationToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContinuationToken: Self = this.set("ContinuationToken", js.undefined)
    
    @scala.inline
    def setIntelligentTieringConfigurationListVarargs(value: IntelligentTieringConfiguration*): Self = this.set("IntelligentTieringConfigurationList", js.Array(value :_*))
    
    @scala.inline
    def setIntelligentTieringConfigurationList(value: IntelligentTieringConfigurationList): Self = this.set("IntelligentTieringConfigurationList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIntelligentTieringConfigurationList: Self = this.set("IntelligentTieringConfigurationList", js.undefined)
    
    @scala.inline
    def setIsTruncated(value: IsTruncated): Self = this.set("IsTruncated", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsTruncated: Self = this.set("IsTruncated", js.undefined)
    
    @scala.inline
    def setNextContinuationToken(value: NextToken): Self = this.set("NextContinuationToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextContinuationToken: Self = this.set("NextContinuationToken", js.undefined)
  }
}
