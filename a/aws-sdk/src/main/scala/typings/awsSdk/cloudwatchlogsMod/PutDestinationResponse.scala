package typings.awsSdk.cloudwatchlogsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PutDestinationResponse extends StObject {
  
  /**
    * The destination.
    */
  var destination: js.UndefOr[Destination] = js.undefined
}
object PutDestinationResponse {
  
  inline def apply(): PutDestinationResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PutDestinationResponse]
  }
  
  extension [Self <: PutDestinationResponse](x: Self) {
    
    inline def setDestination(value: Destination): Self = StObject.set(x, "destination", value.asInstanceOf[js.Any])
    
    inline def setDestinationUndefined: Self = StObject.set(x, "destination", js.undefined)
  }
}
