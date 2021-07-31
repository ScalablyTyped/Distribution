package typings.awsSdk.quicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeThemeAliasRequest extends StObject {
  
  /**
    * The name of the theme alias that you want to describe.
    */
  var AliasName: typings.awsSdk.quicksightMod.AliasName
  
  /**
    * The ID of the AWS account that contains the theme alias that you're describing.
    */
  var AwsAccountId: typings.awsSdk.quicksightMod.AwsAccountId
  
  /**
    * The ID for the theme.
    */
  var ThemeId: RestrictiveResourceId
}
object DescribeThemeAliasRequest {
  
  @scala.inline
  def apply(AliasName: AliasName, AwsAccountId: AwsAccountId, ThemeId: RestrictiveResourceId): DescribeThemeAliasRequest = {
    val __obj = js.Dynamic.literal(AliasName = AliasName.asInstanceOf[js.Any], AwsAccountId = AwsAccountId.asInstanceOf[js.Any], ThemeId = ThemeId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeThemeAliasRequest]
  }
  
  @scala.inline
  implicit class DescribeThemeAliasRequestMutableBuilder[Self <: DescribeThemeAliasRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAliasName(value: AliasName): Self = StObject.set(x, "AliasName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAwsAccountId(value: AwsAccountId): Self = StObject.set(x, "AwsAccountId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThemeId(value: RestrictiveResourceId): Self = StObject.set(x, "ThemeId", value.asInstanceOf[js.Any])
  }
}
