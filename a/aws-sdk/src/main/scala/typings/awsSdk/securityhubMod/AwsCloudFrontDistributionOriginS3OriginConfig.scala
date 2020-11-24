package typings.awsSdk.securityhubMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AwsCloudFrontDistributionOriginS3OriginConfig extends js.Object {
  
  /**
    * The CloudFront origin access identity to associate with the origin.
    */
  var OriginAccessIdentity: js.UndefOr[NonEmptyString] = js.native
}
object AwsCloudFrontDistributionOriginS3OriginConfig {
  
  @scala.inline
  def apply(): AwsCloudFrontDistributionOriginS3OriginConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AwsCloudFrontDistributionOriginS3OriginConfig]
  }
  
  @scala.inline
  implicit class AwsCloudFrontDistributionOriginS3OriginConfigOps[Self <: AwsCloudFrontDistributionOriginS3OriginConfig] (val x: Self) extends AnyVal {
    
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
    def setOriginAccessIdentity(value: NonEmptyString): Self = this.set("OriginAccessIdentity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOriginAccessIdentity: Self = this.set("OriginAccessIdentity", js.undefined)
  }
}
