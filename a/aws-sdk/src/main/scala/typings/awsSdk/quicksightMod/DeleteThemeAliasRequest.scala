package typings.awsSdk.quicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeleteThemeAliasRequest extends StObject {
  
  /**
    * The unique name for the theme alias to delete.
    */
  var AliasName: typings.awsSdk.quicksightMod.AliasName = js.native
  
  /**
    * The ID of the AWS account that contains the theme alias to delete.
    */
  var AwsAccountId: typings.awsSdk.quicksightMod.AwsAccountId = js.native
  
  /**
    * The ID for the theme that the specified alias is for.
    */
  var ThemeId: RestrictiveResourceId = js.native
}
object DeleteThemeAliasRequest {
  
  @scala.inline
  def apply(AliasName: AliasName, AwsAccountId: AwsAccountId, ThemeId: RestrictiveResourceId): DeleteThemeAliasRequest = {
    val __obj = js.Dynamic.literal(AliasName = AliasName.asInstanceOf[js.Any], AwsAccountId = AwsAccountId.asInstanceOf[js.Any], ThemeId = ThemeId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteThemeAliasRequest]
  }
  
  @scala.inline
  implicit class DeleteThemeAliasRequestMutableBuilder[Self <: DeleteThemeAliasRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAliasName(value: AliasName): Self = StObject.set(x, "AliasName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAwsAccountId(value: AwsAccountId): Self = StObject.set(x, "AwsAccountId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThemeId(value: RestrictiveResourceId): Self = StObject.set(x, "ThemeId", value.asInstanceOf[js.Any])
  }
}
