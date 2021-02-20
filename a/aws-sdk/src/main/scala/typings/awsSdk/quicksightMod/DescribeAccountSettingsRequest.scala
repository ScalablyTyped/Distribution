package typings.awsSdk.quicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeAccountSettingsRequest extends StObject {
  
  /**
    * The ID for the AWS account that contains the settings that you want to list.
    */
  var AwsAccountId: typings.awsSdk.quicksightMod.AwsAccountId = js.native
}
object DescribeAccountSettingsRequest {
  
  @scala.inline
  def apply(AwsAccountId: AwsAccountId): DescribeAccountSettingsRequest = {
    val __obj = js.Dynamic.literal(AwsAccountId = AwsAccountId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeAccountSettingsRequest]
  }
  
  @scala.inline
  implicit class DescribeAccountSettingsRequestMutableBuilder[Self <: DescribeAccountSettingsRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAwsAccountId(value: AwsAccountId): Self = StObject.set(x, "AwsAccountId", value.asInstanceOf[js.Any])
  }
}
