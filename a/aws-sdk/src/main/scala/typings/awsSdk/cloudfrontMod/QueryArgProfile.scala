package typings.awsSdk.cloudfrontMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait QueryArgProfile extends StObject {
  
  /**
    * ID of profile to use for field-level encryption query argument-profile mapping
    */
  var ProfileId: String = js.native
  
  /**
    * Query argument for field-level encryption query argument-profile mapping.
    */
  var QueryArg: String = js.native
}
object QueryArgProfile {
  
  @scala.inline
  def apply(ProfileId: String, QueryArg: String): QueryArgProfile = {
    val __obj = js.Dynamic.literal(ProfileId = ProfileId.asInstanceOf[js.Any], QueryArg = QueryArg.asInstanceOf[js.Any])
    __obj.asInstanceOf[QueryArgProfile]
  }
  
  @scala.inline
  implicit class QueryArgProfileMutableBuilder[Self <: QueryArgProfile] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setProfileId(value: String): Self = StObject.set(x, "ProfileId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQueryArg(value: String): Self = StObject.set(x, "QueryArg", value.asInstanceOf[js.Any])
  }
}
