package typings.awsSdk.quicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeThemeRequest extends StObject {
  
  /**
    * The alias of the theme that you want to describe. If you name a specific alias, you describe the version that the alias points to. You can specify the latest version of the theme by providing the keyword $LATEST in the AliasName parameter. The keyword $PUBLISHED doesn't apply to themes.
    */
  var AliasName: js.UndefOr[typings.awsSdk.quicksightMod.AliasName] = js.undefined
  
  /**
    * The ID of the AWS account that contains the theme that you're describing.
    */
  var AwsAccountId: AwsAndAccountId
  
  /**
    * The ID for the theme.
    */
  var ThemeId: RestrictiveResourceId
  
  /**
    * The version number for the version to describe. If a VersionNumber parameter value isn't provided, the latest version of the theme is described.
    */
  var VersionNumber: js.UndefOr[typings.awsSdk.quicksightMod.VersionNumber] = js.undefined
}
object DescribeThemeRequest {
  
  @scala.inline
  def apply(AwsAccountId: AwsAndAccountId, ThemeId: RestrictiveResourceId): DescribeThemeRequest = {
    val __obj = js.Dynamic.literal(AwsAccountId = AwsAccountId.asInstanceOf[js.Any], ThemeId = ThemeId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeThemeRequest]
  }
  
  @scala.inline
  implicit class DescribeThemeRequestMutableBuilder[Self <: DescribeThemeRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAliasName(value: AliasName): Self = StObject.set(x, "AliasName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAliasNameUndefined: Self = StObject.set(x, "AliasName", js.undefined)
    
    @scala.inline
    def setAwsAccountId(value: AwsAndAccountId): Self = StObject.set(x, "AwsAccountId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThemeId(value: RestrictiveResourceId): Self = StObject.set(x, "ThemeId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersionNumber(value: VersionNumber): Self = StObject.set(x, "VersionNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersionNumberUndefined: Self = StObject.set(x, "VersionNumber", js.undefined)
  }
}
