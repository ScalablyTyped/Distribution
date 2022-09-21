package typings.awsSdk.transferMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeProfileResponse extends StObject {
  
  /**
    * The details of the specified profile, returned as an object.
    */
  var Profile: DescribedProfile
}
object DescribeProfileResponse {
  
  inline def apply(Profile: DescribedProfile): DescribeProfileResponse = {
    val __obj = js.Dynamic.literal(Profile = Profile.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeProfileResponse]
  }
  
  extension [Self <: DescribeProfileResponse](x: Self) {
    
    inline def setProfile(value: DescribedProfile): Self = StObject.set(x, "Profile", value.asInstanceOf[js.Any])
  }
}
