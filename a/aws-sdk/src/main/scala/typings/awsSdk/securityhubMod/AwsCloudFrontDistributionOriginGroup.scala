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
  
  inline def apply(): AwsCloudFrontDistributionOriginGroup = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AwsCloudFrontDistributionOriginGroup]
  }
  
  extension [Self <: AwsCloudFrontDistributionOriginGroup](x: Self) {
    
    inline def setFailoverCriteria(value: AwsCloudFrontDistributionOriginGroupFailover): Self = StObject.set(x, "FailoverCriteria", value.asInstanceOf[js.Any])
    
    inline def setFailoverCriteriaUndefined: Self = StObject.set(x, "FailoverCriteria", js.undefined)
  }
}
