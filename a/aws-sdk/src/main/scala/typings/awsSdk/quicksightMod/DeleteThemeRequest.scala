package typings.awsSdk.quicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteThemeRequest extends StObject {
  
  /**
    * The ID of the AWS account that contains the theme that you're deleting.
    */
  var AwsAccountId: typings.awsSdk.quicksightMod.AwsAccountId
  
  /**
    * An ID for the theme that you want to delete.
    */
  var ThemeId: RestrictiveResourceId
  
  /**
    * The version of the theme that you want to delete.   Note: If you don't provide a version number, you're using this call to DeleteTheme to delete all versions of the theme.
    */
  var VersionNumber: js.UndefOr[typings.awsSdk.quicksightMod.VersionNumber] = js.undefined
}
object DeleteThemeRequest {
  
  @scala.inline
  def apply(AwsAccountId: AwsAccountId, ThemeId: RestrictiveResourceId): DeleteThemeRequest = {
    val __obj = js.Dynamic.literal(AwsAccountId = AwsAccountId.asInstanceOf[js.Any], ThemeId = ThemeId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteThemeRequest]
  }
  
  @scala.inline
  implicit class DeleteThemeRequestMutableBuilder[Self <: DeleteThemeRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAwsAccountId(value: AwsAccountId): Self = StObject.set(x, "AwsAccountId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThemeId(value: RestrictiveResourceId): Self = StObject.set(x, "ThemeId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersionNumber(value: VersionNumber): Self = StObject.set(x, "VersionNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersionNumberUndefined: Self = StObject.set(x, "VersionNumber", js.undefined)
  }
}
