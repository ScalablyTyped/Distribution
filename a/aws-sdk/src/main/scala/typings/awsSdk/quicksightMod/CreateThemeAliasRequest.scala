package typings.awsSdk.quicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateThemeAliasRequest extends StObject {
  
  /**
    * The name that you want to give to the theme alias that you are creating. The alias name can't begin with a $. Alias names that start with $ are reserved by Amazon QuickSight. 
    */
  var AliasName: typings.awsSdk.quicksightMod.AliasName
  
  /**
    * The ID of the AWS account that contains the theme for the new theme alias.
    */
  var AwsAccountId: typings.awsSdk.quicksightMod.AwsAccountId
  
  /**
    * An ID for the theme alias.
    */
  var ThemeId: RestrictiveResourceId
  
  /**
    * The version number of the theme.
    */
  var ThemeVersionNumber: VersionNumber
}
object CreateThemeAliasRequest {
  
  @scala.inline
  def apply(
    AliasName: AliasName,
    AwsAccountId: AwsAccountId,
    ThemeId: RestrictiveResourceId,
    ThemeVersionNumber: VersionNumber
  ): CreateThemeAliasRequest = {
    val __obj = js.Dynamic.literal(AliasName = AliasName.asInstanceOf[js.Any], AwsAccountId = AwsAccountId.asInstanceOf[js.Any], ThemeId = ThemeId.asInstanceOf[js.Any], ThemeVersionNumber = ThemeVersionNumber.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateThemeAliasRequest]
  }
  
  @scala.inline
  implicit class CreateThemeAliasRequestMutableBuilder[Self <: CreateThemeAliasRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAliasName(value: AliasName): Self = StObject.set(x, "AliasName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAwsAccountId(value: AwsAccountId): Self = StObject.set(x, "AwsAccountId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThemeId(value: RestrictiveResourceId): Self = StObject.set(x, "ThemeId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThemeVersionNumber(value: VersionNumber): Self = StObject.set(x, "ThemeVersionNumber", value.asInstanceOf[js.Any])
  }
}
