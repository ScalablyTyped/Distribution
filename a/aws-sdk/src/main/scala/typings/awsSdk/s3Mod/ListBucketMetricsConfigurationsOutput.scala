package typings.awsSdk.s3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListBucketMetricsConfigurationsOutput extends js.Object {
  
  /**
    * The marker that is used as a starting point for this metrics configuration list response. This value is present if it was sent in the request.
    */
  var ContinuationToken: js.UndefOr[Token] = js.native
  
  /**
    * Indicates whether the returned list of metrics configurations is complete. A value of true indicates that the list is not complete and the NextContinuationToken will be provided for a subsequent request.
    */
  var IsTruncated: js.UndefOr[typings.awsSdk.s3Mod.IsTruncated] = js.native
  
  /**
    * The list of metrics configurations for a bucket.
    */
  var MetricsConfigurationList: js.UndefOr[typings.awsSdk.s3Mod.MetricsConfigurationList] = js.native
  
  /**
    * The marker used to continue a metrics configuration listing that has been truncated. Use the NextContinuationToken from a previously truncated list response to continue the listing. The continuation token is an opaque value that Amazon S3 understands.
    */
  var NextContinuationToken: js.UndefOr[NextToken] = js.native
}
object ListBucketMetricsConfigurationsOutput {
  
  @scala.inline
  def apply(): ListBucketMetricsConfigurationsOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListBucketMetricsConfigurationsOutput]
  }
  
  @scala.inline
  implicit class ListBucketMetricsConfigurationsOutputOps[Self <: ListBucketMetricsConfigurationsOutput] (val x: Self) extends AnyVal {
    
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
    def setIsTruncated(value: IsTruncated): Self = this.set("IsTruncated", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsTruncated: Self = this.set("IsTruncated", js.undefined)
    
    @scala.inline
    def setMetricsConfigurationListVarargs(value: MetricsConfiguration*): Self = this.set("MetricsConfigurationList", js.Array(value :_*))
    
    @scala.inline
    def setMetricsConfigurationList(value: MetricsConfigurationList): Self = this.set("MetricsConfigurationList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMetricsConfigurationList: Self = this.set("MetricsConfigurationList", js.undefined)
    
    @scala.inline
    def setNextContinuationToken(value: NextToken): Self = this.set("NextContinuationToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextContinuationToken: Self = this.set("NextContinuationToken", js.undefined)
  }
}
