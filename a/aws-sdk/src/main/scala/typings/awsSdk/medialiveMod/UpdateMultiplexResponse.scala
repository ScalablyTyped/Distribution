package typings.awsSdk.medialiveMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateMultiplexResponse extends StObject {
  
  /**
    * The updated multiplex.
    */
  var Multiplex: js.UndefOr[typings.awsSdk.medialiveMod.Multiplex] = js.undefined
}
object UpdateMultiplexResponse {
  
  inline def apply(): UpdateMultiplexResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateMultiplexResponse]
  }
  
  extension [Self <: UpdateMultiplexResponse](x: Self) {
    
    inline def setMultiplex(value: Multiplex): Self = StObject.set(x, "Multiplex", value.asInstanceOf[js.Any])
    
    inline def setMultiplexUndefined: Self = StObject.set(x, "Multiplex", js.undefined)
  }
}
