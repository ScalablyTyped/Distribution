package typings.awsSdk.rekognitionMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StopStreamProcessorRequest extends StObject {
  
  /**
    * The name of a stream processor created by CreateStreamProcessor.
    */
  var Name: StreamProcessorName = js.native
}
object StopStreamProcessorRequest {
  
  @scala.inline
  def apply(Name: StreamProcessorName): StopStreamProcessorRequest = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[StopStreamProcessorRequest]
  }
  
  @scala.inline
  implicit class StopStreamProcessorRequestMutableBuilder[Self <: StopStreamProcessorRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: StreamProcessorName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
  }
}
