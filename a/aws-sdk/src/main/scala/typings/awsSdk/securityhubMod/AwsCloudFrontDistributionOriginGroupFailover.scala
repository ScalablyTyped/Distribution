package typings.awsSdk.securityhubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AwsCloudFrontDistributionOriginGroupFailover extends StObject {
  
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
  implicit class AwsCloudFrontDistributionOriginGroupFailoverMutableBuilder[Self <: AwsCloudFrontDistributionOriginGroupFailover] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setStatusCodes(value: AwsCloudFrontDistributionOriginGroupFailoverStatusCodes): Self = StObject.set(x, "StatusCodes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusCodesUndefined: Self = StObject.set(x, "StatusCodes", js.undefined)
  }
}
