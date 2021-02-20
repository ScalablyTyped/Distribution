package typings.awsSdk.rekognitionMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StreamProcessor extends StObject {
  
  /**
    * Name of the Amazon Rekognition stream processor. 
    */
  var Name: js.UndefOr[StreamProcessorName] = js.native
  
  /**
    * Current status of the Amazon Rekognition stream processor.
    */
  var Status: js.UndefOr[StreamProcessorStatus] = js.native
}
object StreamProcessor {
  
  @scala.inline
  def apply(): StreamProcessor = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StreamProcessor]
  }
  
  @scala.inline
  implicit class StreamProcessorMutableBuilder[Self <: StreamProcessor] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: StreamProcessorName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    @scala.inline
    def setStatus(value: StreamProcessorStatus): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
  }
}
