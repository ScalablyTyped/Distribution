package typings.awsSdk.resiliencehubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeAppVersionResourcesResolutionStatusResponse extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the application. The format for this ARN is: arn:partition:resiliencehub:region:account:app/app-id. For more information about ARNs, see  Amazon Resource Names (ARNs) in the AWS General Reference.
    */
  var appArn: Arn
  
  /**
    * The version of the application.
    */
  var appVersion: EntityVersion
  
  /**
    * The returned error message for the request.
    */
  var errorMessage: js.UndefOr[String500] = js.undefined
  
  /**
    * The identifier for a specific resolution.
    */
  var resolutionId: String255
  
  /**
    * The status of the action.
    */
  var status: ResourceResolutionStatusType
}
object DescribeAppVersionResourcesResolutionStatusResponse {
  
  inline def apply(
    appArn: Arn,
    appVersion: EntityVersion,
    resolutionId: String255,
    status: ResourceResolutionStatusType
  ): DescribeAppVersionResourcesResolutionStatusResponse = {
    val __obj = js.Dynamic.literal(appArn = appArn.asInstanceOf[js.Any], appVersion = appVersion.asInstanceOf[js.Any], resolutionId = resolutionId.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeAppVersionResourcesResolutionStatusResponse]
  }
  
  extension [Self <: DescribeAppVersionResourcesResolutionStatusResponse](x: Self) {
    
    inline def setAppArn(value: Arn): Self = StObject.set(x, "appArn", value.asInstanceOf[js.Any])
    
    inline def setAppVersion(value: EntityVersion): Self = StObject.set(x, "appVersion", value.asInstanceOf[js.Any])
    
    inline def setErrorMessage(value: String500): Self = StObject.set(x, "errorMessage", value.asInstanceOf[js.Any])
    
    inline def setErrorMessageUndefined: Self = StObject.set(x, "errorMessage", js.undefined)
    
    inline def setResolutionId(value: String255): Self = StObject.set(x, "resolutionId", value.asInstanceOf[js.Any])
    
    inline def setStatus(value: ResourceResolutionStatusType): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
  }
}
