package typings.awsSdk.mediatailorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeletePlaybackConfigurationRequest extends StObject {
  
  /**
    * The identifier for the playback configuration.
    */
  var Name: string
}
object DeletePlaybackConfigurationRequest {
  
  @scala.inline
  def apply(Name: string): DeletePlaybackConfigurationRequest = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeletePlaybackConfigurationRequest]
  }
  
  @scala.inline
  implicit class DeletePlaybackConfigurationRequestMutableBuilder[Self <: DeletePlaybackConfigurationRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: string): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
  }
}
