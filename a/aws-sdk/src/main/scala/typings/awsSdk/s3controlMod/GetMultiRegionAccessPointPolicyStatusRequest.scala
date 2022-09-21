package typings.awsSdk.s3controlMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetMultiRegionAccessPointPolicyStatusRequest extends StObject {
  
  /**
    * The Amazon Web Services account ID for the owner of the Multi-Region Access Point.
    */
  var AccountId: typings.awsSdk.s3controlMod.AccountId
  
  /**
    * Specifies the Multi-Region Access Point. The name of the Multi-Region Access Point is different from the alias. For more information about the distinction between the name and the alias of an Multi-Region Access Point, see Managing Multi-Region Access Points in the Amazon S3 User Guide.
    */
  var Name: MultiRegionAccessPointName
}
object GetMultiRegionAccessPointPolicyStatusRequest {
  
  inline def apply(AccountId: AccountId, Name: MultiRegionAccessPointName): GetMultiRegionAccessPointPolicyStatusRequest = {
    val __obj = js.Dynamic.literal(AccountId = AccountId.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetMultiRegionAccessPointPolicyStatusRequest]
  }
  
  extension [Self <: GetMultiRegionAccessPointPolicyStatusRequest](x: Self) {
    
    inline def setAccountId(value: AccountId): Self = StObject.set(x, "AccountId", value.asInstanceOf[js.Any])
    
    inline def setName(value: MultiRegionAccessPointName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
  }
}
