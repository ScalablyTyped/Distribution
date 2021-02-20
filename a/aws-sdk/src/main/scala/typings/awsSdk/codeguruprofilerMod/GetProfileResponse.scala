package typings.awsSdk.codeguruprofilerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetProfileResponse extends StObject {
  
  /**
    * The content encoding of the profile.
    */
  var contentEncoding: js.UndefOr[String] = js.native
  
  /**
    * The content type of the profile in the payload. It is either application/json or the default application/x-amzn-ion.
    */
  var contentType: String = js.native
  
  /**
    * Information about the profile.
    */
  var profile: AggregatedProfile = js.native
}
object GetProfileResponse {
  
  @scala.inline
  def apply(contentType: String, profile: AggregatedProfile): GetProfileResponse = {
    val __obj = js.Dynamic.literal(contentType = contentType.asInstanceOf[js.Any], profile = profile.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetProfileResponse]
  }
  
  @scala.inline
  implicit class GetProfileResponseMutableBuilder[Self <: GetProfileResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContentEncoding(value: String): Self = StObject.set(x, "contentEncoding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContentEncodingUndefined: Self = StObject.set(x, "contentEncoding", js.undefined)
    
    @scala.inline
    def setContentType(value: String): Self = StObject.set(x, "contentType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProfile(value: AggregatedProfile): Self = StObject.set(x, "profile", value.asInstanceOf[js.Any])
  }
}
