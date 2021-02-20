package typings.awsSdk.mediatailorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetPlaybackConfigurationRequest extends StObject {
  
  /**
    * The identifier for the playback configuration.
    */
  var Name: string = js.native
}
object GetPlaybackConfigurationRequest {
  
  @scala.inline
  def apply(Name: string): GetPlaybackConfigurationRequest = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetPlaybackConfigurationRequest]
  }
  
  @scala.inline
  implicit class GetPlaybackConfigurationRequestMutableBuilder[Self <: GetPlaybackConfigurationRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: string): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
  }
}
