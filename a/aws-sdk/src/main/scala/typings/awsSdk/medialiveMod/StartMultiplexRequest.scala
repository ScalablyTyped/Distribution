package typings.awsSdk.medialiveMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StartMultiplexRequest extends StObject {
  
  /**
    * The ID of the multiplex.
    */
  var MultiplexId: string
}
object StartMultiplexRequest {
  
  @scala.inline
  def apply(MultiplexId: string): StartMultiplexRequest = {
    val __obj = js.Dynamic.literal(MultiplexId = MultiplexId.asInstanceOf[js.Any])
    __obj.asInstanceOf[StartMultiplexRequest]
  }
  
  @scala.inline
  implicit class StartMultiplexRequestMutableBuilder[Self <: StartMultiplexRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMultiplexId(value: string): Self = StObject.set(x, "MultiplexId", value.asInstanceOf[js.Any])
  }
}
