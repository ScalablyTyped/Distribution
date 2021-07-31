package typings.awsSdk.quicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateThemeResponse extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) for the theme.
    */
  var Arn: js.UndefOr[typings.awsSdk.quicksightMod.Arn] = js.undefined
  
  /**
    * The creation status of the theme.
    */
  var CreationStatus: js.UndefOr[ResourceStatus] = js.undefined
  
  /**
    * The AWS request ID for this operation.
    */
  var RequestId: js.UndefOr[String] = js.undefined
  
  /**
    * The HTTP status of the request.
    */
  var Status: js.UndefOr[StatusCode] = js.undefined
  
  /**
    * The ID for the theme.
    */
  var ThemeId: js.UndefOr[RestrictiveResourceId] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) for the new version of the theme.
    */
  var VersionArn: js.UndefOr[Arn] = js.undefined
}
object UpdateThemeResponse {
  
  @scala.inline
  def apply(): UpdateThemeResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateThemeResponse]
  }
  
  @scala.inline
  implicit class UpdateThemeResponseMutableBuilder[Self <: UpdateThemeResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setArn(value: Arn): Self = StObject.set(x, "Arn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArnUndefined: Self = StObject.set(x, "Arn", js.undefined)
    
    @scala.inline
    def setCreationStatus(value: ResourceStatus): Self = StObject.set(x, "CreationStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreationStatusUndefined: Self = StObject.set(x, "CreationStatus", js.undefined)
    
    @scala.inline
    def setRequestId(value: String): Self = StObject.set(x, "RequestId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequestIdUndefined: Self = StObject.set(x, "RequestId", js.undefined)
    
    @scala.inline
    def setStatus(value: StatusCode): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
    
    @scala.inline
    def setThemeId(value: RestrictiveResourceId): Self = StObject.set(x, "ThemeId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThemeIdUndefined: Self = StObject.set(x, "ThemeId", js.undefined)
    
    @scala.inline
    def setVersionArn(value: Arn): Self = StObject.set(x, "VersionArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersionArnUndefined: Self = StObject.set(x, "VersionArn", js.undefined)
  }
}
