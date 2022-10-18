package typings.awsSdk.clientsTransferMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeProfileRequest extends StObject {
  
  /**
    * The identifier of the profile that you want described.
    */
  var ProfileId: typings.awsSdk.clientsTransferMod.ProfileId
}
object DescribeProfileRequest {
  
  inline def apply(ProfileId: ProfileId): DescribeProfileRequest = {
    val __obj = js.Dynamic.literal(ProfileId = ProfileId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeProfileRequest]
  }
  
  extension [Self <: DescribeProfileRequest](x: Self) {
    
    inline def setProfileId(value: ProfileId): Self = StObject.set(x, "ProfileId", value.asInstanceOf[js.Any])
  }
}
