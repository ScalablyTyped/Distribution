package typings.awsSdk.elastictranscoderMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReadPresetRequest extends StObject {
  
  /**
    * The identifier of the preset for which you want to get detailed information.
    */
  var Id: typings.awsSdk.elastictranscoderMod.Id
}
object ReadPresetRequest {
  
  @scala.inline
  def apply(Id: Id): ReadPresetRequest = {
    val __obj = js.Dynamic.literal(Id = Id.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReadPresetRequest]
  }
  
  @scala.inline
  implicit class ReadPresetRequestMutableBuilder[Self <: ReadPresetRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setId(value: Id): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
  }
}
