package typings.awsSdk.opsworksMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeMyUserProfileResult extends StObject {
  
  /**
    * A UserProfile object that describes the user's SSH information.
    */
  var UserProfile: js.UndefOr[SelfUserProfile] = js.undefined
}
object DescribeMyUserProfileResult {
  
  @scala.inline
  def apply(): DescribeMyUserProfileResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeMyUserProfileResult]
  }
  
  @scala.inline
  implicit class DescribeMyUserProfileResultMutableBuilder[Self <: DescribeMyUserProfileResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setUserProfile(value: SelfUserProfile): Self = StObject.set(x, "UserProfile", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserProfileUndefined: Self = StObject.set(x, "UserProfile", js.undefined)
  }
}
