package typings.awsSdk.mediaconvertMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetPresetRequest extends StObject {
  
  /**
    * The name of the preset.
    */
  var Name: string
}
object GetPresetRequest {
  
  @scala.inline
  def apply(Name: string): GetPresetRequest = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetPresetRequest]
  }
  
  @scala.inline
  implicit class GetPresetRequestMutableBuilder[Self <: GetPresetRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: string): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
  }
}
