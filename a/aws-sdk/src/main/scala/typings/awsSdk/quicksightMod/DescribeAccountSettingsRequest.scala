package typings.awsSdk.quicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeAccountSettingsRequest extends StObject {
  
  /**
    * The ID for the Amazon Web Services account that contains the settings that you want to list.
    */
  var AwsAccountId: typings.awsSdk.quicksightMod.AwsAccountId
}
object DescribeAccountSettingsRequest {
  
  inline def apply(AwsAccountId: AwsAccountId): DescribeAccountSettingsRequest = {
    val __obj = js.Dynamic.literal(AwsAccountId = AwsAccountId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeAccountSettingsRequest]
  }
  
  extension [Self <: DescribeAccountSettingsRequest](x: Self) {
    
    inline def setAwsAccountId(value: AwsAccountId): Self = StObject.set(x, "AwsAccountId", value.asInstanceOf[js.Any])
  }
}
