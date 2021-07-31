package typings.awsSdk.securityhubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AwsCloudFrontDistributionOriginGroup extends StObject {
  
  /**
    * Provides the criteria for an origin group to fail over.
    */
  var FailoverCriteria: js.UndefOr[AwsCloudFrontDistributionOriginGroupFailover] = js.undefined
}
object AwsCloudFrontDistributionOriginGroup {
  
  @scala.inline
  def apply(): AwsCloudFrontDistributionOriginGroup = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AwsCloudFrontDistributionOriginGroup]
  }
  
  @scala.inline
  implicit class AwsCloudFrontDistributionOriginGroupMutableBuilder[Self <: AwsCloudFrontDistributionOriginGroup] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFailoverCriteria(value: AwsCloudFrontDistributionOriginGroupFailover): Self = StObject.set(x, "FailoverCriteria", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFailoverCriteriaUndefined: Self = StObject.set(x, "FailoverCriteria", js.undefined)
  }
}
