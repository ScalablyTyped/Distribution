package typings.awsSdk.mediapackageMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HlsIngest extends StObject {
  
  /**
    * A list of endpoints to which the source stream should be sent.
    */
  var IngestEndpoints: js.UndefOr[listOfIngestEndpoint] = js.undefined
}
object HlsIngest {
  
  @scala.inline
  def apply(): HlsIngest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HlsIngest]
  }
  
  @scala.inline
  implicit class HlsIngestMutableBuilder[Self <: HlsIngest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIngestEndpoints(value: listOfIngestEndpoint): Self = StObject.set(x, "IngestEndpoints", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIngestEndpointsUndefined: Self = StObject.set(x, "IngestEndpoints", js.undefined)
    
    @scala.inline
    def setIngestEndpointsVarargs(value: IngestEndpoint*): Self = StObject.set(x, "IngestEndpoints", js.Array(value :_*))
  }
}
