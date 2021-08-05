package typings.awsSdk.supportMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TrustedAdvisorResourceDetail extends StObject {
  
  /**
    * Specifies whether the AWS resource was ignored by Trusted Advisor because it was marked as suppressed by the user.
    */
  var isSuppressed: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Additional information about the identified resource. The exact metadata and its order can be obtained by inspecting the TrustedAdvisorCheckDescription object returned by the call to DescribeTrustedAdvisorChecks. Metadata contains all the data that is shown in the Excel download, even in those cases where the UI shows just summary data.
    */
  var metadata: StringList
  
  /**
    * The AWS region in which the identified resource is located.
    */
  var region: js.UndefOr[String] = js.undefined
  
  /**
    * The unique identifier for the identified resource.
    */
  var resourceId: String
  
  /**
    * The status code for the resource identified in the Trusted Advisor check.
    */
  var status: String
}
object TrustedAdvisorResourceDetail {
  
  inline def apply(metadata: StringList, resourceId: String, status: String): TrustedAdvisorResourceDetail = {
    val __obj = js.Dynamic.literal(metadata = metadata.asInstanceOf[js.Any], resourceId = resourceId.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[TrustedAdvisorResourceDetail]
  }
  
  extension [Self <: TrustedAdvisorResourceDetail](x: Self) {
    
    inline def setIsSuppressed(value: Boolean): Self = StObject.set(x, "isSuppressed", value.asInstanceOf[js.Any])
    
    inline def setIsSuppressedUndefined: Self = StObject.set(x, "isSuppressed", js.undefined)
    
    inline def setMetadata(value: StringList): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
    
    inline def setMetadataVarargs(value: String*): Self = StObject.set(x, "metadata", js.Array(value :_*))
    
    inline def setRegion(value: String): Self = StObject.set(x, "region", value.asInstanceOf[js.Any])
    
    inline def setRegionUndefined: Self = StObject.set(x, "region", js.undefined)
    
    inline def setResourceId(value: String): Self = StObject.set(x, "resourceId", value.asInstanceOf[js.Any])
    
    inline def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
  }
}
