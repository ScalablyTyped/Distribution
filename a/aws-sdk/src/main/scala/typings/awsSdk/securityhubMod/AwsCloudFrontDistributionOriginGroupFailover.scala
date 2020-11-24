package typings.awsSdk.securityhubMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AwsCloudFrontDistributionOriginGroupFailover extends js.Object {
  
  /**
    * Information about the status codes that cause an origin group to fail over.
    */
  var StatusCodes: js.UndefOr[AwsCloudFrontDistributionOriginGroupFailoverStatusCodes] = js.native
}
object AwsCloudFrontDistributionOriginGroupFailover {
  
  @scala.inline
  def apply(): AwsCloudFrontDistributionOriginGroupFailover = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AwsCloudFrontDistributionOriginGroupFailover]
  }
  
  @scala.inline
  implicit class AwsCloudFrontDistributionOriginGroupFailoverOps[Self <: AwsCloudFrontDistributionOriginGroupFailover] (val x: Self) extends AnyVal {
    
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
    def setStatusCodes(value: AwsCloudFrontDistributionOriginGroupFailoverStatusCodes): Self = this.set("StatusCodes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStatusCodes: Self = this.set("StatusCodes", js.undefined)
  }
}
