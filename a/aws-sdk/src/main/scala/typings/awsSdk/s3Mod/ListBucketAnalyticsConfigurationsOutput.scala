package typings.awsSdk.s3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListBucketAnalyticsConfigurationsOutput extends js.Object {
  /**
    * The list of analytics configurations for a bucket.
    */
  var AnalyticsConfigurationList: js.UndefOr[typings.awsSdk.s3Mod.AnalyticsConfigurationList] = js.native
  /**
    * The marker that is used as a starting point for this analytics configuration list response. This value is present if it was sent in the request.
    */
  var ContinuationToken: js.UndefOr[Token] = js.native
  /**
    * Indicates whether the returned list of analytics configurations is complete. A value of true indicates that the list is not complete and the NextContinuationToken will be provided for a subsequent request.
    */
  var IsTruncated: js.UndefOr[typings.awsSdk.s3Mod.IsTruncated] = js.native
  /**
    *  NextContinuationToken is sent when isTruncated is true, which indicates that there are more analytics configurations to list. The next request must include this NextContinuationToken. The token is obfuscated and is not a usable value.
    */
  var NextContinuationToken: js.UndefOr[NextToken] = js.native
}

object ListBucketAnalyticsConfigurationsOutput {
  @scala.inline
  def apply(): ListBucketAnalyticsConfigurationsOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListBucketAnalyticsConfigurationsOutput]
  }
  @scala.inline
  implicit class ListBucketAnalyticsConfigurationsOutputOps[Self <: ListBucketAnalyticsConfigurationsOutput] (val x: Self) extends AnyVal {
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
    def setAnalyticsConfigurationListVarargs(value: AnalyticsConfiguration*): Self = this.set("AnalyticsConfigurationList", js.Array(value :_*))
    @scala.inline
    def setAnalyticsConfigurationList(value: AnalyticsConfigurationList): Self = this.set("AnalyticsConfigurationList", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAnalyticsConfigurationList: Self = this.set("AnalyticsConfigurationList", js.undefined)
    @scala.inline
    def setContinuationToken(value: Token): Self = this.set("ContinuationToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContinuationToken: Self = this.set("ContinuationToken", js.undefined)
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

