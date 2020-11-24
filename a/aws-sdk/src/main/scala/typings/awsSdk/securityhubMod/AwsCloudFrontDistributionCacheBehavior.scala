package typings.awsSdk.securityhubMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AwsCloudFrontDistributionCacheBehavior extends js.Object {
  
  /**
    * The protocol that viewers can use to access the files in an origin. You can specify the following options:    allow-all - Viewers can use HTTP or HTTPS.    redirect-to-https - CloudFront responds to HTTP requests with an HTTP status code of 301 (Moved Permanently) and the HTTPS URL. The viewer then uses the new URL to resubmit.    https-only - CloudFront responds to HTTP request with an HTTP status code of 403 (Forbidden).  
    */
  var ViewerProtocolPolicy: js.UndefOr[NonEmptyString] = js.native
}
object AwsCloudFrontDistributionCacheBehavior {
  
  @scala.inline
  def apply(): AwsCloudFrontDistributionCacheBehavior = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AwsCloudFrontDistributionCacheBehavior]
  }
  
  @scala.inline
  implicit class AwsCloudFrontDistributionCacheBehaviorOps[Self <: AwsCloudFrontDistributionCacheBehavior] (val x: Self) extends AnyVal {
    
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
    def setViewerProtocolPolicy(value: NonEmptyString): Self = this.set("ViewerProtocolPolicy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteViewerProtocolPolicy: Self = this.set("ViewerProtocolPolicy", js.undefined)
  }
}
