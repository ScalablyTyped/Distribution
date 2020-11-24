package typings.awsSdk.codeguruprofilerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetProfileResponse extends js.Object {
  
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
  implicit class GetProfileResponseOps[Self <: GetProfileResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setContentType(value: String): Self = this.set("contentType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProfile(value: AggregatedProfile): Self = this.set("profile", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContentEncoding(value: String): Self = this.set("contentEncoding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContentEncoding: Self = this.set("contentEncoding", js.undefined)
  }
}
