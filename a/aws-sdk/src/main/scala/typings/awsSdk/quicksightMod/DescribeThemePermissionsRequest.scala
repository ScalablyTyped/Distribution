package typings.awsSdk.quicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeThemePermissionsRequest extends StObject {
  
  /**
    * The ID of the AWS account that contains the theme that you're describing.
    */
  var AwsAccountId: typings.awsSdk.quicksightMod.AwsAccountId = js.native
  
  /**
    * The ID for the theme that you want to describe permissions for.
    */
  var ThemeId: RestrictiveResourceId = js.native
}
object DescribeThemePermissionsRequest {
  
  @scala.inline
  def apply(AwsAccountId: AwsAccountId, ThemeId: RestrictiveResourceId): DescribeThemePermissionsRequest = {
    val __obj = js.Dynamic.literal(AwsAccountId = AwsAccountId.asInstanceOf[js.Any], ThemeId = ThemeId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeThemePermissionsRequest]
  }
  
  @scala.inline
  implicit class DescribeThemePermissionsRequestMutableBuilder[Self <: DescribeThemePermissionsRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAwsAccountId(value: AwsAccountId): Self = StObject.set(x, "AwsAccountId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThemeId(value: RestrictiveResourceId): Self = StObject.set(x, "ThemeId", value.asInstanceOf[js.Any])
  }
}
