package typings.awsSdk.securityhubMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AwsCloudFrontDistributionOriginGroup extends js.Object {
  
  /**
    * Provides the criteria for an origin group to fail over.
    */
  var FailoverCriteria: js.UndefOr[AwsCloudFrontDistributionOriginGroupFailover] = js.native
}
object AwsCloudFrontDistributionOriginGroup {
  
  @scala.inline
  def apply(): AwsCloudFrontDistributionOriginGroup = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AwsCloudFrontDistributionOriginGroup]
  }
  
  @scala.inline
  implicit class AwsCloudFrontDistributionOriginGroupOps[Self <: AwsCloudFrontDistributionOriginGroup] (val x: Self) extends AnyVal {
    
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
    def setFailoverCriteria(value: AwsCloudFrontDistributionOriginGroupFailover): Self = this.set("FailoverCriteria", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFailoverCriteria: Self = this.set("FailoverCriteria", js.undefined)
  }
}
